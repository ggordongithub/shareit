import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employeeExperienceshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeExperience/show.gsp" }
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
if(true && (employeeExperienceInstance?.yearsKnown)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("employeeExperience.yearsKnown.label"),'default':("Years Known")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(employeeExperienceInstance),'field':("yearsKnown")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.experience)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("employeeExperience.experience.label"),'default':("Experience")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',39,['bean':(employeeExperienceInstance),'field':("experience")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.clever)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("employeeExperience.clever.label"),'default':("Clever")],-1)
printHtmlPart(20)
invokeTag('formatBoolean','g',48,['boolean':(employeeExperienceInstance?.clever)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.smart)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("employeeExperience.smart.label"),'default':("Smart")],-1)
printHtmlPart(22)
invokeTag('formatBoolean','g',57,['boolean':(employeeExperienceInstance?.smart)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.hardDriving)) {
printHtmlPart(23)
invokeTag('message','g',64,['code':("employeeExperience.hardDriving.label"),'default':("Hard Driving")],-1)
printHtmlPart(24)
invokeTag('formatBoolean','g',66,['boolean':(employeeExperienceInstance?.hardDriving)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.dependable)) {
printHtmlPart(25)
invokeTag('message','g',73,['code':("employeeExperience.dependable.label"),'default':("Dependable")],-1)
printHtmlPart(26)
invokeTag('formatBoolean','g',75,['boolean':(employeeExperienceInstance?.dependable)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.wellSpokenOf)) {
printHtmlPart(27)
invokeTag('message','g',82,['code':("employeeExperience.wellSpokenOf.label"),'default':("Well Spoken Of")],-1)
printHtmlPart(28)
invokeTag('formatBoolean','g',84,['boolean':(employeeExperienceInstance?.wellSpokenOf)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.analytical)) {
printHtmlPart(29)
invokeTag('message','g',91,['code':("employeeExperience.analytical.label"),'default':("Analytical")],-1)
printHtmlPart(30)
invokeTag('formatBoolean','g',93,['boolean':(employeeExperienceInstance?.analytical)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.entrepreneurial)) {
printHtmlPart(31)
invokeTag('message','g',100,['code':("employeeExperience.entrepreneurial.label"),'default':("Entrepreneurial")],-1)
printHtmlPart(32)
invokeTag('formatBoolean','g',102,['boolean':(employeeExperienceInstance?.entrepreneurial)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.businessMinded)) {
printHtmlPart(33)
invokeTag('message','g',109,['code':("employeeExperience.businessMinded.label"),'default':("Business Minded")],-1)
printHtmlPart(34)
invokeTag('formatBoolean','g',111,['boolean':(employeeExperienceInstance?.businessMinded)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.inventive)) {
printHtmlPart(35)
invokeTag('message','g',118,['code':("employeeExperience.inventive.label"),'default':("Inventive")],-1)
printHtmlPart(36)
invokeTag('formatBoolean','g',120,['boolean':(employeeExperienceInstance?.inventive)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.resultOriented)) {
printHtmlPart(37)
invokeTag('message','g',127,['code':("employeeExperience.resultOriented.label"),'default':("Result Oriented")],-1)
printHtmlPart(38)
invokeTag('formatBoolean','g',129,['boolean':(employeeExperienceInstance?.resultOriented)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeExperienceInstance?.employee)) {
printHtmlPart(39)
invokeTag('message','g',136,['code':("employeeExperience.employee.label"),'default':("Employee")],-1)
printHtmlPart(40)
createTagBody(3, {->
expressionOut.print(employeeExperienceInstance?.employee?.encodeAsHTML())
})
invokeTag('link','g',138,['controller':("employee"),'action':("show"),'id':(employeeExperienceInstance?.employee?.id)],3)
printHtmlPart(15)
}
printHtmlPart(41)
createTagBody(2, {->
printHtmlPart(42)
createTagBody(3, {->
invokeTag('message','g',146,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',146,['class':("edit"),'action':("edit"),'resource':(employeeExperienceInstance)],3)
printHtmlPart(43)
invokeTag('actionSubmit','g',147,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(44)
})
invokeTag('form','g',149,['url':([resource:employeeExperienceInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(45)
})
invokeTag('captureBody','sitemesh',151,[:],1)
printHtmlPart(46)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414635004000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
