<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Share Reference Profile</title>
<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}"
	type="image/x-icon">
<link rel="apple-touch-icon"
	href="${assetPath(src: 'apple-touch-icon.png')}">
<link rel="apple-touch-icon" sizes="114x114"
	href="${assetPath(src: 'apple-touch-icon-retina.png')}">
<asset:stylesheet src="application.css" />
<asset:stylesheet src="css/main.css" />
<asset:javascript src="application.js" />
<style type="text/css" media="screen">
#status {
	background-color: #eee;
	border: .2em solid #fff;
	margin: 2em 2em 1em;
	padding: 1em;
	width: 12em;
	float: left;
	-moz-box-shadow: 0px 0px 1.25em #ccc;
	-webkit-box-shadow: 0px 0px 1.25em #ccc;
	box-shadow: 0px 0px 1.25em #ccc;
	-moz-border-radius: 0.6em;
	-webkit-border-radius: 0.6em;
	border-radius: 0.6em;
}

.ie6 #status {
	display: inline;
	/* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
}

#status ul {
	font-size: 0.9em;
	list-style-type: none;
	margin-bottom: 0.6em;
	padding: 0;
}

#status li {
	line-height: 1.3;
}

#status h1 {
	text-transform: uppercase;
	font-size: 1.1em;
	margin: 0 0 0.3em;
}

#page-body {
	margin: 2em 1em 1.25em 18em;
}

h2 {
	margin-top: 1em;
	margin-bottom: 0.3em;
	font-size: 1em;
}

p {
	line-height: 1.5;
	margin: 0.25em 0;
}

#controller-list ul {
	list-style-position: inside;
}

#controller-list li {
	line-height: 1.3;
	list-style-position: inside;
	margin: 0.25em 0;
}

@media screen and (max-width: 480px) {
	#status {
		display: none;
	}
	#page-body {
		margin: 0 1em 1em;
	}
	#page-body h1 {
		margin-top: 0;
	}
}
</style>
</head>
<body>
     <g:render template="/layouts/header" />
	<div id="carousel">

		<div class="clear"></div>

		<div id="slides">
			<ul>
				<li>
					<div id="employee_input">
						<g:render template="/layouts/input/employee"></g:render>
					</div>
				</li>
				<li>
					<div id="employer_input">
						<g:render template="/layouts/input/employer"></g:render>
					</div>
				</li>
				<li>
					<div id="employeehist_input">
						<g:render template="/layouts/input/employeehist"></g:render>
					</div>
				</li>
			</ul>
		</div>

		<div class="clear"></div>

		<div id="buttons">
			<a href="#" id="prev">prev</a> <a href="#" id="next">next</a>
			<div class="clear"></div>
		</div>

	</div>
<!--  
	<a href="#page-body" class="skip"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div id="status" role="complementary">
		<h1>Application Status</h1>
		<ul>
			<li>App version: <g:meta name="app.version" /></li>
			<li>Grails version: <g:meta name="app.grails.version" /></li>
			<li>Groovy version: ${GroovySystem.getVersion()}</li>
			<li>JVM version: ${System.getProperty('java.version')}</li>
			<li>Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</li>
			<li>Controllers: ${grailsApplication.controllerClasses.size()}</li>
			<li>Domains: ${grailsApplication.domainClasses.size()}</li>
			<li>Services: ${grailsApplication.serviceClasses.size()}</li>
			<li>Tag Libraries: ${grailsApplication.tagLibClasses.size()}</li>
		</ul>
		<h1>Installed Plugins</h1>
		<ul>
			<g:each var="plugin"
				in="${applicationContext.getBean('pluginManager').allPlugins}">
				<li>
					${plugin.name} - ${plugin.version}
				</li>
			</g:each>
		</ul>
	</div>
	<div id="page-body" role="main">
		<h1>Welcome to Grails</h1>
		<p>Congratulations, you have successfully started your first
			Grails application! At the moment this is the default page, feel free
			to modify it to either redirect to a controller or display whatever
			content you may choose. Below is a list of controllers that are
			currently deployed in this application, click on each to execute its
			default action:</p>

		<div id="controller-list" role="navigation">
			<h2>Available Controllers:</h2>
			<ul>
				<g:each var="c"
					in="${grailsApplication.controllerClasses.sort { it.fullName } }">
					<li class="controller"><g:link
							controller="${c.logicalPropertyName}">
							${c.fullName}
						</g:link></li>
				</g:each>
			</ul>
	   </div>
	   </div>
	   -->
	<div id="spinner" class="spinner" style="display: none;">
		<g:message code="spinner.alt" default="Loading&hellip;" />
	</div>
	<div class="footer" role="contentinfo">
		<g:render template="/layouts/home/footer"></g:render>
	</div>
</body>
</html>
