import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Interview {
//Fields must be lower case wow
    String interviewer
    Date startDate
    Date endDate
    String interviewCategory
    String company
    String interviewStatus

	static hasMany = [interviewMethods: InterviewMethod]

    static constraints = {
      interviewer(blank:true)
      startDate(blank:true)
      endDate(blank:true)
      interviewCategory(blank:true)
      company(blank:true)
      interviewStatus(blank:true)

    }
}
