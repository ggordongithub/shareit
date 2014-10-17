

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employer.label', default: 'Employer')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-employer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-employer" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list employer">
			
				<g:if test="${employerInstance?.employerName}">
				<li class="fieldcontain">
					<span id="employerName-label" class="property-label"><g:message code="employer.employerName.label" default="Employer Name" /></span>
					
						<span class="property-value" aria-labelledby="employerName-label"><g:fieldValue bean="${employerInstance}" field="employerName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.employerQuestions}">
				<li class="fieldcontain">
					<span id="employerQuestions-label" class="property-label"><g:message code="employer.employerQuestions.label" default="Employer Questions" /></span>
					
						<span class="property-value" aria-labelledby="employerQuestions-label"><g:fieldValue bean="${employerInstance}" field="employerQuestions"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.employerEmail}">
				<li class="fieldcontain">
					<span id="employerEmail-label" class="property-label"><g:message code="employer.employerEmail.label" default="Employer Email" /></span>
					
						<span class="property-value" aria-labelledby="employerEmail-label"><g:fieldValue bean="${employerInstance}" field="employerEmail"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.employerPhone}">
				<li class="fieldcontain">
					<span id="employerPhone-label" class="property-label"><g:message code="employer.employerPhone.label" default="Employer Phone" /></span>
					
						<span class="property-value" aria-labelledby="employerPhone-label"><g:fieldValue bean="${employerInstance}" field="employerPhone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.reportingRelationship}">
				<li class="fieldcontain">
					<span id="reportingRelationship-label" class="property-label"><g:message code="employer.reportingRelationship.label" default="Reporting Relationship" /></span>
					
						<span class="property-value" aria-labelledby="reportingRelationship-label"><g:fieldValue bean="${employerInstance}" field="reportingRelationship"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.yearsEmployed}">
				<li class="fieldcontain">
					<span id="yearsEmployed-label" class="property-label"><g:message code="employer.yearsEmployed.label" default="Years Employed" /></span>
					
						<span class="property-value" aria-labelledby="yearsEmployed-label"><g:fieldValue bean="${employerInstance}" field="yearsEmployed"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.confirmStartDate}">
				<li class="fieldcontain">
					<span id="confirmStartDate-label" class="property-label"><g:message code="employer.confirmStartDate.label" default="Confirm Start Date" /></span>
					
						<span class="property-value" aria-labelledby="confirmStartDate-label"><g:formatDate date="${employerInstance?.confirmStartDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.confirmEndDate}">
				<li class="fieldcontain">
					<span id="confirmEndDate-label" class="property-label"><g:message code="employer.confirmEndDate.label" default="Confirm End Date" /></span>
					
						<span class="property-value" aria-labelledby="confirmEndDate-label"><g:formatDate date="${employerInstance?.confirmEndDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.employerReferenceFirstName}">
				<li class="fieldcontain">
					<span id="employerReferenceFirstName-label" class="property-label"><g:message code="employer.employerReferenceFirstName.label" default="Employer Reference First Name" /></span>
					
						<span class="property-value" aria-labelledby="employerReferenceFirstName-label"><g:fieldValue bean="${employerInstance}" field="employerReferenceFirstName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.employerReferenceLastName}">
				<li class="fieldcontain">
					<span id="employerReferenceLastName-label" class="property-label"><g:message code="employer.employerReferenceLastName.label" default="Employer Reference Last Name" /></span>
					
						<span class="property-value" aria-labelledby="employerReferenceLastName-label"><g:fieldValue bean="${employerInstance}" field="employerReferenceLastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employerInstance?.employerReferenceMiddleName}">
				<li class="fieldcontain">
					<span id="employerReferenceMiddleName-label" class="property-label"><g:message code="employer.employerReferenceMiddleName.label" default="Employer Reference Middle Name" /></span>
					
						<span class="property-value" aria-labelledby="employerReferenceMiddleName-label"><g:fieldValue bean="${employerInstance}" field="employerReferenceMiddleName"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:employerInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${employerInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
