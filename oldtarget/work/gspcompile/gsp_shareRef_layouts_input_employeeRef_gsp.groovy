import EmployeeReference
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_layouts_input_employeeRef_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/input/_employeeRef.gsp" }
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
invokeTag('message','g',14,['error':(error)],-1)
printHtmlPart(9)
})
invokeTag('eachError','g',15,['bean':(employeeReferenceInstance),'var':("error")],2)
printHtmlPart(10)
})
invokeTag('hasErrors','g',17,['bean':(employeeReferenceInstance)],1)
printHtmlPart(11)
createTagBody(1, {->
printHtmlPart(12)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'name', 'error'))
printHtmlPart(13)
invokeTag('message','g',25,['code':("employeeReference.name.label"),'default':("Name")],-1)
printHtmlPart(14)
invokeTag('textField','g',28,['name':("name"),'required':(""),'value':(employeeReferenceInstance?.name)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceHeader', 'error'))
printHtmlPart(16)
invokeTag('message','g',34,['code':("employeeReference.referenceHeader.label"),'default':("Reference Salutation")],-1)
printHtmlPart(14)
invokeTag('textArea','g',37,['name':("referenceHeader"),'required':(""),'style':("width: 300px; height: 50px;"),'value':(employeeReferenceInstance?.referenceHeader)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceAbstract', 'error'))
printHtmlPart(17)
invokeTag('message','g',43,['code':("employeeReference.referenceAbstract.label"),'default':("Reference Abstract")],-1)
printHtmlPart(14)
invokeTag('textArea','g',46,['name':("referenceAbstract"),'style':("width: 300px; height: 50px;"),'required':(""),'value':(employeeReferenceInstance?.referenceAbstract)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceBody', 'error'))
printHtmlPart(18)
invokeTag('message','g',52,['code':("employeeReference.referenceBody.label"),'default':("Reference Body")],-1)
printHtmlPart(14)
invokeTag('textArea','g',55,['name':("referenceBody"),'required':(""),'style':("width: 400px; height: 120px;"),'value':(employeeReferenceInstance?.referenceBody)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceFooter', 'error'))
printHtmlPart(19)
invokeTag('message','g',61,['code':("employeeReference.referenceFooter.label"),'default':("Reference Summary")],-1)
printHtmlPart(14)
invokeTag('textArea','g',64,['name':("referenceFooter"),'required':(""),'style':("width: 400px; height: 90px;"),'value':(employeeReferenceInstance?.referenceFooter)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'referenceNote', 'error'))
printHtmlPart(20)
invokeTag('message','g',70,['code':("employeeReference.referenceNote.label"),'default':("Reference Note")],-1)
printHtmlPart(14)
invokeTag('textArea','g',73,['name':("referenceNote"),'required':(""),'style':("width: 400px; height: 70px;"),'value':(employeeReferenceInstance?.referenceNote)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'expiredDate', 'error'))
printHtmlPart(21)
invokeTag('message','g',79,['code':("employeeReference.expiredDate.label"),'default':("Expired Date")],-1)
printHtmlPart(14)
invokeTag('datePicker','g',82,['name':("expiredDate"),'precision':("day"),'value':(employeeReferenceInstance?.expiredDate)],-1)
printHtmlPart(22)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'imageLogo', 'error'))
printHtmlPart(23)
invokeTag('message','g',88,['code':("employeeReference.imageLogo.label"),'default':("Image Logo")],-1)
printHtmlPart(14)
invokeTag('textField','g',91,['name':("imageLogo"),'required':(""),'value':(employeeReferenceInstance?.imageLogo)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: employeeReferenceInstance, field: 'employee', 'error'))
printHtmlPart(24)
invokeTag('message','g',96,['code':("employeeReference.employee.label"),'default':("Employee")],-1)
printHtmlPart(14)
invokeTag('select','g',100,['id':("employee"),'name':("employee.id"),'from':(Employee.list()),'optionKey':("id"),'required':(""),'value':(employeeReferenceInstance?.employee?.id),'class':("many-to-one")],-1)
printHtmlPart(25)
invokeTag('submitButton','g',104,['class':("btn btn-primary btn-lg store"),'name':("SAVE")],-1)
printHtmlPart(26)
})
invokeTag('form','g',105,['name':("subEmpForm"),'url':([resource:'employeeRef', action:'save'])],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418501089000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
