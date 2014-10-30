

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employee.label', default: 'Employee')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-employee" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-employee" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list employee">
			
				<g:if test="${employeeInstance?.employeeTitle}">
				<li class="fieldcontain">
					<span id="employeeTitle-label" class="property-label"><g:message code="employee.employeeTitle.label" default="Employee Title" /></span>
					
						<span class="property-value" aria-labelledby="employeeTitle-label"><g:fieldValue bean="${employeeInstance}" field="employeeTitle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.sirName}">
				<li class="fieldcontain">
					<span id="sirName-label" class="property-label"><g:message code="employee.sirName.label" default="Sir Name" /></span>
					
						<span class="property-value" aria-labelledby="sirName-label"><g:fieldValue bean="${employeeInstance}" field="sirName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.firstName}">
				<li class="fieldcontain">
					<span id="firstName-label" class="property-label"><g:message code="employee.firstName.label" default="First Name" /></span>
					
						<span class="property-value" aria-labelledby="firstName-label"><g:fieldValue bean="${employeeInstance}" field="firstName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.middleName}">
				<li class="fieldcontain">
					<span id="middleName-label" class="property-label"><g:message code="employee.middleName.label" default="Middle Name" /></span>
					
						<span class="property-value" aria-labelledby="middleName-label"><g:fieldValue bean="${employeeInstance}" field="middleName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.lastName}">
				<li class="fieldcontain">
					<span id="lastName-label" class="property-label"><g:message code="employee.lastName.label" default="Last Name" /></span>
					
						<span class="property-value" aria-labelledby="lastName-label"><g:fieldValue bean="${employeeInstance}" field="lastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.suffixName}">
				<li class="fieldcontain">
					<span id="suffixName-label" class="property-label"><g:message code="employee.suffixName.label" default="Suffix Name" /></span>
					
						<span class="property-value" aria-labelledby="suffixName-label"><g:fieldValue bean="${employeeInstance}" field="suffixName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="employee.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${employeeInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.cellPhone}">
				<li class="fieldcontain">
					<span id="cellPhone-label" class="property-label"><g:message code="employee.cellPhone.label" default="Cell Phone" /></span>
					
						<span class="property-value" aria-labelledby="cellPhone-label"><g:fieldValue bean="${employeeInstance}" field="cellPhone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.workPhone}">
				<li class="fieldcontain">
					<span id="workPhone-label" class="property-label"><g:message code="employee.workPhone.label" default="Work Phone" /></span>
					
						<span class="property-value" aria-labelledby="workPhone-label"><g:fieldValue bean="${employeeInstance}" field="workPhone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.homePhone}">
				<li class="fieldcontain">
					<span id="homePhone-label" class="property-label"><g:message code="employee.homePhone.label" default="Home Phone" /></span>
					
						<span class="property-value" aria-labelledby="homePhone-label"><g:fieldValue bean="${employeeInstance}" field="homePhone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.salaryRange}">
				<li class="fieldcontain">
					<span id="salaryRange-label" class="property-label"><g:message code="employee.salaryRange.label" default="Salary Range" /></span>
					
						<span class="property-value" aria-labelledby="salaryRange-label"><g:fieldValue bean="${employeeInstance}" field="salaryRange"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.resumeCurrent}">
				<li class="fieldcontain">
					<span id="resumeCurrent-label" class="property-label"><g:message code="employee.resumeCurrent.label" default="Resume Current" /></span>
					
						<span class="property-value" aria-labelledby="resumeCurrent-label"><g:formatBoolean boolean="${employeeInstance?.resumeCurrent}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.employeeExperiences}">
				<li class="fieldcontain">
					<span id="employeeExperiences-label" class="property-label"><g:message code="employee.employeeExperiences.label" default="Employee Experiences" /></span>
					
						<g:each in="${employeeInstance.employeeExperiences}" var="e">
						<span class="property-value" aria-labelledby="employeeExperiences-label"><g:link controller="employeeExperience" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.employeeHistories}">
				<li class="fieldcontain">
					<span id="employeeHistories-label" class="property-label"><g:message code="employee.employeeHistories.label" default="Employee Histories" /></span>
					
						<g:each in="${employeeInstance.employeeHistories}" var="e">
						<span class="property-value" aria-labelledby="employeeHistories-label"><g:link controller="employeeHistory" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.employeeLocations}">
				<li class="fieldcontain">
					<span id="employeeLocations-label" class="property-label"><g:message code="employee.employeeLocations.label" default="Employee Locations" /></span>
					
						<g:each in="${employeeInstance.employeeLocations}" var="e">
						<span class="property-value" aria-labelledby="employeeLocations-label"><g:link controller="employeeLocation" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.employeeReferences}">
				<li class="fieldcontain">
					<span id="employeeReferences-label" class="property-label"><g:message code="employee.employeeReferences.label" default="Employee References" /></span>
					
						<g:each in="${employeeInstance.employeeReferences}" var="e">
						<span class="property-value" aria-labelledby="employeeReferences-label"><g:link controller="employeeReference" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.employers}">
				<li class="fieldcontain">
					<span id="employers-label" class="property-label"><g:message code="employee.employers.label" default="Employers" /></span>
					
						<g:each in="${employeeInstance.employers}" var="e">
						<span class="property-value" aria-labelledby="employers-label"><g:link controller="employer" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.prospectEmployers}">
				<li class="fieldcontain">
					<span id="prospectEmployers-label" class="property-label"><g:message code="employee.prospectEmployers.label" default="Prospect Employers" /></span>
					
						<g:each in="${employeeInstance.prospectEmployers}" var="p">
						<span class="property-value" aria-labelledby="prospectEmployers-label"><g:link controller="prospectEmployer" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.sharedReferences}">
				<li class="fieldcontain">
					<span id="sharedReferences-label" class="property-label"><g:message code="employee.sharedReferences.label" default="Shared References" /></span>
					
						<g:each in="${employeeInstance.sharedReferences}" var="s">
						<span class="property-value" aria-labelledby="sharedReferences-label"><g:link controller="shareReference" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:employeeInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${employeeInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
