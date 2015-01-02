import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_interviewshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/interview/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'interview.label', default: 'Interview'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (interviewInstance?.interviewer)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("interview.interviewer.label"),'default':("Interviewer")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(interviewInstance),'field':("interviewer")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (interviewInstance?.startDate)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("interview.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(18)
invokeTag('formatDate','g',39,['date':(interviewInstance?.startDate)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (interviewInstance?.endDate)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("interview.endDate.label"),'default':("End Date")],-1)
printHtmlPart(20)
invokeTag('formatDate','g',48,['date':(interviewInstance?.endDate)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (interviewInstance?.interviewCategory)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("interview.interviewCategory.label"),'default':("Interview Category")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',57,['bean':(interviewInstance),'field':("interviewCategory")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (interviewInstance?.company)) {
printHtmlPart(23)
invokeTag('message','g',64,['code':("interview.company.label"),'default':("Company")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',66,['bean':(interviewInstance),'field':("company")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (interviewInstance?.interviewStatus)) {
printHtmlPart(25)
invokeTag('message','g',73,['code':("interview.interviewStatus.label"),'default':("Interview Status")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',75,['bean':(interviewInstance),'field':("interviewStatus")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (interviewInstance?.interviewMethods)) {
printHtmlPart(27)
invokeTag('message','g',82,['code':("interview.interviewMethods.label"),'default':("Interview Methods")],-1)
printHtmlPart(28)
for( i in (interviewInstance.interviewMethods) ) {
printHtmlPart(29)
createTagBody(4, {->
expressionOut.print(i?.encodeAsHTML())
})
invokeTag('link','g',85,['controller':("interviewMethod"),'action':("show"),'id':(i.id)],4)
printHtmlPart(30)
}
printHtmlPart(31)
}
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(33)
createTagBody(3, {->
invokeTag('message','g',94,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',94,['class':("edit"),'action':("edit"),'resource':(interviewInstance)],3)
printHtmlPart(34)
invokeTag('actionSubmit','g',95,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(35)
})
invokeTag('form','g',97,['url':([resource:interviewInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',99,[:],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414537416000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
