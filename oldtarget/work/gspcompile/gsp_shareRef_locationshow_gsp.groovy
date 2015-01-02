import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_locationshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/location/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'location.label', default: 'Location'))],-1)
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
if(true && (locationInstance?.address)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("location.address.label"),'default':("Address")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(locationInstance),'field':("address")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.city)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("location.city.label"),'default':("City")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',39,['bean':(locationInstance),'field':("city")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.state)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("location.state.label"),'default':("State")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',48,['bean':(locationInstance),'field':("state")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.zip)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("location.zip.label"),'default':("Zip")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',57,['bean':(locationInstance),'field':("zip")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.country)) {
printHtmlPart(23)
invokeTag('message','g',64,['code':("location.country.label"),'default':("Country")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',66,['bean':(locationInstance),'field':("country")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.employeeLocation)) {
printHtmlPart(25)
invokeTag('message','g',73,['code':("location.employeeLocation.label"),'default':("Employee Location")],-1)
printHtmlPart(26)
createTagBody(3, {->
expressionOut.print(locationInstance?.employeeLocation?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("employeeLocation"),'action':("show"),'id':(locationInstance?.employeeLocation?.id)],3)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (locationInstance?.employerLocation)) {
printHtmlPart(27)
invokeTag('message','g',82,['code':("location.employerLocation.label"),'default':("Employer Location")],-1)
printHtmlPart(28)
createTagBody(3, {->
expressionOut.print(locationInstance?.employerLocation?.encodeAsHTML())
})
invokeTag('link','g',84,['controller':("employerLocation"),'action':("show"),'id':(locationInstance?.employerLocation?.id)],3)
printHtmlPart(15)
}
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(30)
createTagBody(3, {->
invokeTag('message','g',92,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',92,['class':("edit"),'action':("edit"),'resource':(locationInstance)],3)
printHtmlPart(31)
invokeTag('actionSubmit','g',93,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(32)
})
invokeTag('form','g',95,['url':([resource:locationInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',97,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414635296000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
