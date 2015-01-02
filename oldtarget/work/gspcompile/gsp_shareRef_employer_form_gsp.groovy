import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employer_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employer/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("employer.employerName.label"),'default':("Employer Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("employerName"),'required':(""),'value':(employerInstance?.employerName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerQuestions', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("employer.employerQuestions.label"),'default':("Employer Questions")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("employerQuestions"),'required':(""),'value':(employerInstance?.employerQuestions)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerEmail', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("employer.employerEmail.label"),'default':("Employer Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("employerEmail"),'required':(""),'value':(employerInstance?.employerEmail)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerPhone', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("employer.employerPhone.label"),'default':("Employer Phone")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("employerPhone"),'required':(""),'value':(employerInstance?.employerPhone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'reportingRelationship', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("employer.reportingRelationship.label"),'default':("Reporting Relationship")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("reportingRelationship"),'required':(""),'value':(employerInstance?.reportingRelationship)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'yearsEmployed', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("employer.yearsEmployed.label"),'default':("Years Employed")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("yearsEmployed"),'required':(""),'value':(employerInstance?.yearsEmployed)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'confirmStartDate', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("employer.confirmStartDate.label"),'default':("Confirm Start Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',64,['name':("confirmStartDate"),'precision':("day"),'value':(employerInstance?.confirmStartDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'confirmEndDate', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("employer.confirmEndDate.label"),'default':("Confirm End Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',73,['name':("confirmEndDate"),'precision':("day"),'value':(employerInstance?.confirmEndDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerReferenceFirstName', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("employer.employerReferenceFirstName.label"),'default':("Employer Reference First Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',82,['name':("employerReferenceFirstName"),'required':(""),'value':(employerInstance?.employerReferenceFirstName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerReferenceLastName', 'error'))
printHtmlPart(12)
invokeTag('message','g',88,['code':("employer.employerReferenceLastName.label"),'default':("Employer Reference Last Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',91,['name':("employerReferenceLastName"),'required':(""),'value':(employerInstance?.employerReferenceLastName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerReferenceMiddleName', 'error'))
printHtmlPart(13)
invokeTag('message','g',97,['code':("employer.employerReferenceMiddleName.label"),'default':("Employer Reference Middle Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',100,['name':("employerReferenceMiddleName"),'required':(""),'value':(employerInstance?.employerReferenceMiddleName)],-1)
printHtmlPart(14)
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
