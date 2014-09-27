class EmployeeHistory {
    String promotionInCompany
    String conflict
    String teamPlayer
    String handlePressure
    String temperament
    String alert
    String strongestSkills
    String weakestSkills
    boolean tardyOften
    String managementStyle
    String willYouRehire
    String getlongWithCoworkers
    String getAlongWithMgt
    String jobResponsibilities
    String whyDidEmployeeLeave
    String highIntegrity

    static constraints = {
      promotionInCompany(blank:false)
      conflict(blank:false)
      teamPlayer(blank:false)
      handlePressure(blank:true)
      temperament(blank:false)
      alert(blank:true)
      strongestSkills(blank:false)
      weakestSkills(blank:false)
      tardyOften(blank:false)
      managementStyle(blank:true)
      willYouRehire(blank:true)
      getlongWithCoworkers(blank:false)
      getAlongWithMgt(blank:false)
      jobResponsibilities(blank:false)
      whyDidEmployeeLeave(blank:true)
    }
}
