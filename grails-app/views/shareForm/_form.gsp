



<div class="fieldcontain ${hasErrors(bean: shareFormInstance, field: 'greet', 'error')} required">
	<label for="greet">
		<g:message code="shareForm.greet.label" default="Greet" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="greet" maxlength="50" required="" value="${shareFormInstance?.greet}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shareFormInstance, field: 'middle', 'error')} required">
	<label for="middle">
		<g:message code="shareForm.middle.label" default="Middle" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="middle" cols="40" rows="5" maxlength="300" required="" value="${shareFormInstance?.middle}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shareFormInstance, field: 'end', 'error')} required">
	<label for="end">
		<g:message code="shareForm.end.label" default="End" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="end" maxlength="100" required="" value="${shareFormInstance?.end}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shareFormInstance, field: 'employee', 'error')} required">
	<label for="employee">
		<g:message code="shareForm.employee.label" default="Employee" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="employee" name="employee.id" from="${Employee.list()}" optionKey="id" required="" value="${shareFormInstance?.employee?.id}" class="many-to-one"/>

</div>

