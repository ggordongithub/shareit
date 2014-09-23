package SecUser

class Reqeustmap {

	String authority

	static mapping = {
		cache true
	}

	static constraints = {
		authority blank: false, unique: true
	}
}
