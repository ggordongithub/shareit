

<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'share.label', default: 'Share')}" />
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
}
</style>
</head>
<body>
	<a href="#list-share" class="skip" tabindex="-1"><g:message
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
	<div id="list-share" class="content scaffold-list" role="main">
		<H2>
			<%--			<g:message code="default.list.label" args="[entityName]" />--%>
			update [Email To] field and send your reference to clients/employers
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
						title="${message(code: 'share.companyName.label', default: 'Company <br> Name')}" />

					<g:sortableColumn property="referenceAuthor"
						title="${message(code: 'share.referenceAuthor.label', default: 'Reference <br> Author')}" />

					<g:sortableColumn property="createdDate"
						title="${message(code: 'share.createdDate.label', default: 'Created Date')}" />

					<g:sortableColumn property="emailTo"
						title="${message(code: 'share.emailTo.label', default: 'Email To')}" />

					<g:sortableColumn property="referenceCompleted"
						title="${message(code: 'share.referenceCompleted.label', default: 'Reference <br> Completed')}" />

					<g:sortableColumn property="deactivateReference"
						title="${message(code: 'share.deactivateReference.label', default: 'Deactivate <br> Reference')}" />

					<g:sortableColumn property="clickToShareReference"
						title="Click To Share Reference" />

				</tr>
			</thead>
			<g:javascript>
				function updateButtonName(btn_name){
				   console.log("#s_button_" + btn_name);
				   console.log("#email_input_" + btn_name);
				   var email_value = $("#email_input_" + btn_name).val();
				   jConfirm("Are you sure you want to send your references to: " + email_value + "?", 'Confirmation Dialog', function(r) {
                      if (r) {
                             jAlert("Ok Reference Request Email Sent To: " + email_value );
                      } else {
                            jAlert("Ok Email Request Cancelled" );
                             //reloads page when cancelled is pressed, this resets buttons
                             location.reload();
                      }
                   });
				   //jAlert("Are you sure you want to send your reference to: " + email_value + " ?");
				   //$("#s_button_" + btn_name).css("background", "green", "color", "white");
				   //$("#s_button_" + btn_name).css("color", "white");
				   $("#s_button_" + btn_name).text("Send New Request");
				   //$("#s_button_" + btn_name).addClass("btn btn-primary btn-lg");
				   $("#email_input_" + btn_name).val("");
				}
				</g:javascript>
			<tbody>
				<g:each in="${shareInstanceList}" status="i" var="shareInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${shareInstance.id}">
								${fieldValue(bean: shareInstance, field: "companyName")}
							</g:link></td>

						<td>
							${fieldValue(bean: shareInstance, field: "referenceAuthor")}
						</td>

						<td><g:formatDate date="${shareInstance.createdDate}" /></td>

						<%-- <td>${fieldValue(bean: shareInstance, field: "emailTo")}</td>--%>
						<td><input id="email_input_${i}" type="text"
							style="font-size: 12px; height: 30px; width: 170px;"
							value="ex: ceo_john@google.hr.com" onclick="this.value = ''" /></td>
						<td>
							${fieldValue(bean: shareInstance, field: "referenceCompleted")}
						</td>

						<td><g:formatBoolean
								boolean="${shareInstance.deactivateReference}" /></td>

						<td><button type="button" class="btn btn-primary btn-lg"
								id="s_button_${i}" onclick="updateButtonName(${i})"
								style="height: 50px; width: 160px; font-size: 14px;">Share
								Reference</button></td>

					</tr>
				</g:each>
			</tbody>
		</table>
		<div class="pagination">
			<g:paginate total="${shareInstanceCount ?: 0}" />
		</div>
	</div>
</body>
</html>
