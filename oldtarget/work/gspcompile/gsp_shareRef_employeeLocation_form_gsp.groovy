import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employeeLocation_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeLocation/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: employeeLocationInstance, field: 'employee', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("employeeLocation.employee.label"),'default':("Employee")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("employee"),'name':("employee.id"),'from':(Employee.list()),'optionKey':("id"),'required':(""),'value':(employeeLocationInstance?.employee?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeLocationInstance, field: 'location', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("employeeLocation.location.label"),'default':("Location")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("location"),'name':("location.id"),'from':(Location.list()),'optionKey':("id"),'required':(""),'value':(employeeLocationInstance?.location?.id),'class':("many-to-one")],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414635223000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
