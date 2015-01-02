import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employerindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employer/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'employer.label', default: 'Employer'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',27,['property':("employerName"),'title':(message(code: 'employer.employerName.label', default: 'Employer Name'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',29,['property':("employerQuestions"),'title':(message(code: 'employer.employerQuestions.label', default: 'Employer Questions'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',31,['property':("employerEmail"),'title':(message(code: 'employer.employerEmail.label', default: 'Employer Email'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',33,['property':("employerPhone"),'title':(message(code: 'employer.employerPhone.label', default: 'Employer Phone'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',35,['property':("reportingRelationship"),'title':(message(code: 'employer.reportingRelationship.label', default: 'Reporting Relationship'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',37,['property':("yearsEmployed"),'title':(message(code: 'employer.yearsEmployed.label', default: 'Years Employed'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( employerInstance in (employerInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: employerInstance, field: "employerName"))
})
invokeTag('link','g',45,['action':("show"),'id':(employerInstance.id)],3)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: employerInstance, field: "employerQuestions"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: employerInstance, field: "employerEmail"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: employerInstance, field: "employerPhone"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: employerInstance, field: "reportingRelationship"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: employerInstance, field: "yearsEmployed"))
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','g',62,['total':(employerInstanceCount ?: 0)],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1412642591000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
