

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'share.label', default: 'Share')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-share" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-share" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list share">
			
				<g:if test="${shareInstance?.companyName}">
				<li class="fieldcontain">
					<span id="companyName-label" class="property-label"><g:message code="share.companyName.label" default="Company Name" /></span>
					
						<span class="property-value" aria-labelledby="companyName-label"><g:fieldValue bean="${shareInstance}" field="companyName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shareInstance?.referenceAuthor}">
				<li class="fieldcontain">
					<span id="referenceAuthor-label" class="property-label"><g:message code="share.referenceAuthor.label" default="Reference Author" /></span>
					
						<span class="property-value" aria-labelledby="referenceAuthor-label"><g:fieldValue bean="${shareInstance}" field="referenceAuthor"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shareInstance?.createdDate}">
				<li class="fieldcontain">
					<span id="createdDate-label" class="property-label"><g:message code="share.createdDate.label" default="Created Date" /></span>
					
						<span class="property-value" aria-labelledby="createdDate-label"><g:formatDate date="${shareInstance?.createdDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${shareInstance?.emailTo}">
				<li class="fieldcontain">
					<span id="emailTo-label" class="property-label"><g:message code="share.emailTo.label" default="Email To" /></span>
					
						<span class="property-value" aria-labelledby="emailTo-label"><g:fieldValue bean="${shareInstance}" field="emailTo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shareInstance?.referenceCompleted}">
				<li class="fieldcontain">
					<span id="referenceCompleted-label" class="property-label"><g:message code="share.referenceCompleted.label" default="Reference Completed" /></span>
					
						<span class="property-value" aria-labelledby="referenceCompleted-label"><g:fieldValue bean="${shareInstance}" field="referenceCompleted"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shareInstance?.deactivateReference}">
				<li class="fieldcontain">
					<span id="deactivateReference-label" class="property-label"><g:message code="share.deactivateReference.label" default="Deactivate Reference" /></span>
					
						<span class="property-value" aria-labelledby="deactivateReference-label"><g:formatBoolean boolean="${shareInstance?.deactivateReference}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:shareInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${shareInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
