<div class="formcaption">Employee History</div>
<div class="subcaption"></div>
<g:if test="${flash.message}">
	<div class="message" role="status">
		${flash.message}
	</div>
</g:if>
<g:hasErrors bean="${employeeHistoryInstance}">
	<ul class="errors" role="alert">
		<g:eachError bean="${employeeHistoryInstance}" var="error">
			<li
				<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
					error="${error}" /></li>
		</g:eachError>
	</ul>
</g:hasErrors>

<g:form name='subEmprForm'
	url="[resource:'employeeHistory', action:'save']">

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'promotionInCompany', 'error')} required">
	<label for="promotionInCompany">
		<g:message code="employeeHistory.promotionInCompany.label" default="Promotion In Company" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="promotionInCompany" required="" value="${employeeHistoryInstance?.promotionInCompany}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'conflict', 'error')} required">
	<label for="conflict">
		<g:message code="employeeHistory.conflict.label" default="Had Conflict" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea style="width:200px; height:50px;" name="conflict" required="" value="${employeeHistoryInstance?.conflict}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'teamPlayer', 'error')} required">
	<label for="teamPlayer">
		<g:message code="employeeHistory.teamPlayer.label" default="Team Player" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="teamPlayer" required="" value="${employeeHistoryInstance?.teamPlayer}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'handlePressure', 'error')} required">
	<label for="handlePressure">
		<g:message code="employeeHistory.handlePressure.label" default="Handle Pressure" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="handlePressure" required="" value="${employeeHistoryInstance?.handlePressure}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'temperament', 'error')} required">
	<label for="temperament">
		<g:message code="employeeHistory.temperament.label" default="Temperament" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="temperament" required="" value="${employeeHistoryInstance?.temperament}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'alert', 'error')} required">
	<label for="alert">
		<g:message code="employeeHistory.alert.label" default="Alert" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="alert" required="" value="${employeeHistoryInstance?.alert}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'strongestSkills', 'error')} required">
	<label for="strongestSkills">
		<g:message code="employeeHistory.strongestSkills.label" default="Strongest Skills" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea style="width:200px; height:50px;" name="strongestSkills" required="" value="${employeeHistoryInstance?.strongestSkills}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'weakestSkills', 'error')} required">
	<label for="weakestSkills">
		<g:message code="employeeHistory.weakestSkills.label" default="Weakest Skills" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="weakestSkills" required="" value="${employeeHistoryInstance?.weakestSkills}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'tardyOften', 'error')} ">
	<label for="tardyOften">
		<g:message code="employeeHistory.tardyOften.label" default="Tardy Often" />
		
	</label>
	<g:checkBox name="tardyOften" value="${employeeHistoryInstance?.tardyOften}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'managementStyle', 'error')} required">
	<label for="managementStyle">
		<g:message code="employeeHistory.managementStyle.label" default="Management Style" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="managementStyle" required="" value="${employeeHistoryInstance?.managementStyle}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'willYouRehire', 'error')} required">
	<label for="willYouRehire">
		<g:message code="employeeHistory.willYouRehire.label" default="Will You Rehire" />
		<span class="required-indicator">*</span>
	</label>
	<g:checkBox name="willYouRehire" value="${employeeHistoryInstance?.willYouRehire}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'getlongWithCoworkers', 'error')} required">
	<label for="getlongWithCoworkers">
		<g:message code="employeeHistory.getlongWithCoworkers.label" default="Getlong With Coworkers" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="getlongWithCoworkers" required="" value="${employeeHistoryInstance?.getlongWithCoworkers}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'getAlongWithMgt', 'error')} required">
	<label for="getAlongWithMgt">
		<g:message code="employeeHistory.getAlongWithMgt.label" default="Get Along With Mgt" />
		<span class="required-indicator">*</span>
	</label>
	<g:checkBox name="getAlongWithMgt" required="" value="${employeeHistoryInstance?.getAlongWithMgt}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'jobResponsibilities', 'error')} required">
	<label for="jobResponsibilities">
		<g:message code="employeeHistory.jobResponsibilities.label" default="Job Responsibilities" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea style="width:200px; height:50px;" name="jobResponsibilities" required="" value="${employeeHistoryInstance?.jobResponsibilities}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'highIntegrity', 'error')} required">
	<label for="highIntegrity">
		<g:message code="employeeHistory.highIntegrity.label" default="High Integrity" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="highIntegrity" required="" value="${employeeHistoryInstance?.highIntegrity}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeHistoryInstance, field: 'whyDidEmployeeLeave', 'error')} required">
	<label for="whyDidEmployeeLeave">
		<g:message code="employeeHistory.whyDidEmployeeLeave.label" default="Why Did Employee Leave" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea style="width: 200px; height: 50px;" name="whyDidEmployeeLeave" required="" value="${employeeHistoryInstance?.whyDidEmployeeLeave}"/>

</div>


	<p class="ebutton">
		<g:submitButton name="save" />
	</p>
</g:form>
