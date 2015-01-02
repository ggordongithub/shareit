import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employeeReferenceshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeReference/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'employeeReference.label', default: 'EmployeeReference'))],-1)
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
if(true && (employeeReferenceInstance?.name)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("employeeReference.name.label"),'default':("Name")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(employeeReferenceInstance),'field':("name")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.referenceHeader)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("employeeReference.referenceHeader.label"),'default':("Reference Header")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',39,['bean':(employeeReferenceInstance),'field':("referenceHeader")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.referenceAbstract)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("employeeReference.referenceAbstract.label"),'default':("Reference Abstract")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',48,['bean':(employeeReferenceInstance),'field':("referenceAbstract")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.referenceBody)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("employeeReference.referenceBody.label"),'default':("Reference Body")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',57,['bean':(employeeReferenceInstance),'field':("referenceBody")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.referenceFooter)) {
printHtmlPart(23)
invokeTag('message','g',64,['code':("employeeReference.referenceFooter.label"),'default':("Reference Footer")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',66,['bean':(employeeReferenceInstance),'field':("referenceFooter")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.referenceNote)) {
printHtmlPart(25)
invokeTag('message','g',73,['code':("employeeReference.referenceNote.label"),'default':("Reference Note")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',75,['bean':(employeeReferenceInstance),'field':("referenceNote")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.dateCreated)) {
printHtmlPart(27)
invokeTag('message','g',82,['code':("employeeReference.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',84,['date':(employeeReferenceInstance?.dateCreated)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.expiredDate)) {
printHtmlPart(29)
invokeTag('message','g',91,['code':("employeeReference.expiredDate.label"),'default':("Expired Date")],-1)
printHtmlPart(30)
invokeTag('formatDate','g',93,['date':(employeeReferenceInstance?.expiredDate)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.lastUpdated)) {
printHtmlPart(31)
invokeTag('message','g',100,['code':("employeeReference.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(32)
invokeTag('formatDate','g',102,['date':(employeeReferenceInstance?.lastUpdated)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.referenceScore)) {
printHtmlPart(33)
invokeTag('message','g',109,['code':("employeeReference.referenceScore.label"),'default':("Reference Score")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',111,['bean':(employeeReferenceInstance),'field':("referenceScore")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.imageLogo)) {
printHtmlPart(35)
invokeTag('message','g',118,['code':("employeeReference.imageLogo.label"),'default':("Image Logo")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',120,['bean':(employeeReferenceInstance),'field':("imageLogo")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeReferenceInstance?.employee)) {
printHtmlPart(37)
invokeTag('message','g',127,['code':("employeeReference.employee.label"),'default':("Employee")],-1)
printHtmlPart(38)
createTagBody(3, {->
expressionOut.print(employeeReferenceInstance?.employee?.encodeAsHTML())
})
invokeTag('link','g',129,['controller':("employee"),'action':("show"),'id':(employeeReferenceInstance?.employee?.id)],3)
printHtmlPart(15)
}
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
createTagBody(3, {->
invokeTag('message','g',137,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',137,['class':("edit"),'action':("edit"),'resource':(employeeReferenceInstance)],3)
printHtmlPart(41)
invokeTag('actionSubmit','g',138,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(42)
})
invokeTag('form','g',140,['url':([resource:employeeReferenceInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',142,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417405641000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
