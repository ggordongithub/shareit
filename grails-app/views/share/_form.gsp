



<div class="fieldcontain ${hasErrors(bean: shareInstance, field: 'companyName', 'error')} required">
	<label for="companyName">
		<g:message code="share.companyName.label" default="Company Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="companyName" required="" value="${shareInstance?.companyName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shareInstance, field: 'referenceAuthor', 'error')} required">
	<label for="referenceAuthor">
		<g:message code="share.referenceAuthor.label" default="Reference Author" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="referenceAuthor" required="" value="${shareInstance?.referenceAuthor}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shareInstance, field: 'createdDate', 'error')} required">
	<label for="createdDate">
		<g:message code="share.createdDate.label" default="Created Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="createdDate" precision="day"  value="${shareInstance?.createdDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: shareInstance, field: 'emailTo', 'error')} required">
	<label for="emailTo">
		<g:message code="share.emailTo.label" default="Email To" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="emailTo" required="" value="${shareInstance?.emailTo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shareInstance, field: 'referenceCompleted', 'error')} required">
	<label for="referenceCompleted">
		<g:message code="share.referenceCompleted.label" default="Reference Completed" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="referenceCompleted" required="" value="${shareInstance?.referenceCompleted}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shareInstance, field: 'deactivateReference', 'error')} ">
	<label for="deactivateReference">
		<g:message code="share.deactivateReference.label" default="Deactivate Reference" />
		
	</label>
	<g:checkBox name="deactivateReference" value="${shareInstance?.deactivateReference}" />

</div>

