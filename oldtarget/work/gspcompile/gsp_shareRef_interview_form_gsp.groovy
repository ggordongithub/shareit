import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_interview_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/interview/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: interviewInstance, field: 'interviewer', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("interview.interviewer.label"),'default':("Interviewer")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("interviewer"),'required':(""),'value':(interviewInstance?.interviewer)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: interviewInstance, field: 'startDate', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("interview.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',19,['name':("startDate"),'precision':("day"),'value':(interviewInstance?.startDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: interviewInstance, field: 'endDate', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("interview.endDate.label"),'default':("End Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("endDate"),'precision':("day"),'value':(interviewInstance?.endDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: interviewInstance, field: 'interviewCategory', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("interview.interviewCategory.label"),'default':("Interview Category")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("interviewCategory"),'required':(""),'value':(interviewInstance?.interviewCategory)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: interviewInstance, field: 'company', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("interview.company.label"),'default':("Company")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("company"),'required':(""),'value':(interviewInstance?.company)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: interviewInstance, field: 'interviewStatus', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("interview.interviewStatus.label"),'default':("Interview Status")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("interviewStatus"),'required':(""),'value':(interviewInstance?.interviewStatus)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: interviewInstance, field: 'interviewMethods', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("interview.interviewMethods.label"),'default':("Interview Methods")],-1)
printHtmlPart(10)
invokeTag('select','g',64,['name':("interviewMethods"),'from':(InterviewMethod.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(interviewInstance?.interviewMethods*.id),'class':("many-to-many")],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414537415000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
