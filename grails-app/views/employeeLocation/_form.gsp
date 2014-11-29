



<div class="fieldcontain ${hasErrors(bean: employeeLocationInstance, field: 'employee', 'error')} required">
	<label for="employee">
		<g:message code="employeeLocation.employee.label" default="Employee" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="employee" name="employee.id" from="${Employee.list()}" optionKey="id" required="" value="${employeeLocationInstance?.employee?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeLocationInstance, field: 'location', 'error')} required">
	<label for="location">
		<g:message code="employeeLocation.location.label" default="Location" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="location" name="location.id" from="${Location.list()}" optionKey="id" required="" value="${employeeLocationInstance?.location?.id}" class="many-to-one"/>

</div>

