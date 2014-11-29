


<div id="trait_r1">
<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'yearsKnown', 'error')} required">
	<label for="yearsKnown">
		<g:message code="employeeExperience.yearsKnown.label" default="Years Known" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="yearsKnown" from="${employeeExperienceInstance.constraints.yearsKnown.inList}" required="" value="${employeeExperienceInstance?.yearsKnown}" valueMessagePrefix="employeeExperience.yearsKnown"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'experience', 'error')} required">
	<label for="experience">
		<g:message code="employeeExperience.experience.label" default="Experience" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="experience" required="" value="${employeeExperienceInstance?.experience}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'clever', 'error')} ">
	<label for="clever">
		<g:message code="employeeExperience.clever.label" default="Clever" />
		
	</label>
	<g:checkBox name="clever" value="${employeeExperienceInstance?.clever}" />

</div>
</div>

<div id="trait_r2">
<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'smart', 'error')} ">
	<label for="smart">
		<g:message code="employeeExperience.smart.label" default="Smart" />
		
	</label>
	<g:checkBox name="smart" value="${employeeExperienceInstance?.smart}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'hardDriving', 'error')} ">
	<label for="hardDriving">
		<g:message code="employeeExperience.hardDriving.label" default="Hard Driving" />
		
	</label>
	<g:checkBox name="hardDriving" value="${employeeExperienceInstance?.hardDriving}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'dependable', 'error')} ">
	<label for="dependable">
		<g:message code="employeeExperience.dependable.label" default="Dependable" />
		
	</label>
	<g:checkBox name="dependable" value="${employeeExperienceInstance?.dependable}" />

</div>

</div>
<div id="trait_r3">
<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'wellSpokenOf', 'error')} ">
	<label for="wellSpokenOf">
		<g:message code="employeeExperience.wellSpokenOf.label" default="Well Spoken Of" />
		
	</label>
	<g:checkBox name="wellSpokenOf" value="${employeeExperienceInstance?.wellSpokenOf}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'analytical', 'error')} ">
	<label for="analytical">
		<g:message code="employeeExperience.analytical.label" default="Analytical" />
		
	</label>
	<g:checkBox name="analytical" value="${employeeExperienceInstance?.analytical}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'entrepreneurial', 'error')} ">
	<label for="entrepreneurial">
		<g:message code="employeeExperience.entrepreneurial.label" default="Entrepreneurial" />
		
	</label>
	<g:checkBox name="entrepreneurial" value="${employeeExperienceInstance?.entrepreneurial}" />

</div>
</div>

<div id="trait_r4">
<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'businessMinded', 'error')} ">
	<label for="businessMinded">
		<g:message code="employeeExperience.businessMinded.label" default="Business Minded" />
		
	</label>
	<g:checkBox name="businessMinded" value="${employeeExperienceInstance?.businessMinded}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'inventive', 'error')} ">
	<label for="inventive">
		<g:message code="employeeExperience.inventive.label" default="Inventive" />
		
	</label>
	<g:checkBox name="inventive" value="${employeeExperienceInstance?.inventive}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'resultOriented', 'error')} ">
	<label for="resultOriented">
		<g:message code="employeeExperience.resultOriented.label" default="Result Oriented" />
		
	</label>
	<g:checkBox name="resultOriented" value="${employeeExperienceInstance?.resultOriented}" />

</div>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'employee', 'error')} required">
	<label for="employee">
		<g:message code="employeeExperience.employee.label" default="Employee" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="employee" name="employee.id" from="${Employee.list()}" optionKey="id" required="" value="${employeeExperienceInstance?.employee?.id}" class="many-to-one"/>

</div>

