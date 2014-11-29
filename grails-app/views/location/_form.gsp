



<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="location.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${locationInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="location.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${locationInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'state', 'error')} required">
	<label for="state">
		<g:message code="location.state.label" default="State" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="state" required="" value="${locationInstance?.state}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'zip', 'error')} required">
	<label for="zip">
		<g:message code="location.zip.label" default="Zip" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="zip" required="" value="${locationInstance?.zip}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'country', 'error')} required">
	<label for="country">
		<g:message code="location.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="country" required="" value="${locationInstance?.country}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'employeeLocation', 'error')} required">
	<label for="employeeLocation">
		<g:message code="location.employeeLocation.label" default="Employee Location" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="employeeLocation" name="employeeLocation.id" from="${EmployeeLocation.list()}" optionKey="id" required="" value="${locationInstance?.employeeLocation?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: locationInstance, field: 'employerLocation', 'error')} required">
	<label for="employerLocation">
		<g:message code="location.employerLocation.label" default="Employer Location" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="employerLocation" name="employerLocation.id" from="${EmployerLocation.list()}" optionKey="id" required="" value="${locationInstance?.employerLocation?.id}" class="many-to-one"/>

</div>

