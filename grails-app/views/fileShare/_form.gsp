



<div class="fieldcontain ${hasErrors(bean: fileShareInstance, field: 'filePayload', 'error')} ">
	<label for="filePayload">
		<g:message code="fileShare.filePayload.label" default="File Payload" />
		
	</label>
	<input type="file" id="filePayload" name="filePayload" />

</div>

<div class="fieldcontain ${hasErrors(bean: fileShareInstance, field: 'fileType', 'error')} ">
	<label for="fileType">
		<g:message code="fileShare.fileType.label" default="File Type" />
		
	</label>
	<g:textField name="fileType" value="${fileShareInstance?.fileType}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fileShareInstance, field: 'fileName', 'error')} ">
	<label for="fileName">
		<g:message code="fileShare.fileName.label" default="File Name" />
		
	</label>
	<g:textField name="fileName" value="${fileShareInstance?.fileName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fileShareInstance, field: 'photo', 'error')} ">
	<label for="photo">
		<g:message code="fileShare.photo.label" default="Photo" />
		
	</label>
	<g:checkBox name="photo" value="${fileShareInstance?.photo}" />

</div>

