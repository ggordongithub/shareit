

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employeeHistory.label', default: 'EmployeeHistory')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-employeeHistory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-employeeHistory" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list employeeHistory">
			
				<g:if test="${employeeHistoryInstance?.promotionInCompany}">
				<li class="fieldcontain">
					<span id="promotionInCompany-label" class="property-label"><g:message code="employeeHistory.promotionInCompany.label" default="Promotion In Company" /></span>
					
						<span class="property-value" aria-labelledby="promotionInCompany-label"><g:fieldValue bean="${employeeHistoryInstance}" field="promotionInCompany"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.conflict}">
				<li class="fieldcontain">
					<span id="conflict-label" class="property-label"><g:message code="employeeHistory.conflict.label" default="Conflict" /></span>
					
						<span class="property-value" aria-labelledby="conflict-label"><g:fieldValue bean="${employeeHistoryInstance}" field="conflict"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.teamPlayer}">
				<li class="fieldcontain">
					<span id="teamPlayer-label" class="property-label"><g:message code="employeeHistory.teamPlayer.label" default="Team Player" /></span>
					
						<span class="property-value" aria-labelledby="teamPlayer-label"><g:fieldValue bean="${employeeHistoryInstance}" field="teamPlayer"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.handlePressure}">
				<li class="fieldcontain">
					<span id="handlePressure-label" class="property-label"><g:message code="employeeHistory.handlePressure.label" default="Handle Pressure" /></span>
					
						<span class="property-value" aria-labelledby="handlePressure-label"><g:fieldValue bean="${employeeHistoryInstance}" field="handlePressure"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.temperament}">
				<li class="fieldcontain">
					<span id="temperament-label" class="property-label"><g:message code="employeeHistory.temperament.label" default="Temperament" /></span>
					
						<span class="property-value" aria-labelledby="temperament-label"><g:fieldValue bean="${employeeHistoryInstance}" field="temperament"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.alert}">
				<li class="fieldcontain">
					<span id="alert-label" class="property-label"><g:message code="employeeHistory.alert.label" default="Alert" /></span>
					
						<span class="property-value" aria-labelledby="alert-label"><g:fieldValue bean="${employeeHistoryInstance}" field="alert"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.strongestSkills}">
				<li class="fieldcontain">
					<span id="strongestSkills-label" class="property-label"><g:message code="employeeHistory.strongestSkills.label" default="Strongest Skills" /></span>
					
						<span class="property-value" aria-labelledby="strongestSkills-label"><g:fieldValue bean="${employeeHistoryInstance}" field="strongestSkills"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.weakestSkills}">
				<li class="fieldcontain">
					<span id="weakestSkills-label" class="property-label"><g:message code="employeeHistory.weakestSkills.label" default="Weakest Skills" /></span>
					
						<span class="property-value" aria-labelledby="weakestSkills-label"><g:fieldValue bean="${employeeHistoryInstance}" field="weakestSkills"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.tardyOften}">
				<li class="fieldcontain">
					<span id="tardyOften-label" class="property-label"><g:message code="employeeHistory.tardyOften.label" default="Tardy Often" /></span>
					
						<span class="property-value" aria-labelledby="tardyOften-label"><g:formatBoolean boolean="${employeeHistoryInstance?.tardyOften}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.managementStyle}">
				<li class="fieldcontain">
					<span id="managementStyle-label" class="property-label"><g:message code="employeeHistory.managementStyle.label" default="Management Style" /></span>
					
						<span class="property-value" aria-labelledby="managementStyle-label"><g:fieldValue bean="${employeeHistoryInstance}" field="managementStyle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.willYouRehire}">
				<li class="fieldcontain">
					<span id="willYouRehire-label" class="property-label"><g:message code="employeeHistory.willYouRehire.label" default="Will You Rehire" /></span>
					
						<span class="property-value" aria-labelledby="willYouRehire-label"><g:fieldValue bean="${employeeHistoryInstance}" field="willYouRehire"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.getlongWithCoworkers}">
				<li class="fieldcontain">
					<span id="getlongWithCoworkers-label" class="property-label"><g:message code="employeeHistory.getlongWithCoworkers.label" default="Getlong With Coworkers" /></span>
					
						<span class="property-value" aria-labelledby="getlongWithCoworkers-label"><g:fieldValue bean="${employeeHistoryInstance}" field="getlongWithCoworkers"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.getAlongWithMgt}">
				<li class="fieldcontain">
					<span id="getAlongWithMgt-label" class="property-label"><g:message code="employeeHistory.getAlongWithMgt.label" default="Get Along With Mgt" /></span>
					
						<span class="property-value" aria-labelledby="getAlongWithMgt-label"><g:fieldValue bean="${employeeHistoryInstance}" field="getAlongWithMgt"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.jobResponsibilities}">
				<li class="fieldcontain">
					<span id="jobResponsibilities-label" class="property-label"><g:message code="employeeHistory.jobResponsibilities.label" default="Job Responsibilities" /></span>
					
						<span class="property-value" aria-labelledby="jobResponsibilities-label"><g:fieldValue bean="${employeeHistoryInstance}" field="jobResponsibilities"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.whyDidEmployeeLeave}">
				<li class="fieldcontain">
					<span id="whyDidEmployeeLeave-label" class="property-label"><g:message code="employeeHistory.whyDidEmployeeLeave.label" default="Why Did Employee Leave" /></span>
					
						<span class="property-value" aria-labelledby="whyDidEmployeeLeave-label"><g:fieldValue bean="${employeeHistoryInstance}" field="whyDidEmployeeLeave"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeHistoryInstance?.highIntegrity}">
				<li class="fieldcontain">
					<span id="highIntegrity-label" class="property-label"><g:message code="employeeHistory.highIntegrity.label" default="High Integrity" /></span>
					
						<span class="property-value" aria-labelledby="highIntegrity-label"><g:fieldValue bean="${employeeHistoryInstance}" field="highIntegrity"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:employeeHistoryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${employeeHistoryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
