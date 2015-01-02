import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_location_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/location/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: locationInstance, field: 'address', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("location.address.label"),'default':("Address")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("address"),'required':(""),'value':(locationInstance?.address)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'city', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("location.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("city"),'required':(""),'value':(locationInstance?.city)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'state', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("location.state.label"),'default':("State")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("state"),'required':(""),'value':(locationInstance?.state)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'zip', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("location.zip.label"),'default':("Zip")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("zip"),'required':(""),'value':(locationInstance?.zip)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'country', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("location.country.label"),'default':("Country")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("country"),'required':(""),'value':(locationInstance?.country)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'employeeLocation', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("location.employeeLocation.label"),'default':("Employee Location")],-1)
printHtmlPart(2)
invokeTag('select','g',55,['id':("employeeLocation"),'name':("employeeLocation.id"),'from':(EmployeeLocation.list()),'optionKey':("id"),'required':(""),'value':(locationInstance?.employeeLocation?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: locationInstance, field: 'employerLocation', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("location.employerLocation.label"),'default':("Employer Location")],-1)
printHtmlPart(2)
invokeTag('select','g',64,['id':("employerLocation"),'name':("employerLocation.id"),'from':(EmployerLocation.list()),'optionKey':("id"),'required':(""),'value':(locationInstance?.employerLocation?.id),'class':("many-to-one")],-1)
printHtmlPart(10)
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
