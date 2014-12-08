<%@ page import="EmployeeReference" %>
<div class="formcaption">Employee Reference</div>
<div class="subcaption"></div>
<g:if test="${flash.message}">
	<div class="message" role="status">
		${flash.message}
	</div>
</g:if>
<g:hasErrors bean="${employeeReferenceInstance}">
	<ul class="errors" role="alert">
		<g:eachError bean="${employeeReferenceInstance}" var="error">
			<li
				<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
					error="${error}" /></li>
		</g:eachError>
	</ul>
</g:hasErrors>

<g:form name='subEmpForm'
	url="[resource:'employeeRef', action:'save']">


<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="employeeReference.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${employeeReferenceInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'referenceHeader', 'error')} required">
	<label for="referenceHeader">
		<g:message code="employeeReference.referenceHeader.label" default="Reference Salutation" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="referenceHeader" required="" style="width: 300px; height: 50px;" value="${employeeReferenceInstance?.referenceHeader}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'referenceAbstract', 'error')} required">
	<label for="referenceAbstract">
		<g:message code="employeeReference.referenceAbstract.label" default="Reference Abstract" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="referenceAbstract" style="width: 300px; height: 50px;" required="" value="${employeeReferenceInstance?.referenceAbstract}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'referenceBody', 'error')} required">
	<label for="referenceBody">
		<g:message code="employeeReference.referenceBody.label" default="Reference Body" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="referenceBody" required="" style="width: 400px; height: 120px;" value="${employeeReferenceInstance?.referenceBody}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'referenceFooter', 'error')} required">
	<label for="referenceFooter">
		<g:message code="employeeReference.referenceFooter.label" default="Reference Summary" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="referenceFooter" required="" style="width: 400px; height: 90px;" value="${employeeReferenceInstance?.referenceFooter}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'referenceNote', 'error')} required">
	<label for="referenceNote">
		<g:message code="employeeReference.referenceNote.label" default="Reference Note" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="referenceNote" required="" style="width: 400px; height: 70px;" value="${employeeReferenceInstance?.referenceNote}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'expiredDate', 'error')} required">
	<label for="expiredDate">
		<g:message code="employeeReference.expiredDate.label" default="Expired Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="expiredDate" precision="day"  value="${employeeReferenceInstance?.expiredDate}"  />

</div>

<%--<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'referenceScore', 'error')} required">--%>
<%--	<label for="referenceScore">--%>
<%--		<g:message code="employeeReference.referenceScore.label" default="Reference Score" />--%>
<%--		<span class="required-indicator">*</span>--%>
<%--	</label>--%>
<%--	<g:field name="referenceScore" type="number" value="${employeeReferenceInstance.referenceScore}" required=""/>--%>
<%----%>
<%--</div>--%>

<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'imageLogo', 'error')} required">
	<label for="imageLogo">
		<g:message code="employeeReference.imageLogo.label" default="Image Logo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="imageLogo" required="" value="${employeeReferenceInstance?.imageLogo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeReferenceInstance, field: 'employee', 'error')} required">
	<label for="employee">
		<g:message code="employeeReference.employee.label" default="Employee" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="employee" name="employee.id" from="${Employee.list()}" optionKey="id" required="" value="${employeeReferenceInstance?.employee?.id}" class="many-to-one"/>

</div>

	
	<p class="ebutton">
		<g:submitButton class="btn btn-primary btn-lg store" name="SAVE"></g:submitButton>
	</p>
</g:form>