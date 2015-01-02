import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employee_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employee/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employeeTitle', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("employee.employeeTitle.label"),'default':("Employee Title")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("employeeTitle"),'required':(""),'value':(employeeInstance?.employeeTitle)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'sirName', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("employee.sirName.label"),'default':("Sir Name")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['name':("sirName"),'from':(employeeInstance.constraints.sirName.inList),'required':(""),'value':(employeeInstance?.sirName),'valueMessagePrefix':("employee.sirName")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'firstName', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("employee.firstName.label"),'default':("First Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("firstName"),'required':(""),'value':(employeeInstance?.firstName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'middleName', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("employee.middleName.label"),'default':("Middle Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("middleName"),'required':(""),'value':(employeeInstance?.middleName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'lastName', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("employee.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("lastName"),'required':(""),'value':(employeeInstance?.lastName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'suffixName', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("employee.suffixName.label"),'default':("Suffix Name")],-1)
printHtmlPart(2)
invokeTag('select','g',55,['name':("suffixName"),'from':(employeeInstance.constraints.suffixName.inList),'required':(""),'value':(employeeInstance?.suffixName),'valueMessagePrefix':("employee.suffixName")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'email', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("employee.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',64,['type':("email"),'name':("email"),'required':(""),'value':(employeeInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'cellPhone', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("employee.cellPhone.label"),'default':("Cell Phone")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("cellPhone"),'required':(""),'value':(employeeInstance?.cellPhone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'workPhone', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("employee.workPhone.label"),'default':("Work Phone")],-1)
printHtmlPart(12)
invokeTag('textField','g',82,['name':("workPhone"),'value':(employeeInstance?.workPhone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'homePhone', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("employee.homePhone.label"),'default':("Home Phone")],-1)
printHtmlPart(12)
invokeTag('textField','g',91,['name':("homePhone"),'value':(employeeInstance?.homePhone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'salaryRange', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("employee.salaryRange.label"),'default':("Salary Range")],-1)
printHtmlPart(2)
invokeTag('field','g',100,['name':("salaryRange"),'type':("number"),'value':(employeeInstance.salaryRange),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'resumeCurrent', 'error'))
printHtmlPart(15)
invokeTag('message','g',106,['code':("employee.resumeCurrent.label"),'default':("Resume Current")],-1)
printHtmlPart(12)
invokeTag('checkBox','g',109,['name':("resumeCurrent"),'value':(employeeInstance?.resumeCurrent)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employeeExperiences', 'error'))
printHtmlPart(16)
invokeTag('message','g',115,['code':("employee.employeeExperiences.label"),'default':("Employee Experiences")],-1)
printHtmlPart(17)
for( e in (employeeInstance?.employeeExperiences) ) {
printHtmlPart(18)
createTagBody(2, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',121,['controller':("employeeExperience"),'action':("show"),'id':(e.id)],2)
printHtmlPart(19)
}
printHtmlPart(20)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'employeeExperience.label', default: 'EmployeeExperience')]))
})
invokeTag('link','g',124,['controller':("employeeExperience"),'action':("create"),'params':(['employee.id': employeeInstance?.id])],1)
printHtmlPart(21)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employeeHistories', 'error'))
printHtmlPart(22)
invokeTag('message','g',133,['code':("employee.employeeHistories.label"),'default':("Employee Histories")],-1)
printHtmlPart(17)
for( e in (employeeInstance?.employeeHistories) ) {
printHtmlPart(18)
createTagBody(2, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',139,['controller':("employeeHistory"),'action':("show"),'id':(e.id)],2)
printHtmlPart(19)
}
printHtmlPart(20)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'employeeHistory.label', default: 'EmployeeHistory')]))
})
invokeTag('link','g',142,['controller':("employeeHistory"),'action':("create"),'params':(['employee.id': employeeInstance?.id])],1)
printHtmlPart(21)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employeeLocations', 'error'))
printHtmlPart(23)
invokeTag('message','g',151,['code':("employee.employeeLocations.label"),'default':("Employee Locations")],-1)
printHtmlPart(17)
for( e in (employeeInstance?.employeeLocations) ) {
printHtmlPart(18)
createTagBody(2, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',157,['controller':("employeeLocation"),'action':("show"),'id':(e.id)],2)
printHtmlPart(19)
}
printHtmlPart(20)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'employeeLocation.label', default: 'EmployeeLocation')]))
})
invokeTag('link','g',160,['controller':("employeeLocation"),'action':("create"),'params':(['employee.id': employeeInstance?.id])],1)
printHtmlPart(21)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employeeReferences', 'error'))
printHtmlPart(24)
invokeTag('message','g',169,['code':("employee.employeeReferences.label"),'default':("Employee References")],-1)
printHtmlPart(17)
for( e in (employeeInstance?.employeeReferences) ) {
printHtmlPart(18)
createTagBody(2, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',175,['controller':("employeeReference"),'action':("show"),'id':(e.id)],2)
printHtmlPart(19)
}
printHtmlPart(20)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'employeeReference.label', default: 'EmployeeReference')]))
})
invokeTag('link','g',178,['controller':("employeeReference"),'action':("create"),'params':(['employee.id': employeeInstance?.id])],1)
printHtmlPart(21)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employers', 'error'))
printHtmlPart(25)
invokeTag('message','g',187,['code':("employee.employers.label"),'default':("Employers")],-1)
printHtmlPart(17)
for( e in (employeeInstance?.employers) ) {
printHtmlPart(18)
createTagBody(2, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',193,['controller':("employer"),'action':("show"),'id':(e.id)],2)
printHtmlPart(19)
}
printHtmlPart(20)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'employer.label', default: 'Employer')]))
})
invokeTag('link','g',196,['controller':("employer"),'action':("create"),'params':(['employee.id': employeeInstance?.id])],1)
printHtmlPart(21)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'prospectEmployers', 'error'))
printHtmlPart(26)
invokeTag('message','g',205,['code':("employee.prospectEmployers.label"),'default':("Prospect Employers")],-1)
printHtmlPart(17)
for( p in (employeeInstance?.prospectEmployers) ) {
printHtmlPart(18)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',211,['controller':("prospectEmployer"),'action':("show"),'id':(p.id)],2)
printHtmlPart(19)
}
printHtmlPart(20)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'prospectEmployer.label', default: 'ProspectEmployer')]))
})
invokeTag('link','g',214,['controller':("prospectEmployer"),'action':("create"),'params':(['employee.id': employeeInstance?.id])],1)
printHtmlPart(21)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'sharedReferences', 'error'))
printHtmlPart(27)
invokeTag('message','g',223,['code':("employee.sharedReferences.label"),'default':("Shared References")],-1)
printHtmlPart(17)
for( s in (employeeInstance?.sharedReferences) ) {
printHtmlPart(18)
createTagBody(2, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',229,['controller':("shareReference"),'action':("show"),'id':(s.id)],2)
printHtmlPart(19)
}
printHtmlPart(20)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'shareReference.label', default: 'ShareReference')]))
})
invokeTag('link','g',232,['controller':("shareReference"),'action':("create"),'params':(['employee.id': employeeInstance?.id])],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414633957000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
