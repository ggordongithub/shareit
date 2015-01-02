class Share {
	String companyName
	String referenceAuthor
	Date createdDate
	String emailTo
	String referenceCompleted
	Boolean deactivateReference

	static constraints = {
		companyName(blank:false)
		referenceAuthor(blank:false)
		createdDate(blank:false)
		emailTo(email:true, blank:false)
		referenceCompleted(blank:true)
		deactivateReference(blank:true)
	}
}
