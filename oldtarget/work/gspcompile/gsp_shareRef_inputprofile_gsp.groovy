import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_inputprofile_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/input/profile.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(3)
expressionOut.print(assetPath(src: 'favicon.ico'))
printHtmlPart(4)
expressionOut.print(assetPath(src: 'apple-touch-icon.png'))
printHtmlPart(5)
expressionOut.print(assetPath(src: 'apple-touch-icon-retina.png'))
printHtmlPart(6)
invokeTag('stylesheet','asset',19,['src':("application.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',20,['src':("css/main.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',21,['src':("application.js")],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',97,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('render','g',99,['template':("/layouts/header")],-1)
printHtmlPart(9)
invokeTag('render','g',108,['template':("/layouts/input/employee")],-1)
printHtmlPart(10)
invokeTag('render','g',113,['template':("/layouts/input/employer")],-1)
printHtmlPart(11)
invokeTag('render','g',118,['template':("/layouts/input/employeehist")],-1)
printHtmlPart(12)
invokeTag('message','g',134,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(13)
invokeTag('meta','g',138,['name':("app.version")],-1)
printHtmlPart(14)
invokeTag('meta','g',139,['name':("app.grails.version")],-1)
printHtmlPart(15)
expressionOut.print(GroovySystem.getVersion())
printHtmlPart(16)
expressionOut.print(System.getProperty('java.version'))
printHtmlPart(17)
expressionOut.print(grails.util.Environment.reloadingAgentEnabled)
printHtmlPart(18)
expressionOut.print(grailsApplication.controllerClasses.size())
printHtmlPart(19)
expressionOut.print(grailsApplication.domainClasses.size())
printHtmlPart(20)
expressionOut.print(grailsApplication.serviceClasses.size())
printHtmlPart(21)
expressionOut.print(grailsApplication.tagLibClasses.size())
printHtmlPart(22)
for( plugin in (applicationContext.getBean('pluginManager').allPlugins) ) {
printHtmlPart(23)
expressionOut.print(plugin.name)
printHtmlPart(24)
expressionOut.print(plugin.version)
printHtmlPart(25)
}
printHtmlPart(26)
for( c in (grailsApplication.controllerClasses.sort { it.fullName }) ) {
printHtmlPart(27)
createTagBody(3, {->
printHtmlPart(28)
expressionOut.print(c.fullName)
printHtmlPart(29)
})
invokeTag('link','g',175,['controller':(c.logicalPropertyName)],3)
printHtmlPart(30)
}
printHtmlPart(31)
invokeTag('message','g',182,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(32)
invokeTag('render','g',185,['template':("/layouts/home/footer")],-1)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',187,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414450359000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
