import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_layouts_input_employee_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/input/_employee.gsp" }
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
invokeTag('eachError','g',14,['bean':(employeeInstance),'var':("error")],2)
printHtmlPart(10)
})
invokeTag('hasErrors','g',16,['bean':(employeeInstance)],1)
printHtmlPart(11)
createTagBody(1, {->
printHtmlPart(12)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employeeTitle', 'error'))
printHtmlPart(13)
invokeTag('message','g',24,['code':("employee.employeeTitle.label"),'default':("Employee Title")],-1)
printHtmlPart(14)
invokeTag('textField','g',28,['name':("employeeTitle"),'required':(""),'value':(employeeInstance?.employeeTitle)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'sirName', 'error'))
printHtmlPart(16)
invokeTag('message','g',34,['code':("employee.sirName.label"),'default':("Sir Name")],-1)
printHtmlPart(17)
invokeTag('select','g',39,['name':("sirName"),'from':(['NA', 'Mr.', 'Ms.', 'Mrs.', 'Sr.', 'Miss.']),'required':(""),'value':(employeeInstance?.sirName),'valueMessagePrefix':("employee.sirName")],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'firstName', 'error'))
printHtmlPart(19)
invokeTag('message','g',46,['code':("employee.firstName.label"),'default':("First Name")],-1)
printHtmlPart(14)
invokeTag('textField','g',50,['name':("firstName"),'required':(""),'value':(employeeInstance?.firstName)],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'middleName', 'error'))
printHtmlPart(20)
invokeTag('message','g',57,['code':("employee.middleName.label"),'default':("Middle Name")],-1)
printHtmlPart(14)
invokeTag('textField','g',61,['name':("middleName"),'required':(""),'value':(employeeInstance?.middleName)],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'lastName', 'error'))
printHtmlPart(21)
invokeTag('message','g',68,['code':("employee.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(14)
invokeTag('textField','g',72,['name':("lastName"),'required':(""),'value':(employeeInstance?.lastName)],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'suffixName', 'error'))
printHtmlPart(22)
invokeTag('message','g',79,['code':("employee.suffixName.label"),'default':("Suffix Name")],-1)
printHtmlPart(17)
invokeTag('select','g',84,['name':("suffixName"),'from':(['NA', 'I', 'II', 'III', 'IV', 'V', 'VI']),'required':(""),'value':(employeeInstance?.suffixName),'valueMessagePrefix':("employee.suffixName")],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'email', 'error'))
printHtmlPart(23)
invokeTag('message','g',91,['code':("employee.email.label"),'default':("Email")],-1)
printHtmlPart(24)
invokeTag('field','g',94,['type':("email"),'name':("email"),'required':(""),'value':(employeeInstance?.email)],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'cellPhone', 'error'))
printHtmlPart(25)
invokeTag('message','g',101,['code':("employee.cellPhone.label"),'default':("Cell Phone")],-1)
printHtmlPart(14)
invokeTag('textField','g',105,['name':("cellPhone"),'required':(""),'value':(employeeInstance?.cellPhone)],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'workPhone', 'error'))
printHtmlPart(26)
invokeTag('message','g',112,['code':("employee.workPhone.label"),'default':("Work Phone")],-1)
printHtmlPart(27)
invokeTag('textField','g',115,['name':("workPhone"),'value':(employeeInstance?.workPhone)],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'homePhone', 'error'))
printHtmlPart(28)
invokeTag('message','g',122,['code':("employee.homePhone.label"),'default':("Home Phone")],-1)
printHtmlPart(27)
invokeTag('textField','g',125,['name':("homePhone"),'value':(employeeInstance?.homePhone)],-1)
printHtmlPart(29)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'resumeCurrent', 'error'))
printHtmlPart(30)
invokeTag('message','g',133,['code':("employee.resumeCurrent.label"),'default':("Resume Current")],-1)
printHtmlPart(27)
invokeTag('checkBox','g',137,['name':("resumeCurrent"),'value':(employeeInstance?.resumeCurrent)],-1)
printHtmlPart(31)
invokeTag('submitButton','g',142,['class':("btn btn-primary btn-lg store"),'name':("SAVE")],-1)
printHtmlPart(32)
})
invokeTag('form','g',1,['name':("subEmpForm"),'url':([resource:'employee', action:'save'])],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417266169000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
