

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employeeLocation.label', default: 'EmployeeLocation')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-employeeLocation" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-employeeLocation" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="employeeLocation.employee.label" default="Employee" /></th>
					
						<th><g:message code="employeeLocation.location.label" default="Location" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${employeeLocationInstanceList}" status="i" var="employeeLocationInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${employeeLocationInstance.id}">${fieldValue(bean: employeeLocationInstance, field: "employee")}</g:link></td>
					
						<td>${fieldValue(bean: employeeLocationInstance, field: "location")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${employeeLocationInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
