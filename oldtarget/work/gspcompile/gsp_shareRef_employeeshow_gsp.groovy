import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employeeshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employee/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'employee.label', default: 'Employee'))],-1)
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
if(true && (employeeInstance?.employeeTitle)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("employee.employeeTitle.label"),'default':("Employee Title")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(employeeInstance),'field':("employeeTitle")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.sirName)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("employee.sirName.label"),'default':("Sir Name")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',39,['bean':(employeeInstance),'field':("sirName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.firstName)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("employee.firstName.label"),'default':("First Name")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',48,['bean':(employeeInstance),'field':("firstName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.middleName)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("employee.middleName.label"),'default':("Middle Name")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',57,['bean':(employeeInstance),'field':("middleName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.lastName)) {
printHtmlPart(23)
invokeTag('message','g',64,['code':("employee.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',66,['bean':(employeeInstance),'field':("lastName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.suffixName)) {
printHtmlPart(25)
invokeTag('message','g',73,['code':("employee.suffixName.label"),'default':("Suffix Name")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',75,['bean':(employeeInstance),'field':("suffixName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.email)) {
printHtmlPart(27)
invokeTag('message','g',82,['code':("employee.email.label"),'default':("Email")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',84,['bean':(employeeInstance),'field':("email")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.cellPhone)) {
printHtmlPart(29)
invokeTag('message','g',91,['code':("employee.cellPhone.label"),'default':("Cell Phone")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',93,['bean':(employeeInstance),'field':("cellPhone")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.workPhone)) {
printHtmlPart(31)
invokeTag('message','g',100,['code':("employee.workPhone.label"),'default':("Work Phone")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',102,['bean':(employeeInstance),'field':("workPhone")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.homePhone)) {
printHtmlPart(33)
invokeTag('message','g',109,['code':("employee.homePhone.label"),'default':("Home Phone")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',111,['bean':(employeeInstance),'field':("homePhone")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.salaryRange)) {
printHtmlPart(35)
invokeTag('message','g',118,['code':("employee.salaryRange.label"),'default':("Salary Range")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',120,['bean':(employeeInstance),'field':("salaryRange")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.resumeCurrent)) {
printHtmlPart(37)
invokeTag('message','g',127,['code':("employee.resumeCurrent.label"),'default':("Resume Current")],-1)
printHtmlPart(38)
invokeTag('formatBoolean','g',129,['boolean':(employeeInstance?.resumeCurrent)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeInstance?.employeeExperiences)) {
printHtmlPart(39)
invokeTag('message','g',136,['code':("employee.employeeExperiences.label"),'default':("Employee Experiences")],-1)
printHtmlPart(40)
for( e in (employeeInstance.employeeExperiences) ) {
printHtmlPart(41)
createTagBody(4, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',139,['controller':("employeeExperience"),'action':("show"),'id':(e.id)],4)
printHtmlPart(42)
}
printHtmlPart(43)
}
printHtmlPart(16)
if(true && (employeeInstance?.employeeHistories)) {
printHtmlPart(44)
invokeTag('message','g',147,['code':("employee.employeeHistories.label"),'default':("Employee Histories")],-1)
printHtmlPart(40)
for( e in (employeeInstance.employeeHistories) ) {
printHtmlPart(45)
createTagBody(4, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',150,['controller':("employeeHistory"),'action':("show"),'id':(e.id)],4)
printHtmlPart(42)
}
printHtmlPart(43)
}
printHtmlPart(16)
if(true && (employeeInstance?.employeeLocations)) {
printHtmlPart(46)
invokeTag('message','g',158,['code':("employee.employeeLocations.label"),'default':("Employee Locations")],-1)
printHtmlPart(40)
for( e in (employeeInstance.employeeLocations) ) {
printHtmlPart(47)
createTagBody(4, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',161,['controller':("employeeLocation"),'action':("show"),'id':(e.id)],4)
printHtmlPart(42)
}
printHtmlPart(43)
}
printHtmlPart(16)
if(true && (employeeInstance?.employeeReferences)) {
printHtmlPart(48)
invokeTag('message','g',169,['code':("employee.employeeReferences.label"),'default':("Employee References")],-1)
printHtmlPart(40)
for( e in (employeeInstance.employeeReferences) ) {
printHtmlPart(49)
createTagBody(4, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',172,['controller':("employeeReference"),'action':("show"),'id':(e.id)],4)
printHtmlPart(42)
}
printHtmlPart(43)
}
printHtmlPart(16)
if(true && (employeeInstance?.employers)) {
printHtmlPart(50)
invokeTag('message','g',180,['code':("employee.employers.label"),'default':("Employers")],-1)
printHtmlPart(40)
for( e in (employeeInstance.employers) ) {
printHtmlPart(51)
createTagBody(4, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',183,['controller':("employer"),'action':("show"),'id':(e.id)],4)
printHtmlPart(42)
}
printHtmlPart(43)
}
printHtmlPart(16)
if(true && (employeeInstance?.prospectEmployers)) {
printHtmlPart(52)
invokeTag('message','g',191,['code':("employee.prospectEmployers.label"),'default':("Prospect Employers")],-1)
printHtmlPart(40)
for( p in (employeeInstance.prospectEmployers) ) {
printHtmlPart(53)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',194,['controller':("prospectEmployer"),'action':("show"),'id':(p.id)],4)
printHtmlPart(42)
}
printHtmlPart(43)
}
printHtmlPart(16)
if(true && (employeeInstance?.sharedReferences)) {
printHtmlPart(54)
invokeTag('message','g',202,['code':("employee.sharedReferences.label"),'default':("Shared References")],-1)
printHtmlPart(40)
for( s in (employeeInstance.sharedReferences) ) {
printHtmlPart(55)
createTagBody(4, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',205,['controller':("shareReference"),'action':("show"),'id':(s.id)],4)
printHtmlPart(42)
}
printHtmlPart(43)
}
printHtmlPart(56)
createTagBody(2, {->
printHtmlPart(57)
createTagBody(3, {->
invokeTag('message','g',214,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',214,['class':("edit"),'action':("edit"),'resource':(employeeInstance)],3)
printHtmlPart(58)
invokeTag('actionSubmit','g',215,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(59)
})
invokeTag('form','g',217,['url':([resource:employeeInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(60)
})
invokeTag('captureBody','sitemesh',219,[:],1)
printHtmlPart(61)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414633959000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
