class FileShare {
	byte[] filePayload
	String fileType
	String fileName
	boolean photo

	static mapping = {
		//longblob 4 gb
		filePayload(sqlType:"longblob")
	}

	static constraints = {
		filePayload(nullable:true)
		fileType(blank:true, nullable:true)
		fileName(blank:true,nullable:true)
		photo(blank:true)
	}
}
