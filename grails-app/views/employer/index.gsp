

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employer.label', default: 'Employer')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-employer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-employer" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="employerName" title="${message(code: 'employer.employerName.label', default: 'Employer Name')}" />
					
						<g:sortableColumn property="employerQuestions" title="${message(code: 'employer.employerQuestions.label', default: 'Employer Questions')}" />
					
						<g:sortableColumn property="employerEmail" title="${message(code: 'employer.employerEmail.label', default: 'Employer Email')}" />
					
						<g:sortableColumn property="employerPhone" title="${message(code: 'employer.employerPhone.label', default: 'Employer Phone')}" />
					
						<g:sortableColumn property="reportingRelationship" title="${message(code: 'employer.reportingRelationship.label', default: 'Reporting Relationship')}" />
					
						<g:sortableColumn property="yearsEmployed" title="${message(code: 'employer.yearsEmployed.label', default: 'Years Employed')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${employerInstanceList}" status="i" var="employerInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${employerInstance.id}">${fieldValue(bean: employerInstance, field: "employerName")}</g:link></td>
					
						<td>${fieldValue(bean: employerInstance, field: "employerQuestions")}</td>
					
						<td>${fieldValue(bean: employerInstance, field: "employerEmail")}</td>
					
						<td>${fieldValue(bean: employerInstance, field: "employerPhone")}</td>
					
						<td>${fieldValue(bean: employerInstance, field: "reportingRelationship")}</td>
					
						<td>${fieldValue(bean: employerInstance, field: "yearsEmployed")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${employerInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
