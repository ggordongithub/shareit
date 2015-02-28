

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'fileShare.label', default: 'FileShare')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-fileShare" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-fileShare" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="filePayload" title="${message(code: 'fileShare.filePayload.label', default: 'File Payload')}" />
					
						<g:sortableColumn property="fileType" title="${message(code: 'fileShare.fileType.label', default: 'File Type')}" />
					
						<g:sortableColumn property="fileName" title="${message(code: 'fileShare.fileName.label', default: 'File Name')}" />
					
						<g:sortableColumn property="photo" title="${message(code: 'fileShare.photo.label', default: 'Photo')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${fileShareInstanceList}" status="i" var="fileShareInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><p><g:link action="show" id="${fileShareInstance.id}"><img style="display: block; margin-left: auto; margin-right: auto;" src="${createLink(controller:'fileShare', action:'showPayload', id:"${fileShareInstance.id}" )}" width='100' height="100" /></g:link></p></td>
					
						<td>${fieldValue(bean: fileShareInstance, field: "fileType")}</td>
					
						<td>${fieldValue(bean: fileShareInstance, field: "fileName")}</td>
					
						<td><g:formatBoolean boolean="${fileShareInstance.photo}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${fileShareInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
