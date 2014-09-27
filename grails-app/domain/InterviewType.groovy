import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString(includeNames = true, includeFields = true)
@EqualsAndHashCode
class InterviewType {
//Fields must be lower case wow
    String name

    static constraints = {
      name(blank:true)
    }
}
