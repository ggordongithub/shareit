



<div class="fieldcontain ${hasErrors(bean: requestInstance, field: 'companyName', 'error')} required">
	<label for="companyName">
		<g:message code="request.companyName.label" default="Company Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="companyName" required="" value="${requestInstance?.companyName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestInstance, field: 'sentOrReceivedDate', 'error')} required">
	<label for="sentOrReceivedDate">
		<g:message code="request.sentOrReceivedDate.label" default="Sent Or Received Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="sentOrReceivedDate" precision="day"  value="${requestInstance?.sentOrReceivedDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: requestInstance, field: 'requestForReferenceEmail', 'error')} required">
	<label for="requestForReferenceEmail">
		<g:message code="request.requestForReferenceEmail.label" default="Request For Reference Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="requestForReferenceEmail" required="" value="${requestInstance?.requestForReferenceEmail}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: requestInstance, field: 'referenceReceived', 'error')} ">
	<label for="referenceReceived">
		<g:message code="request.referenceReceived.label" default="Reference Received" />
		
	</label>
	<g:checkBox name="referenceReceived" value="${requestInstance?.referenceReceived}" />

</div>

