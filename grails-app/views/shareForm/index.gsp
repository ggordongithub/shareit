

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'shareForm.label', default: 'ShareForm')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-shareForm" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-shareForm" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="greet" title="${message(code: 'shareForm.greet.label', default: 'Greet')}" />
					
						<g:sortableColumn property="middle" title="${message(code: 'shareForm.middle.label', default: 'Middle')}" />
					
						<g:sortableColumn property="end" title="${message(code: 'shareForm.end.label', default: 'End')}" />
					
						<th><g:message code="shareForm.employee.label" default="Employee" /></th>
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'shareForm.lastUpdated.label', default: 'Last Updated')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${shareFormInstanceList}" status="i" var="shareFormInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${shareFormInstance.id}">${fieldValue(bean: shareFormInstance, field: "greet")}</g:link></td>
					
						<td>${fieldValue(bean: shareFormInstance, field: "middle")}</td>
					
						<td>${fieldValue(bean: shareFormInstance, field: "end")}</td>
					
						<td>${fieldValue(bean: shareFormInstance, field: "employee")}</td>
					
						<td><g:formatDate date="${shareFormInstance.lastUpdated}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${shareFormInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
