import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employeeExperienceindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeExperience/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'employeeExperience.label', default: 'EmployeeExperience'))],-1)
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
invokeTag('sortableColumn','g',27,['property':("yearsKnown"),'title':(message(code: 'employeeExperience.yearsKnown.label', default: 'Years Known'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',29,['property':("experience"),'title':(message(code: 'employeeExperience.experience.label', default: 'Experience'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',31,['property':("clever"),'title':(message(code: 'employeeExperience.clever.label', default: 'Clever'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',33,['property':("smart"),'title':(message(code: 'employeeExperience.smart.label', default: 'Smart'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',35,['property':("hardDriving"),'title':(message(code: 'employeeExperience.hardDriving.label', default: 'Hard Driving'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',37,['property':("dependable"),'title':(message(code: 'employeeExperience.dependable.label', default: 'Dependable'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( employeeExperienceInstance in (employeeExperienceInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: employeeExperienceInstance, field: "yearsKnown"))
})
invokeTag('link','g',45,['action':("show"),'id':(employeeExperienceInstance.id)],3)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: employeeExperienceInstance, field: "experience"))
printHtmlPart(16)
invokeTag('formatBoolean','g',49,['boolean':(employeeExperienceInstance.clever)],-1)
printHtmlPart(16)
invokeTag('formatBoolean','g',51,['boolean':(employeeExperienceInstance.smart)],-1)
printHtmlPart(16)
invokeTag('formatBoolean','g',53,['boolean':(employeeExperienceInstance.hardDriving)],-1)
printHtmlPart(16)
invokeTag('formatBoolean','g',55,['boolean':(employeeExperienceInstance.dependable)],-1)
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','g',62,['total':(employeeExperienceInstanceCount ?: 0)],-1)
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
public static final long LAST_MODIFIED = 1414635000000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
