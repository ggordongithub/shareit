

<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'request.label', default: 'Request')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>
<style type="text/css" media="screen">

body {
 margin: 0 auto;
}

td {
	height: 7em;
	vertical-align: middle;
}

table, H2 {
	margin: 0 auto;
	max-width: 95%;
	padding: 15px;
	text-align: center;
}
</style>
</head>
<body>
	<a href="#list-request" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="create" action="create">
					<g:message code="default.new.label" args="[entityName]" />
				</g:link></li>
		</ul>
	</div>
	<div id="list-request" class="content scaffold-list" role="main">
		<H2>
			<%--			<g:message code="default.list.label" args="[entityName]" />--%>
			Update Request for Reference Email and Company Name Fields to send a reference request
			to clients/employers
		</H2>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<table>
			<thead>
				<tr>

					<g:sortableColumn property="companyName"
						title="${message(code: 'request.companyName.label', default: 'Company <br> Name')}" />

<%--					<g:sortableColumn property="sentOrReceivedDate"--%>
<%--						title="${message(code: 'request.sentOrReceivedDate.label', default: 'Received Date')}" />--%>

					<g:sortableColumn property="requestForReferenceEmail"
						title="${message(code: 'request.requestForReferenceEmail.label', default: 'Request For <br> Reference Email')}" />

<%--					<g:sortableColumn property="referenceReceived"--%>
<%--						title="${message(code: 'request.referenceReceived.label', default: 'Reference Received')}" />--%>

					<g:sortableColumn property="clickToSendReferenceRequest"
						title='Click To Send Reference Request' />

					<g:sortableColumn property="Request History"
						title='Request History' />

				</tr>
			</thead>
			<g:javascript>
				function updateButtonName(btn_name){
				   console.log("#r_button_" + btn_name);
				   var email_value = $("#r_email_input_" + btn_name).val();
				   var company_value = $("#company_input_" + btn_name).val();
				   jConfirm("Are you sure you want to send your references to: " + email_value +  " for company name, "+ company_value + "?", 'Confirmation Dialog', function(r) {
                          if (r) {
                             jAlert("Ok Reference Request Email Sent To: " + email_value );
                          } else {
                             jAlert("Ok Email Request Cancelled" );
                             //reloads page when cancelled is pressed, this resets buttons
                             location.reload();
                          }
                   });
				   $("#r_button_" + btn_name).css("background", "green", "color", "white");
				   $("#r_button_" + btn_name).css("color", "white");
				   $("#r_button_" + btn_name).text("Send New Request");
				   //$("#r_button_" + btn_name).addClass("btn btn-primary btn-lg");
				   $("#r_email_input_" + btn_name).val("");
				   $("#company_input_" + btn_name).val("");
				}
				
				function redirect(name) {
				   jConfirm("Are you sure you want to leave this page?", 'Confirmation Dialog', function(a) {
                          if (a) {
                             jAlert("Ok redirecting to request history");
                             window.location.href=name;
                          } else {
                             jAlert("View Request Cancelled" );
                             //reloads page when cancelled is pressed, this resets buttons
                             location.reload();
                          }
                   });
				}
				
				</g:javascript>
			<tbody>
				<g:each in="${requestInstanceList}" status="i" var="requestInstance">
					<tr style="line-height: 10em;"
						class="${(i % 2) == 0 ? 'even' : 'odd'}">
						
						<td><input id="company_input_${i}" type="text"
							style="font-size: 12px; height: 30px; width: 250px; margin-right: 0;"
							value="Enter Company Name etc: Page Inc" onclick="this.value = ''" /></td>

<%--						<td><g:link action="show" id="${requestInstance.id}">--%>
<%--								${fieldValue(bean: requestInstance, field: "companyName")}--%>
<%--							</g:link></td>--%>

<%--						<td><g:formatDate--%>
<%--								date="${requestInstance.sentOrReceivedDate}" /></td>--%>

						<%--<td>${fieldValue(bean: requestInstance, field: "requestForReferenceEmail")}</td>--%>
						<td><input id="r_email_input_${i}" type="text"
							style="font-size: 12px; height: 30px; width: 170px; margin-right: 0;"
							value="ex: mark@premierinc.com" onclick="this.value = ''" /></td>
<%--						<td><g:formatBoolean--%>
<%--								boolean="${requestInstance.referenceReceived}" /></td>--%>

						<td><button type="button" class="btn btn-primary btn-lg"
								style="height: 50px; width: 160px; font-size: 14px;"
								id="r_button_${i}" onclick="updateButtonName(${i})">Request
								REF</button></td>

						<td><button type="button" class="btn btn-primary btn-lg"
								style="height: 50px; width: 160px; font-size: 14px;"
								id="v_button_${i}" onclick="redirect('share/operate')">
								View Your Ref History</button></td>
							
					</tr>
				</g:each>
			</tbody>
		</table>
	</div>
</body>
</html>
