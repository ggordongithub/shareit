

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employeeExperience.label', default: 'EmployeeExperience')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-employeeExperience" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-employeeExperience" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="yearsKnown" title="${message(code: 'employeeExperience.yearsKnown.label', default: 'Years Known')}" />
					
						<g:sortableColumn property="experience" title="${message(code: 'employeeExperience.experience.label', default: 'Experience')}" />
					
						<g:sortableColumn property="clever" title="${message(code: 'employeeExperience.clever.label', default: 'Clever')}" />
					
						<g:sortableColumn property="smart" title="${message(code: 'employeeExperience.smart.label', default: 'Smart')}" />
					
						<g:sortableColumn property="hardDriving" title="${message(code: 'employeeExperience.hardDriving.label', default: 'Hard Driving')}" />
					
						<g:sortableColumn property="dependable" title="${message(code: 'employeeExperience.dependable.label', default: 'Dependable')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${employeeExperienceInstanceList}" status="i" var="employeeExperienceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${employeeExperienceInstance.id}">${fieldValue(bean: employeeExperienceInstance, field: "yearsKnown")}</g:link></td>
					
						<td>${fieldValue(bean: employeeExperienceInstance, field: "experience")}</td>
					
						<td><g:formatBoolean boolean="${employeeExperienceInstance.clever}" /></td>
					
						<td><g:formatBoolean boolean="${employeeExperienceInstance.smart}" /></td>
					
						<td><g:formatBoolean boolean="${employeeExperienceInstance.hardDriving}" /></td>
					
						<td><g:formatBoolean boolean="${employeeExperienceInstance.dependable}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${employeeExperienceInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
