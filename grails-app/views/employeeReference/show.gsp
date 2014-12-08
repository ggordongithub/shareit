

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employeeReference.label', default: 'EmployeeReference')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-employeeReference" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-employeeReference" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list employeeReference">
			
				<g:if test="${employeeReferenceInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="employeeReference.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${employeeReferenceInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.referenceHeader}">
				<li class="fieldcontain">
					<span id="referenceHeader-label" class="property-label"><g:message code="employeeReference.referenceHeader.label" default="Reference Header" /></span>
					
						<span class="property-value" aria-labelledby="referenceHeader-label"><g:fieldValue bean="${employeeReferenceInstance}" field="referenceHeader"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.referenceAbstract}">
				<li class="fieldcontain">
					<span id="referenceAbstract-label" class="property-label"><g:message code="employeeReference.referenceAbstract.label" default="Reference Abstract" /></span>
					
						<span class="property-value" aria-labelledby="referenceAbstract-label"><g:fieldValue bean="${employeeReferenceInstance}" field="referenceAbstract"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.referenceBody}">
				<li class="fieldcontain">
					<span id="referenceBody-label" class="property-label"><g:message code="employeeReference.referenceBody.label" default="Reference Body" /></span>
					
						<span class="property-value" aria-labelledby="referenceBody-label"><g:fieldValue bean="${employeeReferenceInstance}" field="referenceBody"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.referenceFooter}">
				<li class="fieldcontain">
					<span id="referenceFooter-label" class="property-label"><g:message code="employeeReference.referenceFooter.label" default="Reference Footer" /></span>
					
						<span class="property-value" aria-labelledby="referenceFooter-label"><g:fieldValue bean="${employeeReferenceInstance}" field="referenceFooter"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.referenceNote}">
				<li class="fieldcontain">
					<span id="referenceNote-label" class="property-label"><g:message code="employeeReference.referenceNote.label" default="Reference Note" /></span>
					
						<span class="property-value" aria-labelledby="referenceNote-label"><g:fieldValue bean="${employeeReferenceInstance}" field="referenceNote"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="employeeReference.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${employeeReferenceInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.expiredDate}">
				<li class="fieldcontain">
					<span id="expiredDate-label" class="property-label"><g:message code="employeeReference.expiredDate.label" default="Expired Date" /></span>
					
						<span class="property-value" aria-labelledby="expiredDate-label"><g:formatDate date="${employeeReferenceInstance?.expiredDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="employeeReference.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${employeeReferenceInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.referenceScore}">
				<li class="fieldcontain">
					<span id="referenceScore-label" class="property-label"><g:message code="employeeReference.referenceScore.label" default="Reference Score" /></span>
					
						<span class="property-value" aria-labelledby="referenceScore-label"><g:fieldValue bean="${employeeReferenceInstance}" field="referenceScore"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.imageLogo}">
				<li class="fieldcontain">
					<span id="imageLogo-label" class="property-label"><g:message code="employeeReference.imageLogo.label" default="Image Logo" /></span>
					
						<span class="property-value" aria-labelledby="imageLogo-label"><g:fieldValue bean="${employeeReferenceInstance}" field="imageLogo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeReferenceInstance?.employee}">
				<li class="fieldcontain">
					<span id="employee-label" class="property-label"><g:message code="employeeReference.employee.label" default="Employee" /></span>
					
						<span class="property-value" aria-labelledby="employee-label"><g:link controller="employee" action="show" id="${employeeReferenceInstance?.employee?.id}">${employeeReferenceInstance?.employee?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:employeeReferenceInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${employeeReferenceInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
