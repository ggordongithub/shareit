<div class="formcaption">Employer Profile</div>
<div class="subcaption"></div>
<g:if test="${flash.message}">
	<div class="message" role="status">
		${flash.message}
	</div>
</g:if>
<g:hasErrors bean="${employerInstance}">
	<ul class="errors" role="alert">
		<g:eachError bean="${employerInstance}" var="error">
			<li
				<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
					error="${error}" /></li>
		</g:eachError>
	</ul>
</g:hasErrors>

<g:form name='subEmprForm'
	url="[resource:'employer', action:'save']">

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'employerName', 'error')} required">
	<label for="employerName">
		<g:message code="employer.employerName.label" default="Employer Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employerName" required="" value="${employerInstance?.employerName}"/>

</div>


<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'employerEmail', 'error')} required">
	<label for="employerEmail">
		<g:message code="employer.employerEmail.label" default="Employer Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employerEmail" required="" value="${employerInstance?.employerEmail}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'employerPhone', 'error')} required">
	<label for="employerPhone">
		<g:message code="employer.employerPhone.label" default="Employer Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employerPhone" required="" value="${employerInstance?.employerPhone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'reportingRelationship', 'error')} required">
	<label for="reportingRelationship">
		<g:message code="employer.reportingRelationship.label" default="Reporting Relationship" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="reportingRelationship" required="" value="${employerInstance?.reportingRelationship}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'yearsEmployed', 'error')} required">
	<label for="yearsEmployed">
		<g:message code="employer.yearsEmployed.label" default="Years Employed" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="yearsEmployed" required="" value="${employerInstance?.yearsEmployed}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'confirmStartDate', 'error')} required">
	<label for="confirmStartDate">
		<g:message code="employer.confirmStartDate.label" default="Confirm Start Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="confirmStartDate" precision="day"  value="${employerInstance?.confirmStartDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'confirmEndDate', 'error')} required">
	<label for="confirmEndDate">
		<g:message code="employer.confirmEndDate.label" default="Confirm End Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="confirmEndDate" precision="day"  value="${employerInstance?.confirmEndDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'employerReferenceFirstName', 'error')} required">
	<label for="employerReferenceFirstName">
		<g:message code="employer.employerReferenceFirstName.label" default="Employer Reference First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employerReferenceFirstName" required="" value="${employerInstance?.employerReferenceFirstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'employerReferenceLastName', 'error')} required">
	<label for="employerReferenceLastName">
		<g:message code="employer.employerReferenceLastName.label" default="Employer Reference Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employerReferenceLastName" required="" value="${employerInstance?.employerReferenceLastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'employerReferenceMiddleName', 'error')} required">
	<label for="employerReferenceMiddleName">
		<g:message code="employer.employerReferenceMiddleName.label" default="Employer Reference Middle Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employerReferenceMiddleName" required="" value="${employerInstance?.employerReferenceMiddleName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employerInstance, field: 'employerQuestions', 'error')} required">
	<label for="employerQuestions">
		<g:message code="employer.employerQuestions.label" default="Employer Questions" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea rows="1" cols="1" name="employerQuestions" required="" value="${employerInstance?.employerQuestions}"/>

</div>

	<p class="ebutton">
	<g:submitButton class="btn btn-primary btn-lg" name="SAVE"></g:submitButton>
	</p>
</g:form>
