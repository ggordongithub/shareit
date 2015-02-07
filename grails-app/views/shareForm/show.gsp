

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'shareForm.label', default: 'ShareForm')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-shareForm" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-shareForm" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list shareForm">
			
				<g:if test="${shareFormInstance?.greet}">
				<li class="fieldcontain">
					<span id="greet-label" class="property-label"><g:message code="shareForm.greet.label" default="Greet" /></span>
					
						<span class="property-value" aria-labelledby="greet-label"><g:fieldValue bean="${shareFormInstance}" field="greet"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shareFormInstance?.middle}">
				<li class="fieldcontain">
					<span id="middle-label" class="property-label"><g:message code="shareForm.middle.label" default="Middle" /></span>
					
						<span class="property-value" aria-labelledby="middle-label"><g:fieldValue bean="${shareFormInstance}" field="middle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shareFormInstance?.end}">
				<li class="fieldcontain">
					<span id="end-label" class="property-label"><g:message code="shareForm.end.label" default="End" /></span>
					
						<span class="property-value" aria-labelledby="end-label"><g:fieldValue bean="${shareFormInstance}" field="end"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shareFormInstance?.employee}">
				<li class="fieldcontain">
					<span id="employee-label" class="property-label"><g:message code="shareForm.employee.label" default="Employee" /></span>
					
						<span class="property-value" aria-labelledby="employee-label"><g:link controller="employee" action="show" id="${shareFormInstance?.employee?.id}">${shareFormInstance?.employee?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${shareFormInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="shareForm.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${shareFormInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:shareFormInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${shareFormInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
