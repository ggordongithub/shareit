

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employeeHistory.label', default: 'EmployeeHistory')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-employeeHistory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-employeeHistory" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="promotionInCompany" title="${message(code: 'employeeHistory.promotionInCompany.label', default: 'Promotion In Company')}" />
					
						<g:sortableColumn property="conflict" title="${message(code: 'employeeHistory.conflict.label', default: 'Conflict')}" />
					
						<g:sortableColumn property="teamPlayer" title="${message(code: 'employeeHistory.teamPlayer.label', default: 'Team Player')}" />
					
						<g:sortableColumn property="handlePressure" title="${message(code: 'employeeHistory.handlePressure.label', default: 'Handle Pressure')}" />
					
						<g:sortableColumn property="temperament" title="${message(code: 'employeeHistory.temperament.label', default: 'Temperament')}" />
					
						<g:sortableColumn property="alert" title="${message(code: 'employeeHistory.alert.label', default: 'Alert')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${employeeHistoryInstanceList}" status="i" var="employeeHistoryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${employeeHistoryInstance.id}">${fieldValue(bean: employeeHistoryInstance, field: "promotionInCompany")}</g:link></td>
					
						<td>${fieldValue(bean: employeeHistoryInstance, field: "conflict")}</td>
					
						<td>${fieldValue(bean: employeeHistoryInstance, field: "teamPlayer")}</td>
					
						<td>${fieldValue(bean: employeeHistoryInstance, field: "handlePressure")}</td>
					
						<td>${fieldValue(bean: employeeHistoryInstance, field: "temperament")}</td>
					
						<td>${fieldValue(bean: employeeHistoryInstance, field: "alert")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${employeeHistoryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
