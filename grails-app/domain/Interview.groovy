import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString(includeNames = true, includeFields = true)
@EqualsAndHashCode
class Interview {
//Fields must be lower case wow
    String interviewer
    Date startDate
    Date endDate
    String interviewCategory
    String company
    String status

    static constraints = {
      interviewer(blank:true)
      startDate(blank:true)
      endDate(blank:true)
      interviewCategory(blank:true)
      company(blank:true)
      status(blank:true)
    }
}
