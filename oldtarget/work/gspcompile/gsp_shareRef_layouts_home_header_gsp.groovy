import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_layouts_home_header_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/home/_header.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(createLink(controller: 'logout'))
printHtmlPart(2)
invokeTag('username','sec',11,[:],-1)
printHtmlPart(3)
})
invokeTag('ifLoggedIn','sec',15,[:],1)
printHtmlPart(4)
createClosureForHtmlPart(5, 1)
invokeTag('ifNotLoggedIn','sec',18,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
expressionOut.print(request.contextPath)
printHtmlPart(8)
invokeTag('switchedUserOriginalUsername','sec',24,[:],-1)
printHtmlPart(9)
})
invokeTag('ifSwitched','sec',24,[:],1)
printHtmlPart(10)
expressionOut.print(resource(dir:'/'))
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1419883659000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
