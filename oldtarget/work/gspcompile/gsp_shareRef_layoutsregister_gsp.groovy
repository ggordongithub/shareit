import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_layoutsregister_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/register.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',17,['default':("User Registration")],-1)
})
invokeTag('captureTitle','sitemesh',17,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',17,[:],2)
printHtmlPart(3)
expressionOut.print(resource(dir:'images',file:'favicon.ico'))
printHtmlPart(4)
expressionOut.print(assetPath(src: 'favicon.ico'))
printHtmlPart(5)
expressionOut.print(assetPath(src: 'apple-touch-icon.png'))
printHtmlPart(6)
expressionOut.print(assetPath(src: 'apple-touch-icon-retina.png'))
printHtmlPart(7)
invokeTag('resources','s2ui',27,['module':("register")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',29,['src':("application.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',30,['src':("css/main.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',31,['src':("bootstrap.css")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',32,['src':("application.js")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',33,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('layoutHead','g',35,[:],-1)
printHtmlPart(8)
invokeTag('layoutHead','g',40,[:],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',42,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('render','g',43,['template':("/layouts/home/header")],-1)
printHtmlPart(10)
invokeTag('layoutResources','s2ui',43,['module':("register")],-1)
printHtmlPart(2)
invokeTag('layoutBody','g',43,[:],-1)
printHtmlPart(10)
invokeTag('showFlash','s2ui',44,[:],-1)
printHtmlPart(11)
invokeTag('render','g',44,['template':("/layouts/home/footer")],-1)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',45,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417960856000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
