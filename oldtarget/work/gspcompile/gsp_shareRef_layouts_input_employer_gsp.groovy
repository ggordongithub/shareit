import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_layouts_input_employer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/input/_employer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (flash.message)) {
printHtmlPart(1)
expressionOut.print(flash.message)
printHtmlPart(2)
}
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(6)
expressionOut.print(error.field)
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('message','g',13,['error':(error)],-1)
printHtmlPart(9)
})
invokeTag('eachError','g',14,['bean':(employerInstance),'var':("error")],2)
printHtmlPart(10)
})
invokeTag('hasErrors','g',16,['bean':(employerInstance)],1)
printHtmlPart(11)
createTagBody(1, {->
printHtmlPart(12)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerName', 'error'))
printHtmlPart(13)
invokeTag('message','g',23,['code':("employer.employerName.label"),'default':("Employer Name")],-1)
printHtmlPart(14)
invokeTag('textField','g',26,['name':("employerName"),'required':(""),'value':(employerInstance?.employerName)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerEmail', 'error'))
printHtmlPart(16)
invokeTag('message','g',33,['code':("employer.employerEmail.label"),'default':("Employer Email")],-1)
printHtmlPart(14)
invokeTag('textField','g',36,['name':("employerEmail"),'required':(""),'value':(employerInstance?.employerEmail)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerPhone', 'error'))
printHtmlPart(18)
invokeTag('message','g',42,['code':("employer.employerPhone.label"),'default':("Employer Phone")],-1)
printHtmlPart(14)
invokeTag('textField','g',45,['name':("employerPhone"),'required':(""),'value':(employerInstance?.employerPhone)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: employerInstance, field: 'reportingRelationship', 'error'))
printHtmlPart(19)
invokeTag('message','g',51,['code':("employer.reportingRelationship.label"),'default':("Reporting Relationship")],-1)
printHtmlPart(14)
invokeTag('textField','g',54,['name':("reportingRelationship"),'required':(""),'value':(employerInstance?.reportingRelationship)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: employerInstance, field: 'yearsEmployed', 'error'))
printHtmlPart(20)
invokeTag('message','g',60,['code':("employer.yearsEmployed.label"),'default':("Years Employed")],-1)
printHtmlPart(14)
invokeTag('textField','g',63,['name':("yearsEmployed"),'required':(""),'value':(employerInstance?.yearsEmployed)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: employerInstance, field: 'confirmStartDate', 'error'))
printHtmlPart(21)
invokeTag('message','g',69,['code':("employer.confirmStartDate.label"),'default':("Confirm Start Date")],-1)
printHtmlPart(14)
invokeTag('datePicker','g',72,['name':("confirmStartDate"),'precision':("day"),'value':(employerInstance?.confirmStartDate)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: employerInstance, field: 'confirmEndDate', 'error'))
printHtmlPart(22)
invokeTag('message','g',78,['code':("employer.confirmEndDate.label"),'default':("Confirm End Date")],-1)
printHtmlPart(14)
invokeTag('datePicker','g',81,['name':("confirmEndDate"),'precision':("day"),'value':(employerInstance?.confirmEndDate)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerReferenceFirstName', 'error'))
printHtmlPart(23)
invokeTag('message','g',87,['code':("employer.employerReferenceFirstName.label"),'default':("Employer Reference First Name")],-1)
printHtmlPart(14)
invokeTag('textField','g',90,['name':("employerReferenceFirstName"),'required':(""),'value':(employerInstance?.employerReferenceFirstName)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerReferenceLastName', 'error'))
printHtmlPart(24)
invokeTag('message','g',96,['code':("employer.employerReferenceLastName.label"),'default':("Employer Reference Last Name")],-1)
printHtmlPart(14)
invokeTag('textField','g',99,['name':("employerReferenceLastName"),'required':(""),'value':(employerInstance?.employerReferenceLastName)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerReferenceMiddleName', 'error'))
printHtmlPart(25)
invokeTag('message','g',105,['code':("employer.employerReferenceMiddleName.label"),'default':("Employer Reference Middle Name")],-1)
printHtmlPart(14)
invokeTag('textField','g',108,['name':("employerReferenceMiddleName"),'required':(""),'value':(employerInstance?.employerReferenceMiddleName)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: employerInstance, field: 'employerQuestions', 'error'))
printHtmlPart(26)
invokeTag('message','g',114,['code':("employer.employerQuestions.label"),'default':("Employer Questions")],-1)
printHtmlPart(14)
invokeTag('textArea','g',117,['rows':("1"),'cols':("1"),'name':("employerQuestions"),'required':(""),'value':(employerInstance?.employerQuestions)],-1)
printHtmlPart(27)
invokeTag('submitButton','g',122,['class':("btn btn-primary btn-lg"),'name':("SAVE")],-1)
printHtmlPart(28)
})
invokeTag('form','g',124,['name':("subEmprForm"),'url':([resource:'employer', action:'save'])],1)
printHtmlPart(3)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417201833000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
