class Request {
String companyName
Date sentOrReceivedDate	
String requestForReferenceEmail
String clickToSendReferenceRequest
boolean referenceReceived	

    static transients = ['clickToSendReferenceRequest'] 
    static constraints = {
	   companyName(blank:false)	
	   sentOrReceivedDate(blank:false, null:true)
       requestForReferenceEmail(blank:false)
       clickToSendReferenceRequest(blank:false, null:true)
       referenceReceived(blank:true)	
    }
}
