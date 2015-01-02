import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employer/show.gsp" }
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
if(true && (employerInstance?.employerName)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("employer.employerName.label"),'default':("Employer Name")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(employerInstance),'field':("employerName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.employerQuestions)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("employer.employerQuestions.label"),'default':("Employer Questions")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',39,['bean':(employerInstance),'field':("employerQuestions")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.employerEmail)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("employer.employerEmail.label"),'default':("Employer Email")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',48,['bean':(employerInstance),'field':("employerEmail")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.employerPhone)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("employer.employerPhone.label"),'default':("Employer Phone")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',57,['bean':(employerInstance),'field':("employerPhone")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.reportingRelationship)) {
printHtmlPart(23)
invokeTag('message','g',64,['code':("employer.reportingRelationship.label"),'default':("Reporting Relationship")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',66,['bean':(employerInstance),'field':("reportingRelationship")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.yearsEmployed)) {
printHtmlPart(25)
invokeTag('message','g',73,['code':("employer.yearsEmployed.label"),'default':("Years Employed")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',75,['bean':(employerInstance),'field':("yearsEmployed")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.confirmStartDate)) {
printHtmlPart(27)
invokeTag('message','g',82,['code':("employer.confirmStartDate.label"),'default':("Confirm Start Date")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',84,['date':(employerInstance?.confirmStartDate)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.confirmEndDate)) {
printHtmlPart(29)
invokeTag('message','g',91,['code':("employer.confirmEndDate.label"),'default':("Confirm End Date")],-1)
printHtmlPart(30)
invokeTag('formatDate','g',93,['date':(employerInstance?.confirmEndDate)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.employerReferenceFirstName)) {
printHtmlPart(31)
invokeTag('message','g',100,['code':("employer.employerReferenceFirstName.label"),'default':("Employer Reference First Name")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',102,['bean':(employerInstance),'field':("employerReferenceFirstName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.employerReferenceLastName)) {
printHtmlPart(33)
invokeTag('message','g',109,['code':("employer.employerReferenceLastName.label"),'default':("Employer Reference Last Name")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',111,['bean':(employerInstance),'field':("employerReferenceLastName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employerInstance?.employerReferenceMiddleName)) {
printHtmlPart(35)
invokeTag('message','g',118,['code':("employer.employerReferenceMiddleName.label"),'default':("Employer Reference Middle Name")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',120,['bean':(employerInstance),'field':("employerReferenceMiddleName")],-1)
printHtmlPart(15)
}
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
createTagBody(3, {->
invokeTag('message','g',128,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',128,['class':("edit"),'action':("edit"),'resource':(employerInstance)],3)
printHtmlPart(39)
invokeTag('actionSubmit','g',129,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',131,['url':([resource:employerInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',133,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1412642592000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
