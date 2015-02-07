



<div class="fieldcontain ${hasErrors(bean: requestFormInstance, field: 'begin', 'error')} required">
	<label for="begin">
		<g:message code="requestForm.begin.label" default="Begin" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="begin" maxlength="50" required="" value="${requestFormInstance?.begin}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestFormInstance, field: 'middle', 'error')} required">
	<label for="middle">
		<g:message code="requestForm.middle.label" default="Middle" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="middle" cols="40" rows="5" maxlength="300" required="" value="${requestFormInstance?.middle}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestFormInstance, field: 'end', 'error')} required">
	<label for="end">
		<g:message code="requestForm.end.label" default="End" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="end" maxlength="100" required="" value="${requestFormInstance?.end}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestFormInstance, field: 'employee', 'error')} required">
	<label for="employee">
		<g:message code="requestForm.employee.label" default="Employee" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="employee" name="employee.id" from="${Employee.list()}" optionKey="id" required="" value="${requestFormInstance?.employee?.id}" class="many-to-one"/>

</div>

