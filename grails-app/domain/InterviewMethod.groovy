import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString(includeNames = true, includeFields = true)
@EqualsAndHashCode
class InterviewMethod {
//Fields must be lower case wow
    String methodName
	
	static belongTo = [interview:Interview]

    static constraints = {
      methodName(blank:true)
    }
}
