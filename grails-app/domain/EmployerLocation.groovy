class EmployerLocation {
	
	static belongsTo = [employer:Employer]
	static hasOne = [location:Location]

    static constraints = {
    }
}
