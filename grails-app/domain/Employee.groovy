import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString(includeNames = true, includeFields = true)
@EqualsAndHashCode
class Employee {
    String sirName = "NA"
    String firstName
    String lastName
    String middleName
    String suffixName = "NA" 
    String cellPhone
    String workPhone
    String homePhone
    String email
    String employeeTitle
    int salaryRange
    boolean resumeCurrent

    static constraints = {
        employeeTitle(blank: false)
        sirName(inList: ["NA", "Mr.", "Ms.", "Mrs.", "Sr.", "Miss."])
        firstName(blank: false)
        middleName(blank: true)
        lastName(blank: false)
        suffixName(inList: ["NA","I", "II", "III", "IV", "V"])
        email(email: true)
        //cellPhone(matches: "/^[0-9]{3}?[0-9]{3}?[0-9]{4}/")
        cellPhone(blank:false)
        workPhone(nullable: true)
        homePhone(nullable: true)
        salaryRange(blank:true)
        resumeCurrent(blank:true)
    }

}
