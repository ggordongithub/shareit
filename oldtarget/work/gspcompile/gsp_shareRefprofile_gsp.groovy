import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRefprofile_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/profile.gsp" }
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
invokeTag('stylesheet','asset',21,['src':("bootstrap.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',22,['src':("application.js")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',23,['src':("bootstrap.js")],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',103,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('render','g',105,['template':("/layouts/header")],-1)
printHtmlPart(9)
invokeTag('render','g',114,['template':("/layouts/input/employer")],-1)
printHtmlPart(10)
invokeTag('render','g',119,['template':("/layouts/input/employeeHist")],-1)
printHtmlPart(11)
invokeTag('render','g',124,['template':("/layouts/input/employeeExp")],-1)
printHtmlPart(12)
invokeTag('render','g',129,['template':("/layouts/input/employeeRef")],-1)
printHtmlPart(13)
invokeTag('message','g',151,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(14)
invokeTag('render','g',153,['template':("/layouts/home/footer")],-1)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',156,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417406233000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
