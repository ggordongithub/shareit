

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'interview.label', default: 'Interview')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-interview" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-interview" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list interview">
			
				<g:if test="${interviewInstance?.interviewer}">
				<li class="fieldcontain">
					<span id="interviewer-label" class="property-label"><g:message code="interview.interviewer.label" default="Interviewer" /></span>
					
						<span class="property-value" aria-labelledby="interviewer-label"><g:fieldValue bean="${interviewInstance}" field="interviewer"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${interviewInstance?.startDate}">
				<li class="fieldcontain">
					<span id="startDate-label" class="property-label"><g:message code="interview.startDate.label" default="Start Date" /></span>
					
						<span class="property-value" aria-labelledby="startDate-label"><g:formatDate date="${interviewInstance?.startDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${interviewInstance?.endDate}">
				<li class="fieldcontain">
					<span id="endDate-label" class="property-label"><g:message code="interview.endDate.label" default="End Date" /></span>
					
						<span class="property-value" aria-labelledby="endDate-label"><g:formatDate date="${interviewInstance?.endDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${interviewInstance?.interviewCategory}">
				<li class="fieldcontain">
					<span id="interviewCategory-label" class="property-label"><g:message code="interview.interviewCategory.label" default="Interview Category" /></span>
					
						<span class="property-value" aria-labelledby="interviewCategory-label"><g:fieldValue bean="${interviewInstance}" field="interviewCategory"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${interviewInstance?.company}">
				<li class="fieldcontain">
					<span id="company-label" class="property-label"><g:message code="interview.company.label" default="Company" /></span>
					
						<span class="property-value" aria-labelledby="company-label"><g:fieldValue bean="${interviewInstance}" field="company"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${interviewInstance?.interviewStatus}">
				<li class="fieldcontain">
					<span id="interviewStatus-label" class="property-label"><g:message code="interview.interviewStatus.label" default="Interview Status" /></span>
					
						<span class="property-value" aria-labelledby="interviewStatus-label"><g:fieldValue bean="${interviewInstance}" field="interviewStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${interviewInstance?.interviewMethods}">
				<li class="fieldcontain">
					<span id="interviewMethods-label" class="property-label"><g:message code="interview.interviewMethods.label" default="Interview Methods" /></span>
					
						<g:each in="${interviewInstance.interviewMethods}" var="i">
						<span class="property-value" aria-labelledby="interviewMethods-label"><g:link controller="interviewMethod" action="show" id="${i.id}">${i?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:interviewInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${interviewInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
