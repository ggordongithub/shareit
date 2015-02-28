class RequestForm {

	String begin
	String middle
	String end
	Date lastUpdated
	
	static  belongsTo = [employee:Employee]
	
    static constraints = {
		begin(blank:false, size:10..50)
		middle(blank:false, size:10..300)
		end(blank:false, size:10..100)
    }
}
