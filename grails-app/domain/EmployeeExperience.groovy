class EmployeeExperience {
	String yearsKnown 
	String experience
	Boolean clever
	Boolean smart
	Boolean hardDriving
	Boolean dependable
	Boolean wellSpokenOf
	Boolean analytical
	Boolean entrepreneurial
	Boolean businessMinded
	Boolean inventive
	Boolean resultOriented
	
	static belongsTo = [employee:Employee]

	static constraints = {
		yearsKnown(inList: ["0-2 yrs", "3-5 yrs", "6-8 yrs", "9-11 yrs", "12-14 yrs", "15 plus yrs"])
		experience(blank:false)
		clever(blank:false)
		smart(blank:false)
		hardDriving(blank:false)
		dependable(blank:false)
		wellSpokenOf(blank:false)
		analytical(blank:false)
		entrepreneurial(blank:false)
		businessMinded(blank:false)
		inventive(blank:false)
		resultOriented(blank:false)
	}
}
