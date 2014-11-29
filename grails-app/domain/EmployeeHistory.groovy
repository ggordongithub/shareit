class EmployeeHistory {
    boolean promotionInCompany
    boolean conflict
    boolean teamPlayer
    boolean handlePressure
    String temperament
    boolean alert
    String strongestSkills
    String weakestSkills
    boolean tardyOften
    String managementStyle
    boolean willYouRehire
    boolean getlongWithCoworkers
    boolean getAlongWithMgt
    String jobResponsibilities
    String whyDidEmployeeLeave
    boolean highIntegrity
	
	static belongsTo = [employee:Employee]

    static constraints = {
      promotionInCompany(blank:true)
      conflict(blank:true)
      teamPlayer(blank:true)
      handlePressure(blank:true)
      temperament(blank:false)
      alert(blank:true)
      strongestSkills(blank:false)
      weakestSkills(blank:false)
      tardyOften(blank:true)
      managementStyle(blank:true)
      willYouRehire(blank:true)
      getlongWithCoworkers(blank:true)
      getAlongWithMgt(blank:true)
      jobResponsibilities(blank:true)
      whyDidEmployeeLeave(blank:true)
    }
}
