<div class="formcaption">Employee Experience</div>
<%--<div class="subcaption"></div>--%>
<g:if test="${flash.message}">
	<div class="message" role="status">
		${flash.message}
	</div>
</g:if>
<g:hasErrors bean="${employeeExperienceInstance}">
	<ul class="errors" role="alert">
		<g:eachError bean="${employeeExperienceInstance}" var="error">
			<li
				<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
					error="${error}" /></li>
		</g:eachError>
	</ul>
</g:hasErrors>

<g:form name='subEmprForm'
	url="[resource:'employeeExperience', action:'save']">

	<div
		class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'yearsKnown', 'error')} required">
		<label for="yearsKnown"> <g:message
				code="employeeExperience.yearsKnown.label" default="Years Known" />
			<span class="required-indicator">*</span>
		</label>
		<g:select name="yearsKnown"
			from="${['0-2 yrs', '3-5 yrs', '6-8 yrs', '9-11 yrs', '12-14 yrs', '15 plus yrs']}"
			required="" required=""
			value="${employeeExperienceInstance?.yearsKnown}"
			valueMessagePrefix="employeeExperience.yearsKnown" />

	</div>

	<div id="trait">
		<p>Please choose three character traits</p>
	</div>

	<div id="tr_r1">
		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'clever', 'error')} ">
			<label for="clever"> <g:message
					code="employeeExperience.clever.label" default="Clever" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(0)"
				value="${employeeExperienceInstance?.clever}" />

		</div>

		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'smart', 'error')} ">
			<label for="smart"> <g:message
					code="employeeExperience.smart.label" default="Smart" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(1)"
				value="${employeeExperienceInstance?.smart}" />

		</div>

		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'hardDriving', 'error')} ">
			<label for="hardDriving"> <g:message
					code="employeeExperience.hardDriving.label" default="Hard Driving" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(2)"
				value="${employeeExperienceInstance?.hardDriving}" />

		</div>
	</div>

	<div id="tr_r2">
		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'dependable', 'error')} ">
			<label for="dependable"> <g:message
					code="employeeExperience.dependable.label" default="Dependable" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(3)"
				value="${employeeExperienceInstance?.dependable}" />

		</div>

		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'wellSpokenOf', 'error')} ">
			<label for="wellSpokenOf"> <g:message
					code="employeeExperience.wellSpokenOf.label"
					default="Well Spoken Of" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(4)"
				value="${employeeExperienceInstance?.wellSpokenOf}" />

		</div>

		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'analytical', 'error')} ">
			<label for="analytical"> <g:message
					code="employeeExperience.analytical.label" default="Analytical" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(5)"
				value="${employeeExperienceInstance?.analytical}" />

		</div>

	</div>
	<div id="tr_r3">
		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'entrepreneurial', 'error')} ">
			<label for="entrepreneurial"> <g:message
					code="employeeExperience.entrepreneurial.label"
					default="Entrepreneurial" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(6)"
				value="${employeeExperienceInstance?.entrepreneurial}" />

		</div>

		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'businessMinded', 'error')} ">
			<label for="businessMinded"> <g:message
					code="employeeExperience.businessMinded.label"
					default="Business Minded" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(7)"
				value="${employeeExperienceInstance?.businessMinded}" />

		</div>

		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'inventive', 'error')} ">
			<label for="inventive"> <g:message
					code="employeeExperience.inventive.label" default="Inventive" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(8)"
				value="${employeeExperienceInstance?.inventive}" />

		</div>

	</div>

	<div id="tr_r4">
		<div
			class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'resultOriented', 'error')} ">
			<label for="resultOriented"> <g:message
					code="employeeExperience.resultOriented.label"
					default="Result Oriented" />

			</label>
			<g:checkBox name="ckbox" onclick="chkcontrol(9)"
				value="${employeeExperienceInstance?.resultOriented}" />

		</div>
	</div>

	<div id="empExp"
		class="fieldcontain ${hasErrors(bean: employeeExperienceInstance, field: 'experience', 'error')} required">
		<label for="experience"> <g:message
				code="employeeExperience.experience.label"
				default="Please describe your personal/professional interactions with the employee/owner" />
		</label>
		<g:textArea rows="1" cols="1" name="experience"
			required="required data"
			value="${employeeExperienceInstance?.experience}" />

	</div>

	<p class="ebutton">
		<g:submitButton class="btn btn-primary btn-lg store" name="SAVE"></g:submitButton>
	</p>
</g:form>
