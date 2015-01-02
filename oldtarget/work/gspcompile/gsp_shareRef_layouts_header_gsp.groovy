import grails.util.Holders
import grails.plugin.springsecurity.SpringSecurityUtils
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_layouts_header_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/_header.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
expressionOut.print(createLink(controller: 'logout'))
printHtmlPart(3)
invokeTag('username','sec',11,[:],-1)
printHtmlPart(4)
})
invokeTag('ifLoggedIn','sec',15,[:],1)
printHtmlPart(5)
createClosureForHtmlPart(6, 1)
invokeTag('ifNotLoggedIn','sec',17,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(request.contextPath)
printHtmlPart(9)
invokeTag('switchedUserOriginalUsername','sec',20,[:],-1)
printHtmlPart(10)
})
invokeTag('ifSwitched','sec',20,[:],1)
printHtmlPart(11)
expressionOut.print(resource(dir:'/'))
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1419883643000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
