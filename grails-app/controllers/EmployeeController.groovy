import grails.plugin.springsecurity.annotation.Secured;

class EmployeeController {

	@Secured(['ROLE_ADMIN'])
    def index() { 
		render "Some things are just private"
	}
//  def scaffold = true
}
