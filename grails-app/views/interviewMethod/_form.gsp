



<div class="fieldcontain ${hasErrors(bean: interviewMethodInstance, field: 'methodName', 'error')} required">
	<label for="methodName">
		<g:message code="interviewMethod.methodName.label" default="Method Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="methodName" required="" value="${interviewMethodInstance?.methodName}"/>

</div>

