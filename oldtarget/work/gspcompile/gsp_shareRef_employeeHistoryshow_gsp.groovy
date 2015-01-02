import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_shareRef_employeeHistoryshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employeeHistory/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'employeeHistory.label', default: 'EmployeeHistory'))],-1)
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
if(true && (employeeHistoryInstance?.promotionInCompany)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("employeeHistory.promotionInCompany.label"),'default':("Promotion In Company")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(employeeHistoryInstance),'field':("promotionInCompany")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.conflict)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("employeeHistory.conflict.label"),'default':("Conflict")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',39,['bean':(employeeHistoryInstance),'field':("conflict")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.teamPlayer)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("employeeHistory.teamPlayer.label"),'default':("Team Player")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',48,['bean':(employeeHistoryInstance),'field':("teamPlayer")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.handlePressure)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("employeeHistory.handlePressure.label"),'default':("Handle Pressure")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',57,['bean':(employeeHistoryInstance),'field':("handlePressure")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.temperament)) {
printHtmlPart(23)
invokeTag('message','g',64,['code':("employeeHistory.temperament.label"),'default':("Temperament")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',66,['bean':(employeeHistoryInstance),'field':("temperament")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.alert)) {
printHtmlPart(25)
invokeTag('message','g',73,['code':("employeeHistory.alert.label"),'default':("Alert")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',75,['bean':(employeeHistoryInstance),'field':("alert")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.strongestSkills)) {
printHtmlPart(27)
invokeTag('message','g',82,['code':("employeeHistory.strongestSkills.label"),'default':("Strongest Skills")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',84,['bean':(employeeHistoryInstance),'field':("strongestSkills")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.weakestSkills)) {
printHtmlPart(29)
invokeTag('message','g',91,['code':("employeeHistory.weakestSkills.label"),'default':("Weakest Skills")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',93,['bean':(employeeHistoryInstance),'field':("weakestSkills")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.tardyOften)) {
printHtmlPart(31)
invokeTag('message','g',100,['code':("employeeHistory.tardyOften.label"),'default':("Tardy Often")],-1)
printHtmlPart(32)
invokeTag('formatBoolean','g',102,['boolean':(employeeHistoryInstance?.tardyOften)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.managementStyle)) {
printHtmlPart(33)
invokeTag('message','g',109,['code':("employeeHistory.managementStyle.label"),'default':("Management Style")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',111,['bean':(employeeHistoryInstance),'field':("managementStyle")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.willYouRehire)) {
printHtmlPart(35)
invokeTag('message','g',118,['code':("employeeHistory.willYouRehire.label"),'default':("Will You Rehire")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',120,['bean':(employeeHistoryInstance),'field':("willYouRehire")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.getlongWithCoworkers)) {
printHtmlPart(37)
invokeTag('message','g',127,['code':("employeeHistory.getlongWithCoworkers.label"),'default':("Getlong With Coworkers")],-1)
printHtmlPart(38)
invokeTag('fieldValue','g',129,['bean':(employeeHistoryInstance),'field':("getlongWithCoworkers")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.getAlongWithMgt)) {
printHtmlPart(39)
invokeTag('message','g',136,['code':("employeeHistory.getAlongWithMgt.label"),'default':("Get Along With Mgt")],-1)
printHtmlPart(40)
invokeTag('fieldValue','g',138,['bean':(employeeHistoryInstance),'field':("getAlongWithMgt")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.jobResponsibilities)) {
printHtmlPart(41)
invokeTag('message','g',145,['code':("employeeHistory.jobResponsibilities.label"),'default':("Job Responsibilities")],-1)
printHtmlPart(42)
invokeTag('fieldValue','g',147,['bean':(employeeHistoryInstance),'field':("jobResponsibilities")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.whyDidEmployeeLeave)) {
printHtmlPart(43)
invokeTag('message','g',154,['code':("employeeHistory.whyDidEmployeeLeave.label"),'default':("Why Did Employee Leave")],-1)
printHtmlPart(44)
invokeTag('fieldValue','g',156,['bean':(employeeHistoryInstance),'field':("whyDidEmployeeLeave")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (employeeHistoryInstance?.highIntegrity)) {
printHtmlPart(45)
invokeTag('message','g',163,['code':("employeeHistory.highIntegrity.label"),'default':("High Integrity")],-1)
printHtmlPart(46)
invokeTag('fieldValue','g',165,['bean':(employeeHistoryInstance),'field':("highIntegrity")],-1)
printHtmlPart(15)
}
printHtmlPart(47)
createTagBody(2, {->
printHtmlPart(48)
createTagBody(3, {->
invokeTag('message','g',173,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',173,['class':("edit"),'action':("edit"),'resource':(employeeHistoryInstance)],3)
printHtmlPart(49)
invokeTag('actionSubmit','g',174,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(50)
})
invokeTag('form','g',176,['url':([resource:employeeHistoryInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(51)
})
invokeTag('captureBody','sitemesh',178,[:],1)
printHtmlPart(52)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1412646535000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
