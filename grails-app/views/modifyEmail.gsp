<html>
<head>
<meta name="layout" content="main">
<title>modify email</title>
<style type="text/css" media="screen">
body {
	margin: 0 auto;
}

#title {
	position: relative;
	text-align: center;
	background-color: #eff0f2;
	border-bottom: 3px solid #e3e4e8;
	border-radius: 6px;
	padding: 12px;
	margin-bottom: 12px;
	margin-left: 12px;
}
</style>
<g:javascript>

	//$( "#mEmail" ).tabs();
	//$( "#tabs" ).tabs();
	
	//$(function() {
	$(document).ready(function($) {
        $( '#tabs' ).tab();
    });
	
    function pop(){
	   jConfirm("Are you sure you want to set all your email contents to default? You must press save to complete transaction!", 'Confirmation Dialog', function(r) {
               if (r) {
                       jAlert("Restoring Default Request Email");
                  } else {
                      jAlert("Ok Set Default Operation Cancelled" );
                      return; 
                  }
        });
				   var salutation_address = "Dear [Your Reference Author Name Inserted Here],"; 
			       var salutation_message = "\rI am looking to assemble a strong set of recommendations would you feel comfortable" +
		                                     " providing me a highly positive reference."; 

		var body = "If you are able " 
		+ "to attest to my qualifications for employment and the skills I "  
		+ "attained during my tenure at [Company Name Inserted Here], I " 
		+ "would greatly appreciate it. \r\rPlease let me know if there is any " 
		+ "information I can provide regarding my experience to assist you in " 
		+ "giving me a reference. You can reply back to this email to reach me "
		+ "for additional details about this request. "
		+ "\r\rTo make this process efficient and easy, I’m using an online tool "
		+ "called Shared References, please click on this link: shared references "
		+ "and fill out the reference form. The reference will then be stored in my "
		+ "personal database for employers to access. You can also use this link "
		+ "to update the reference within 10 days of the initial submission.";
		
		var close = "I am looking to assemble a strong set of recommendations"
		+ " would you feel comfortable supplying a highly positive reference."; 
		var	end = "Thank you very much for your consideration."
		+ "\r\rSincerely," 
		+ "\r\r[Your Name Inserted Here] ";

		$("#begin").val(salutation_address + "\n" + salutation_message); 
		$("#middle").val(body);

		$("#end").val(end); 

	}

    function pop2(){
	   jConfirm("Are you sure you want to set all your email contents to default? You must press save to complete transaction!", 'Confirmation Dialog', function(r) {
               if (r) {
                       jAlert("Restoring Default Request Email");
                  } else {
                      jAlert("Ok Set Default Operation Cancelled" );
                      return; 
                  }
        });
				   var salutation_address = "Dear [Your Reference Author Name Inserted Here],"; 
			       var salutation_message = "\rI am looking to assemble a strong set of recommendations would you feel comfortable" +
		                                     " providing me a highly positive reference."; 

	}	

	</g:javascript>
</head>

<body>
	<ul id="tabs" class="nav nav-tabs" data-tabs="tabs">
		<li><a href="#home" data-toggle="tab">Home</a></li>
		<li class="active"><a href="#requestForm" data-toggle="tab">Request
				Email Form</a></li>
		<li><a href="#shareForm" data-toggle="tab">Share Email Form</a></li>
	</ul>

	<div class="tab-content">
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>

		<div class="tab-pane" id="home">Use these forms to modify email
			contents for reference requests or sharing your reference</div>

		<div class="tab-pane active" id="requestForm">
			<g:hasErrors bean="${requestFormInstance}">
				<ul class="errors" role="alert">
					<g:eachError bean="${requestFormInstance}" var="error">
						<li
							<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
								error="${error}" /></li>
					</g:eachError>
				</ul>
			</g:hasErrors>

			<g:form method="post" name='requestEmailForm'
				url="[resource:'requestForm', action:'save']">

				<div id="requestForm">Request Email Form</div>
				<p class="ebutton">
					<button type="button"
						style="position: relative; margin: 2% 2% 2% 37%;"
						class="btn btn-primary btn-lg store" name="set_default"
						onclick="pop()">SET DEFAULT EMAIL</button>
				</p>

				<div
					class="fieldcontain ${hasErrors(bean: requestForm, field: 'begin', 'error')} required">
					<label for="begin"> <g:message
							code="requestForm.begin.label" default="Enter Salutation" /> <span
						class="required-indicator">*</span>
					</label>
					<g:textArea escapeHtml="true" style="width:500px; height:200px;"
						name="begin" id="begin" required=""
						value="${requestFormInstance?.begin}" />

				</div>


				<div
					class="fieldcontain ${hasErrors(bean: requestFormInstance, field: 'middle', 'error')} required">
					<label for="middle"> <g:message
							code="referenceForm.middle.label"
							default="Enter Reference Request Body" /> <span
						class="required-indicator">*</span>
					</label>
					<g:textArea escapeHtml="true" style="width:500px; height:300px;"
						name="middle" id="middle" required=""
						value="${referenceFormInstance?.middle}" />

				</div>

				<div
					class="fieldcontain ${hasErrors(bean: requestFormInstance, field: 'end', 'error')} required">
					<label for="end"> <g:message code="requestForm.end.label"
							default="Enter Closing" /> <span class="required-indicator">*</span>
					</label>
					<g:textArea escapeHtml="true" style="width:500px; height:200px;"
						name="end" id="end" required=""
						value="${requestFormInstance?.end}" />

				</div>

				<div
					class="fieldcontain ${hasErrors(bean: employeeLocationInstance, field: 'employee', 'error')} required">
					<label for="employee"> <g:message
							code="employeeLocation.employee.label" default="Employee" />
					</label>
					<g:select id="employee" name="employee.id"
						from="${Employee.list()}" optionKey="id" required=""
						value="${employeeLocationInstance?.employee?.id}"
						class="many-to-one" />

				</div>

				<p class="ebutton">
					<g:submitButton
						style="position: relative; margin: 2% 2% 2% 40%; width:150px;"
						class="btn btn-primary btn-lg store" name="SAVE"></g:submitButton>
				</p>
			</g:form>

		</div>

		<div class="tab-pane" id="shareForm">
			<g:hasErrors bean="${requestFormInstance}">
				<ul class="errors" role="alert">
					<g:eachError bean="${requestFormInstance}" var="error">
						<li
							<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
								error="${error}" /></li>
					</g:eachError>
				</ul>
			</g:hasErrors>


			<g:form name='shareEmailForm'
				url="[resource:'shareForm', action:'update']">

				<div id="shareForm">Share Email Form</div>
				<p class="ebutton">
					<button type="button"
						style="position: relative; margin: 2% 2% 2% 37%;"
						class="btn btn-primary btn-lg store" name="set_default"
						onclick="pop()">SET DEFAULT EMAIL</button>
				</p>

				<div
					class="fieldcontain ${hasErrors(bean: shareForm, field: 'begin', 'error')} required">
					<label for="begin"> <g:message code="shareForm.begin.label"
							default="Enter Salutation" /> <span class="required-indicator">*</span>
					</label>
					<g:textArea style="width:500px; height:200px;" name="begin"
						id="begin" required="" value="${shareFormInstance?.begin}" />

				</div>

				<div
					class="fieldcontain ${hasErrors(bean: shareFormInstance, field: 'middle', 'error')} required">
					<label for="middle"> <g:message
							code="shareForm.middle.label" default="Enter Share Body" /> <span
						class="required-indicator">*</span>
					</label>
					<g:textArea style="width:500px; height:300px;" name="middle"
						id="middle" required="" value="${shareFormInstance?.middle}" />

				</div>

				<div
					class="fieldcontain ${hasErrors(bean: shareFormInstance, field: 'end', 'error')} required">
					<label for="end"> <g:message code="shareForm.end.label"
							default="Enter Closing" /> <span class="required-indicator">*</span>
					</label>
					<g:textArea style="width:500px; height:200px;" name="end" id="end"
						required="" value="${shareFormInstance?.end}" />

				</div>

				<p class="ebutton">
					<g:submitButton
						style="position: relative; margin: 2% 2% 2% 40%; width:150px;"
						class="btn btn-primary btn-lg store" name="SAVE"></g:submitButton>
				</p>

			</g:form>

		</div>
	</div>
</body>
</html>
