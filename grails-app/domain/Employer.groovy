import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString(includeNames = true, includeFields = true)
@EqualsAndHashCode
class Employer {
    String employerName
    String employerQuestions
    String employerEmail
    String employerPhone
    String reportingRelationship
    String yearsEmployed
    Date confirmStartDate
    Date confirmEndDate
    String employerReferenceFirstName
    String employerReferenceLastName
    String employerReferenceMiddleName

    static constraints = {
       employerName(blank:true)
       employerQuestions(blank:true)
       employerEmail (blank:true)
       employerPhone(blank:true)
       reportingRelationship(blank:true)
       yearsEmployed(blank:true)
       confirmStartDate(blank:true)
       confirmEndDate(blank:true)
       employerReferenceFirstName(blank:true)
       employerReferenceLastName(blank:true)
       employerReferenceMiddleName(blank:true)
    }
}
