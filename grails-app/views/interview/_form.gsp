



<div class="fieldcontain ${hasErrors(bean: interviewInstance, field: 'interviewer', 'error')} required">
	<label for="interviewer">
		<g:message code="interview.interviewer.label" default="Interviewer" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="interviewer" required="" value="${interviewInstance?.interviewer}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: interviewInstance, field: 'startDate', 'error')} required">
	<label for="startDate">
		<g:message code="interview.startDate.label" default="Start Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="startDate" precision="day"  value="${interviewInstance?.startDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: interviewInstance, field: 'endDate', 'error')} required">
	<label for="endDate">
		<g:message code="interview.endDate.label" default="End Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="endDate" precision="day"  value="${interviewInstance?.endDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: interviewInstance, field: 'interviewCategory', 'error')} required">
	<label for="interviewCategory">
		<g:message code="interview.interviewCategory.label" default="Interview Category" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="interviewCategory" required="" value="${interviewInstance?.interviewCategory}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: interviewInstance, field: 'company', 'error')} required">
	<label for="company">
		<g:message code="interview.company.label" default="Company" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="company" required="" value="${interviewInstance?.company}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: interviewInstance, field: 'interviewStatus', 'error')} required">
	<label for="interviewStatus">
		<g:message code="interview.interviewStatus.label" default="Interview Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="interviewStatus" required="" value="${interviewInstance?.interviewStatus}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: interviewInstance, field: 'interviewMethods', 'error')} ">
	<label for="interviewMethods">
		<g:message code="interview.interviewMethods.label" default="Interview Methods" />
		
	</label>
	<g:select name="interviewMethods" from="${InterviewMethod.list()}" multiple="multiple" optionKey="id" size="5" value="${interviewInstance?.interviewMethods*.id}" class="many-to-many"/>

</div>

