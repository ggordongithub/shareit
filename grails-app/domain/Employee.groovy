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
	byte[] photo;
	String photoName;
	String photoContentType;

	static hasMany = [employeeLocations:EmployeeLocation, employeeHistories:EmployeeHistory,
		sharedReferences:ShareReference, employers:Employer, prospectEmployers:ProspectEmployer, 
		employeeExperiences:EmployeeExperience, employeeReferences:EmployeeReference]
	
	static constraints = {
		employeeTitle(blank: false)
		sirName(inList: [
			"NA",
			"Mr.",
			"Ms.",
			"Mrs.",
			"Sr.",
			"Miss."
		])
		firstName(blank: false)
		middleName(blank: true)
		lastName(blank: false)
		suffixName(inList: [
			"NA",
			"I",
			"II",
			"III",
			"IV",
			"V"
		])
		email(email: true)
		//cellPhone(matches: "/^[0-9]{3}?[0-9]{3}?[0-9]{4}/")
		cellPhone(blank:false)
		workPhone(nullable: true)
		homePhone(nullable: true)
		salaryRange(blank:true)
		resumeCurrent(blank:true)
//	    photo(nullable:true, blank:true, maxSize:1024 * 1024 * 2048); //2GB 
	    photo(nullable:true, blank:true);  
	    photoName(nullable:true, blank:true); 
		photoContentType(nullable:true, blank:true); 
	}
}
