

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employeeExperience.label', default: 'EmployeeExperience')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-employeeExperience" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-employeeExperience" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list employeeExperience">
			
				<g:if test="${employeeExperienceInstance?.yearsKnown}">
				<li class="fieldcontain">
					<span id="yearsKnown-label" class="property-label"><g:message code="employeeExperience.yearsKnown.label" default="Years Known" /></span>
					
						<span class="property-value" aria-labelledby="yearsKnown-label"><g:fieldValue bean="${employeeExperienceInstance}" field="yearsKnown"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.experience}">
				<li class="fieldcontain">
					<span id="experience-label" class="property-label"><g:message code="employeeExperience.experience.label" default="Experience" /></span>
					
						<span class="property-value" aria-labelledby="experience-label"><g:fieldValue bean="${employeeExperienceInstance}" field="experience"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.clever}">
				<li class="fieldcontain">
					<span id="clever-label" class="property-label"><g:message code="employeeExperience.clever.label" default="Clever" /></span>
					
						<span class="property-value" aria-labelledby="clever-label"><g:formatBoolean boolean="${employeeExperienceInstance?.clever}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.smart}">
				<li class="fieldcontain">
					<span id="smart-label" class="property-label"><g:message code="employeeExperience.smart.label" default="Smart" /></span>
					
						<span class="property-value" aria-labelledby="smart-label"><g:formatBoolean boolean="${employeeExperienceInstance?.smart}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.hardDriving}">
				<li class="fieldcontain">
					<span id="hardDriving-label" class="property-label"><g:message code="employeeExperience.hardDriving.label" default="Hard Driving" /></span>
					
						<span class="property-value" aria-labelledby="hardDriving-label"><g:formatBoolean boolean="${employeeExperienceInstance?.hardDriving}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.dependable}">
				<li class="fieldcontain">
					<span id="dependable-label" class="property-label"><g:message code="employeeExperience.dependable.label" default="Dependable" /></span>
					
						<span class="property-value" aria-labelledby="dependable-label"><g:formatBoolean boolean="${employeeExperienceInstance?.dependable}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.wellSpokenOf}">
				<li class="fieldcontain">
					<span id="wellSpokenOf-label" class="property-label"><g:message code="employeeExperience.wellSpokenOf.label" default="Well Spoken Of" /></span>
					
						<span class="property-value" aria-labelledby="wellSpokenOf-label"><g:formatBoolean boolean="${employeeExperienceInstance?.wellSpokenOf}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.analytical}">
				<li class="fieldcontain">
					<span id="analytical-label" class="property-label"><g:message code="employeeExperience.analytical.label" default="Analytical" /></span>
					
						<span class="property-value" aria-labelledby="analytical-label"><g:formatBoolean boolean="${employeeExperienceInstance?.analytical}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.entrepreneurial}">
				<li class="fieldcontain">
					<span id="entrepreneurial-label" class="property-label"><g:message code="employeeExperience.entrepreneurial.label" default="Entrepreneurial" /></span>
					
						<span class="property-value" aria-labelledby="entrepreneurial-label"><g:formatBoolean boolean="${employeeExperienceInstance?.entrepreneurial}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.businessMinded}">
				<li class="fieldcontain">
					<span id="businessMinded-label" class="property-label"><g:message code="employeeExperience.businessMinded.label" default="Business Minded" /></span>
					
						<span class="property-value" aria-labelledby="businessMinded-label"><g:formatBoolean boolean="${employeeExperienceInstance?.businessMinded}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.inventive}">
				<li class="fieldcontain">
					<span id="inventive-label" class="property-label"><g:message code="employeeExperience.inventive.label" default="Inventive" /></span>
					
						<span class="property-value" aria-labelledby="inventive-label"><g:formatBoolean boolean="${employeeExperienceInstance?.inventive}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.resultOriented}">
				<li class="fieldcontain">
					<span id="resultOriented-label" class="property-label"><g:message code="employeeExperience.resultOriented.label" default="Result Oriented" /></span>
					
						<span class="property-value" aria-labelledby="resultOriented-label"><g:formatBoolean boolean="${employeeExperienceInstance?.resultOriented}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeExperienceInstance?.employee}">
				<li class="fieldcontain">
					<span id="employee-label" class="property-label"><g:message code="employeeExperience.employee.label" default="Employee" /></span>
					
						<span class="property-value" aria-labelledby="employee-label"><g:link controller="employee" action="show" id="${employeeExperienceInstance?.employee?.id}">${employeeExperienceInstance?.employee?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:employeeExperienceInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${employeeExperienceInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
