// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }

grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination

// The ACCEPT header will not be used for content negotiation for user agents containing the following strings (defaults to the 4 major rendering engines)
grails.mime.disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
grails.mime.types = [ // the first one is the default format
    all:           '*/*', // 'all' maps to '*' or the first available format in withFormat
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    hal:           ['application/hal+json','application/hal+xml'],
    xml:           ['text/xml', 'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// Legacy setting for codec used to encode data with ${}
grails.views.default.codec = "html"

// The default scope for controllers. May be prototype, session or singleton.
// If unspecified, controllers are prototype scoped.
grails.controllers.defaultScope = 'singleton'

// GSP settings
grails {
	mail {
		host = "smtp.gmail.com"
		port = 465
		username = "geraldgordon4@gmail.com"
		password = "myGod4life"
		props = ["mail.smtp.auth":"true",
				 "mail.smtp.socketFactory.port":"465",
				 "mail.smtp.socketFactory.class":"javax.net.ssl.SSLSocketFactory",
				 "mail.smtp.socketFactory.fallback":"false"]
	}
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside ${}
                scriptlet = 'html' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        // filteringCodecForContentType.'text/html' = 'html'
    }
}


grails.converters.encoding = "UTF-8"
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

// configure passing transaction's read-only attribute to Hibernate session, queries and criterias
// set "singleSession = false" OSIV mode in hibernate configuration after enabling
grails.hibernate.pass.readonly = false
// configure passing read-only to OSIV session by default, requires "singleSession = false" OSIV mode
grails.hibernate.osiv.readonly = false

environments {
    development {
        grails.logging.jul.usebridge = true
    }
    production {
        grails.logging.jul.usebridge = false
        // TODO: grails.serverURL = "http://www.changeme.com"
        // grails.serverURL = "http://localhost:9191/shareRef"
    }
}

// log4j configuration
log4j.main = {
    // Example of changing the log pattern for the default console appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}

    error  'org.codehaus.groovy.grails.web.servlet',        // controllers
           'org.codehaus.groovy.grails.web.pages',          // GSP
           'org.codehaus.groovy.grails.web.sitemesh',       // layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping',        // URL mapping
           'org.codehaus.groovy.grails.commons',            // core / classloading
           'org.codehaus.groovy.grails.plugins',            // plugins
           'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'

   // trace 'org.codehaus.groovy.grails.plugins.springsecurity' , 'org.springframework.security'
   // trace 'org.codehaus.groovy.grails.web.pages'          // GSP

    root {
        trace 'stdout'
        error()
        additivity = true
    }

}


// Added by the Spring Security Core plugin:
//grails.plugin.springsecurity.userLookup.userDomainClassName = 'SecUser'
//grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'SecUserSecRole'
//grails.plugin.springsecurity.authority.className = 'SecRole'
//grails.plugin.springsecurity.requestMap.className = 'Requestmap'
//grails.plugin.springsecurity.securityConfigType = 'Requestmap'
//grails.plugin.springsecurity.controllerAnnotations.staticRules = [
//	'/':                              ['permitAll'],
	//'/EmployeeController':            ['permitAll'],
	//'/index':                         ['permitAll'],
	//'/index.gsp':                     ['permitAll'],
	//'/**/js/**':                      ['permitAll'],
	//'/**/css/**':                     ['permitAll'],
	//'/**/images/**':                  ['permitAll'],
	//'/**/favicon.ico':                ['permitAll'],
	//'/login/**':                      ['permitAll'],
	//'/logout/**':                     ['permitAll']
//]

/* debug security 
grails.plugin.springsecurity.useSecurityEventListener = true
grails.plugin.springsecurity.onAbstractAuthenticationFailureEvent = { e, appCtx ->
   println "\nERROR auth failed for user $e.authentication.name: $e.exception.message\n"
}
*/

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'SecUser'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'SecUserSecRole'
grails.plugin.springsecurity.authority.className = 'SecRole'
grails.plugin.springsecurity.logout.postOnly = 'true'
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/employeeProfile'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	'/':                              ['IS_AUTHENTICATED_FULLY'],
	'/index':                         ['IS_AUTHENTICATED_FULLY'],
	'/index.gsp':                     ['IS_AUTHENTICATED_FULLY'],
	'/share.gsp':                     ['IS_AUTHENTICATED_FULLY'],
	'/**/profile/**':                 ['IS_AUTHENTICATED_FULLY'],
	'/**/eeprofile/**':               ['IS_AUTHENTICATED_FULLY'],
	'/**/modifyEmail/**':             ['IS_AUTHENTICATED_FULLY'],
	'/employeeProfile/**':            ['IS_AUTHENTICATED_FULLY'],
	'/springSecurityUI/**':           ['IS_AUTHENTICATED_FULLY'],
	'/persistentLogin/*':             ['IS_AUTHENTICATED_FULLY'],
	'/sec*/*':                        ['IS_AUTHENTICATED_FULLY'],
	'/user/*':                        ['IS_AUTHENTICATED_FULLY'],
	'/request*/*':                    ['IS_AUTHENTICATED_FULLY'],
	'/operate/*':                     ['IS_AUTHENTICATED_FULLY'],
	'/share/*':                       ['IS_AUTHENTICATED_FULLY'],
	'/role/**':                       ['IS_AUTHENTICATED_FULLY'],
	'/regist*/*':                     ['IS_AUTHENTICATED_FULLY'],
	'/fileShare/**':                  ['IS_AUTHENTICATED_FULLY'],
	'/dbconsole/**':                  ['IS_AUTHENTICATED_FULLY'],
	'/assets/**':                     ['permitAll'],
	'/register/**':                   ['permitAll'],
	'/plugins/**':                    ['permitAll'],
	'/**/js/**':                      ['permitAll'],
	'/**/css/**':                     ['permitAll'],
	'/**/images/**':                  ['permitAll'],
	'/**/images/home/**':             ['permitAll'],
	'/employ*/**':                    ['IS_AUTHENTICATED_FULLY'],
	'/intervi*/**':                   ['IS_AUTHENTICATED_FULLY'],
	'/invit*/**':                     ['IS_AUTHENTICATED_FULLY'],
	'/*location*/**':                 ['IS_AUTHENTICATED_FULLY'],
	'/*reference*/**':                ['IS_AUTHENTICATED_FULLY'],
	'/stat*/**':                      ['IS_AUTHENTICATED_FULLY'],
	'/**/favicon.ico':                ['permitAll'],
]
