import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_layoutsshare_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/share.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',12,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(assetPath(src: 'favicon.ico'))
printHtmlPart(3)
expressionOut.print(assetPath(src: 'apple-touch-icon.png'))
printHtmlPart(4)
expressionOut.print(assetPath(src: 'apple-touch-icon-retina.png'))
printHtmlPart(5)
invokeTag('stylesheet','asset',20,['src':("application.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',21,['src':("css/main.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',22,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',23,['src':("application.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',24,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('layoutHead','g',25,[:],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',26,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('image','asset',29,['src':("grails_logo.png"),'alt':("Grails")],-1)
printHtmlPart(7)
invokeTag('render','g',31,['template':("/layouts/home/header")],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(8)
invokeTag('render','g',35,['template':("/layouts/home/share")],-1)
printHtmlPart(11)
invokeTag('render','g',37,['template':("/layouts/home/footer")],-1)
printHtmlPart(12)
invokeTag('message','g',41,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(13)
invokeTag('meta','g',45,['name':("app.version")],-1)
printHtmlPart(14)
invokeTag('meta','g',46,['name':("app.grails.version")],-1)
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
invokeTag('link','g',82,['controller':(c.logicalPropertyName)],3)
printHtmlPart(30)
}
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',87,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418592253000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
