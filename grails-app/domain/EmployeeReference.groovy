class EmployeeReference {
    String name
    String referenceHeader
    String referenceAbstract
    String referenceBody
    String referenceFooter
    String referenceNote
    Date dateCreated
    Date expiredDate
    Date lastUpdated
    int referenceScore
    String imageLogo

    static constraints = {
      name(blank:false)
      referenceHeader(blank:false)
      referenceAbstract(blank:false)
      referenceBody(blank:false)
      referenceFooter(blank:false)
      referenceNote(blank:false)
      dateCreated(blank:false)
      expiredDate(blank:false)
      lastUpdated(blank:false)
      referenceScore(blank:false)
      imageLogo(blank:true)
    }
}
