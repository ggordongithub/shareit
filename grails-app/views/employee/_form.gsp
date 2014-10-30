



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employeeTitle', 'error')} required">
	<label for="employeeTitle">
		<g:message code="employee.employeeTitle.label" default="Employee Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employeeTitle" required="" value="${employeeInstance?.employeeTitle}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'sirName', 'error')} required">
	<label for="sirName">
		<g:message code="employee.sirName.label" default="Sir Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="sirName" from="${employeeInstance.constraints.sirName.inList}" required="" value="${employeeInstance?.sirName}" valueMessagePrefix="employee.sirName"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="employee.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${employeeInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'middleName', 'error')} required">
	<label for="middleName">
		<g:message code="employee.middleName.label" default="Middle Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="middleName" required="" value="${employeeInstance?.middleName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="employee.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${employeeInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'suffixName', 'error')} required">
	<label for="suffixName">
		<g:message code="employee.suffixName.label" default="Suffix Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="suffixName" from="${employeeInstance.constraints.suffixName.inList}" required="" value="${employeeInstance?.suffixName}" valueMessagePrefix="employee.suffixName"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="employee.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${employeeInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'cellPhone', 'error')} required">
	<label for="cellPhone">
		<g:message code="employee.cellPhone.label" default="Cell Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cellPhone" required="" value="${employeeInstance?.cellPhone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'workPhone', 'error')} ">
	<label for="workPhone">
		<g:message code="employee.workPhone.label" default="Work Phone" />
		
	</label>
	<g:textField name="workPhone" value="${employeeInstance?.workPhone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'homePhone', 'error')} ">
	<label for="homePhone">
		<g:message code="employee.homePhone.label" default="Home Phone" />
		
	</label>
	<g:textField name="homePhone" value="${employeeInstance?.homePhone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'salaryRange', 'error')} required">
	<label for="salaryRange">
		<g:message code="employee.salaryRange.label" default="Salary Range" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="salaryRange" type="number" value="${employeeInstance.salaryRange}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'resumeCurrent', 'error')} ">
	<label for="resumeCurrent">
		<g:message code="employee.resumeCurrent.label" default="Resume Current" />
		
	</label>
	<g:checkBox name="resumeCurrent" value="${employeeInstance?.resumeCurrent}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employeeExperiences', 'error')} ">
	<label for="employeeExperiences">
		<g:message code="employee.employeeExperiences.label" default="Employee Experiences" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${employeeInstance?.employeeExperiences?}" var="e">
    <li><g:link controller="employeeExperience" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="employeeExperience" action="create" params="['employee.id': employeeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'employeeExperience.label', default: 'EmployeeExperience')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employeeHistories', 'error')} ">
	<label for="employeeHistories">
		<g:message code="employee.employeeHistories.label" default="Employee Histories" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${employeeInstance?.employeeHistories?}" var="e">
    <li><g:link controller="employeeHistory" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="employeeHistory" action="create" params="['employee.id': employeeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'employeeHistory.label', default: 'EmployeeHistory')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employeeLocations', 'error')} ">
	<label for="employeeLocations">
		<g:message code="employee.employeeLocations.label" default="Employee Locations" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${employeeInstance?.employeeLocations?}" var="e">
    <li><g:link controller="employeeLocation" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="employeeLocation" action="create" params="['employee.id': employeeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'employeeLocation.label', default: 'EmployeeLocation')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employeeReferences', 'error')} ">
	<label for="employeeReferences">
		<g:message code="employee.employeeReferences.label" default="Employee References" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${employeeInstance?.employeeReferences?}" var="e">
    <li><g:link controller="employeeReference" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="employeeReference" action="create" params="['employee.id': employeeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'employeeReference.label', default: 'EmployeeReference')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employers', 'error')} ">
	<label for="employers">
		<g:message code="employee.employers.label" default="Employers" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${employeeInstance?.employers?}" var="e">
    <li><g:link controller="employer" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="employer" action="create" params="['employee.id': employeeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'employer.label', default: 'Employer')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'prospectEmployers', 'error')} ">
	<label for="prospectEmployers">
		<g:message code="employee.prospectEmployers.label" default="Prospect Employers" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${employeeInstance?.prospectEmployers?}" var="p">
    <li><g:link controller="prospectEmployer" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="prospectEmployer" action="create" params="['employee.id': employeeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'prospectEmployer.label', default: 'ProspectEmployer')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'sharedReferences', 'error')} ">
	<label for="sharedReferences">
		<g:message code="employee.sharedReferences.label" default="Shared References" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${employeeInstance?.sharedReferences?}" var="s">
    <li><g:link controller="shareReference" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="shareReference" action="create" params="['employee.id': employeeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'shareReference.label', default: 'ShareReference')])}</g:link>
</li>
</ul>


</div>

