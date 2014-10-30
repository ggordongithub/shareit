class Location {

    String address
    String city
    String state
    String zip
    String country
	EmployeeLocation employeeLocation
	EmployerLocation employerLocation
	
    static constraints = {
      address(blank:false)
      city(blank:false)
      state(blank:false)
      zip(blank:false)
      country(blank:false)
    }
}
