class EmployeeLocation {

	static belongsTo = [employee:Employee]
	static hasOne = [location:Location]

    static constraints = {
    }
}
