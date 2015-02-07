

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'requestForm.label', default: 'RequestForm')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-requestForm" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-requestForm" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="begin" title="${message(code: 'requestForm.begin.label', default: 'Begin')}" />
					
						<g:sortableColumn property="middle" title="${message(code: 'requestForm.middle.label', default: 'Middle')}" />
					
						<g:sortableColumn property="end" title="${message(code: 'requestForm.end.label', default: 'End')}" />
					
						<th><g:message code="requestForm.employee.label" default="Employee" /></th>
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'requestForm.lastUpdated.label', default: 'Last Updated')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${requestFormInstanceList}" status="i" var="requestFormInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${requestFormInstance.id}">${fieldValue(bean: requestFormInstance, field: "begin")}</g:link></td>
					
						<td>${fieldValue(bean: requestFormInstance, field: "middle")}</td>
					
						<td>${fieldValue(bean: requestFormInstance, field: "end")}</td>
					
						<td>${fieldValue(bean: requestFormInstance, field: "employee")}</td>
					
						<td><g:formatDate date="${requestFormInstance.lastUpdated}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${requestFormInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
