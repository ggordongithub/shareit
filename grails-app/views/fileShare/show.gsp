

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'fileShare.label', default: 'FileShare')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-fileShare" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-fileShare" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list fileShare">
			
				<g:if test="${fileShareInstance?.filePayload}">
				<li class="fieldcontain">
					<span id="filePayload-label" class="property-label"><g:message code="fileShare.filePayload.label" default="File Payload" /></span>
					<span class="property-value" aria-labelledby="filePayload-label"><img src="${createLink(controller:'fileShare', action:'showPayload', id:"${fileShareInstance.id}" )}" width='300' height="300" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${fileShareInstance?.fileType}">
				<li class="fieldcontain">
					<span id="fileType-label" class="property-label"><g:message code="fileShare.fileType.label" default="File Type" /></span>
					<span class="property-value" aria-labelledby="fileType-label"><g:fieldValue bean="${fileShareInstance}" field="fileType"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fileShareInstance?.fileName}">
				<li class="fieldcontain">
					<span id="fileName-label" class="property-label"><g:message code="fileShare.fileName.label" default="File Name" /></span>
					
						<span class="property-value" aria-labelledby="fileName-label"><g:fieldValue bean="${fileShareInstance}" field="fileName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${fileShareInstance?.photo}">
				<li class="fieldcontain">
					<span id="photo-label" class="property-label"><g:message code="fileShare.photo.label" default="Photo" /></span>
					
						<span class="property-value" aria-labelledby="photo-label"><g:formatBoolean boolean="${fileShareInstance?.photo}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:fileShareInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${fileShareInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
