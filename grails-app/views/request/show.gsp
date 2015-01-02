

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'request.label', default: 'Request')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-request" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-request" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list request">
			
				<g:if test="${requestInstance?.companyName}">
				<li class="fieldcontain">
					<span id="companyName-label" class="property-label"><g:message code="request.companyName.label" default="Company Name" /></span>
					
						<span class="property-value" aria-labelledby="companyName-label"><g:fieldValue bean="${requestInstance}" field="companyName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${requestInstance?.sentOrReceivedDate}">
				<li class="fieldcontain">
					<span id="sentOrReceivedDate-label" class="property-label"><g:message code="request.sentOrReceivedDate.label" default="Sent Or Received Date" /></span>
					
						<span class="property-value" aria-labelledby="sentOrReceivedDate-label"><g:formatDate date="${requestInstance?.sentOrReceivedDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${requestInstance?.requestForReferenceEmail}">
				<li class="fieldcontain">
					<span id="requestForReferenceEmail-label" class="property-label"><g:message code="request.requestForReferenceEmail.label" default="Request For Reference Email" /></span>
					
						<span class="property-value" aria-labelledby="requestForReferenceEmail-label"><g:fieldValue bean="${requestInstance}" field="requestForReferenceEmail"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${requestInstance?.referenceReceived}">
				<li class="fieldcontain">
					<span id="referenceReceived-label" class="property-label"><g:message code="request.referenceReceived.label" default="Reference Received" /></span>
					
						<span class="property-value" aria-labelledby="referenceReceived-label"><g:formatBoolean boolean="${requestInstance?.referenceReceived}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:requestInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${requestInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
