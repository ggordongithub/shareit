<div class="formcaption">Employee Profile</div>
<div class="subcaption">We need to build your profile, please fill out the form questions to complete your profile</div>
<g:if test="${flash.message}">
	<div class="message" role="status">
		${flash.message}
	</div>
</g:if>
<g:hasErrors bean="${employeeInstance}">
	<ul class="errors" role="alert">
		<g:eachError bean="${employeeInstance}" var="error">
			<li
				<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
					error="${error}" /></li>
		</g:eachError>
	</ul>
</g:hasErrors>

<g:form name='subEmpForm'
	url="[resource:'employee', action:'save']">

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employeeTitle', 'error')} required">
		<label for="employeeTitle"> <g:message
				code="employee.employeeTitle.label" default="Employee Title" /> <span
			class="required-indicator">*</span>
		</label>
		<g:textField name="employeeTitle" required=""
			value="${employeeInstance?.employeeTitle}" />
	</div>

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'sirName', 'error')} required">
		<label for="sirName"> <g:message code="employee.sirName.label"
				default="Sir Name" /> 
		</label>
		<g:select name="sirName"
			from="${['NA', 'Mr.', 'Ms.', 'Mrs.', 'Sr.', 'Miss.']}" required=""
			value="${employeeInstance?.sirName}"
			valueMessagePrefix="employee.sirName" />

	</div>

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'firstName', 'error')} required">
		<label for="firstName"> <g:message
				code="employee.firstName.label" default="First Name" /> <span
			class="required-indicator">*</span>
		</label>
		<g:textField name="firstName" required=""
			value="${employeeInstance?.firstName}" />

	</div>

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'middleName', 'error')} required">
		<label for="middleName"> <g:message
				code="employee.middleName.label" default="Middle Name" /> <span
			class="required-indicator">*</span>
		</label>
		<g:textField name="middleName" required=""
			value="${employeeInstance?.middleName}" />

	</div>

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'lastName', 'error')} required">
		<label for="lastName"> <g:message
				code="employee.lastName.label" default="Last Name" /> <span
			class="required-indicator">*</span>
		</label>
		<g:textField name="lastName" required=""
			value="${employeeInstance?.lastName}" />

	</div>

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'suffixName', 'error')} required">
		<label for="suffixName"> <g:message
				code="employee.suffixName.label" default="Suffix Name" /> 
		</label>
		<g:select name="suffixName"
			from="${['NA', 'I', 'II', 'III', 'IV', 'V', 'VI']}" required=""
			value="${employeeInstance?.suffixName}"
			valueMessagePrefix="employee.suffixName" />

	</div>

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'email', 'error')} required">
		<label for="email"> <g:message code="employee.email.label"
				default="Email" /> <span class="required-indicator">*</span>
		</label>
		<g:field type="email" name="email" required=""
			value="${employeeInstance?.email}" />

	</div>

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'cellPhone', 'error')} required">
		<label for="cellPhone"> <g:message
				code="employee.cellPhone.label" default="Cell Phone" /> <span
			class="required-indicator">*</span>
		</label>
		<g:textField name="cellPhone" required=""
			value="${employeeInstance?.cellPhone}" />

	</div>

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'workPhone', 'error')} ">
		<label for="workPhone"> <g:message
				code="employee.workPhone.label" default="Work Phone" />

		</label>
		<g:textField name="workPhone" value="${employeeInstance?.workPhone}" />

	</div>

	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'homePhone', 'error')} ">
		<label for="homePhone"> <g:message
				code="employee.homePhone.label" default="Home Phone" />

		</label>
		<g:textField name="homePhone" value="${employeeInstance?.homePhone}" />

	</div>


	<div
		class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'resumeCurrent', 'error')} ">
		<label for="resumeCurrent"> <g:message
				code="employee.resumeCurrent.label" default="Resume Current" />

		</label>
		<g:checkBox name="resumeCurrent"
			value="${employeeInstance?.resumeCurrent}" />

	</div>
	<p class="ebutton">
		<g:submitButton name="save" />
	</p>
</g:form>