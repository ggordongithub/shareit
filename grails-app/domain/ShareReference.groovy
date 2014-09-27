import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString(includeNames = true, includeFields = true)
@EqualsAndHashCode
class ShareReference {
      String rating
      String referenceCategory
      int referenceAge

    static constraints = {
      rating(blank:true)
      referenceCategory(blank:true)
      referenceAge(blank:true)
    }

}
