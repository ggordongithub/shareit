import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employeeReference_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeReference/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("employeeReference.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'required':(""),'value':(employeeReferenceInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceHeader', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("employeeReference.referenceHeader.label"),'default':("Reference Header")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("referenceHeader"),'required':(""),'value':(employeeReferenceInstance?.referenceHeader)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceAbstract', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("employeeReference.referenceAbstract.label"),'default':("Reference Abstract")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("referenceAbstract"),'required':(""),'value':(employeeReferenceInstance?.referenceAbstract)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceBody', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("employeeReference.referenceBody.label"),'default':("Reference Body")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("referenceBody"),'required':(""),'value':(employeeReferenceInstance?.referenceBody)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceFooter', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("employeeReference.referenceFooter.label"),'default':("Reference Footer")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("referenceFooter"),'required':(""),'value':(employeeReferenceInstance?.referenceFooter)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceNote', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("employeeReference.referenceNote.label"),'default':("Reference Note")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("referenceNote"),'required':(""),'value':(employeeReferenceInstance?.referenceNote)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'expiredDate', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("employeeReference.expiredDate.label"),'default':("Expired Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',64,['name':("expiredDate"),'precision':("day"),'value':(employeeReferenceInstance?.expiredDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceScore', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("employeeReference.referenceScore.label"),'default':("Reference Score")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("referenceScore"),'type':("number"),'value':(employeeReferenceInstance.referenceScore),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'imageLogo', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("employeeReference.imageLogo.label"),'default':("Image Logo")],-1)
printHtmlPart(2)
invokeTag('textField','g',82,['name':("imageLogo"),'required':(""),'value':(employeeReferenceInstance?.imageLogo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'employee', 'error'))
printHtmlPart(12)
invokeTag('message','g',88,['code':("employeeReference.employee.label"),'default':("Employee")],-1)
printHtmlPart(2)
invokeTag('select','g',91,['id':("employee"),'name':("employee.id"),'from':(Employee.list()),'optionKey':("id"),'required':(""),'value':(employeeReferenceInstance?.employee?.id),'class':("many-to-one")],-1)
printHtmlPart(13)
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
