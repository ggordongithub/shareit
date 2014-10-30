class ProspectEmployer {
    String prospectEmployer
    String prospectPosition
    String prospectPositionDesc
    String prospectEmployerQuestions

	static belongsTo = [employee:Employee]

    static constraints = {
     prospectEmployer(blank:false)
     prospectPosition(blank:false)
     prospectPositionDesc(blank:false)
     prospectEmployerQuestions(blank:false)
    }
}
