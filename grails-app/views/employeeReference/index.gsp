

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employeeReference.label', default: 'EmployeeReference')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-employeeReference" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-employeeReference" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'employeeReference.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="referenceHeader" title="${message(code: 'employeeReference.referenceHeader.label', default: 'Reference Header')}" />
					
						<g:sortableColumn property="referenceAbstract" title="${message(code: 'employeeReference.referenceAbstract.label', default: 'Reference Abstract')}" />
					
						<g:sortableColumn property="referenceBody" title="${message(code: 'employeeReference.referenceBody.label', default: 'Reference Body')}" />
					
						<g:sortableColumn property="referenceFooter" title="${message(code: 'employeeReference.referenceFooter.label', default: 'Reference Footer')}" />
					
						<g:sortableColumn property="referenceNote" title="${message(code: 'employeeReference.referenceNote.label', default: 'Reference Note')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${employeeReferenceInstanceList}" status="i" var="employeeReferenceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${employeeReferenceInstance.id}">${fieldValue(bean: employeeReferenceInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: employeeReferenceInstance, field: "referenceHeader")}</td>
					
						<td>${fieldValue(bean: employeeReferenceInstance, field: "referenceAbstract")}</td>
					
						<td>${fieldValue(bean: employeeReferenceInstance, field: "referenceBody")}</td>
					
						<td>${fieldValue(bean: employeeReferenceInstance, field: "referenceFooter")}</td>
					
						<td>${fieldValue(bean: employeeReferenceInstance, field: "referenceNote")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${employeeReferenceInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
