

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'interview.label', default: 'Interview')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-interview" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-interview" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="interviewer" title="${message(code: 'interview.interviewer.label', default: 'Interviewer')}" />
					
						<g:sortableColumn property="startDate" title="${message(code: 'interview.startDate.label', default: 'Start Date')}" />
					
						<g:sortableColumn property="endDate" title="${message(code: 'interview.endDate.label', default: 'End Date')}" />
					
						<g:sortableColumn property="interviewCategory" title="${message(code: 'interview.interviewCategory.label', default: 'Interview Category')}" />
					
						<g:sortableColumn property="company" title="${message(code: 'interview.company.label', default: 'Company')}" />
					
						<g:sortableColumn property="interviewStatus" title="${message(code: 'interview.interviewStatus.label', default: 'Interview Status')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${interviewInstanceList}" status="i" var="interviewInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${interviewInstance.id}">${fieldValue(bean: interviewInstance, field: "interviewer")}</g:link></td>
					
						<td><g:formatDate date="${interviewInstance.startDate}" /></td>
					
						<td><g:formatDate date="${interviewInstance.endDate}" /></td>
					
						<td>${fieldValue(bean: interviewInstance, field: "interviewCategory")}</td>
					
						<td>${fieldValue(bean: interviewInstance, field: "company")}</td>
					
						<td>${fieldValue(bean: interviewInstance, field: "interviewStatus")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${interviewInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
