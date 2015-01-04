class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

		"/"(view: '/index')
        "500"(view:'/error')
        "/login/$action?"(controller:"login")
        "/logout/$action?"(controller:"logout")
		name userProfile: "/profile"(view:"profile")
		name employeeProfile: "/employeeProfile"(view:"employeeProfile")
		name operate: "/operate"(view:"share/operate")
        //"/"(controller:"/employee")
	}
}
