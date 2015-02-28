

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmployeeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	

   // def index() {
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
		if (Employee.count() > 0 ) {
            respond Employee.list(params), model:[employeeInstanceCount: Employee.count()]
			//render view: "../index"
		}
		else {
            render view: "/employeeProfile"
		}
    }

    def show(Employee employeeInstance) {
        respond employeeInstance
    }
	
	def storeImage () {
			def imageMap = [:]
			def imageContentType = parameters.componentImageImageForm?.getContentType()
			if (imageContentType == null || !(imageContentType =~ "image/")) {
				imageMap.put("photo", null)
				imageMap.put("photoName", null)
				imageMap.put("photoContentType", null)
                flash.message = 'your profile was saved with the no image was option' 
			} else {
				imageMap.put("photo", parameters.componentImageImageForm?.getBytes())
				imageMap.put("photoName", parameters.componentImageImageForm?.getOriginalFilename())
				imageMap.put("photoContentType", parameters.componentImageImageForm?.getContentType())
                flash.message = 'your profile was saved with the following photo [' +  parameters.componentImageImageForm?.getOriginalFilename() + ']'
				log.info 'Started building image field'
			}
			
			imageMap
	}

    def create() {
        respond new Employee(params)
    }

	def getImage(Long id) {
		def employee = Employee.get(id);
		if (employee != null) {
			response.contentType = employee.imageContentType == null ? "image/jpeg" : employee.imageContentType;
			response.contentLength = employee.image == null ? 0 : employee.image.size();
			response.outputStream << employee.image;
		} else {
			response.contentType = "image/jpeg";
			response.contentLength = 0;
			response.outputStream << null;
		}
		//TODO: render profile images in the appropriate place
		//by using <img src="${createLink(action: 'getImage', controller: 'employee', id:employeeId)}"/>
	}

    @Transactional
    def save(Employee employeeInstance) {
        if (employeeInstance == null) {
            notFound()
            return
        }

        if (employeeInstance.hasErrors()) {
            respond employeeInstance.errors, view:'create'
            return
        }

		//update properties with storeImage
	//	employeeInstance.properties = storeImage
     //   employeeInstance.save flush:true
	
        //flash.message = 'your profile was saved' 
		render view: '/'

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employee.label', default: 'Employee'), employeeInstance.id])
                redirect employeeInstance
            }
            '*' { respond employeeInstance, [status: CREATED] }
        }
    }

    def edit(Employee employeeInstance) {
        respond employeeInstance
    }

    @Transactional
    def update(Employee employeeInstance) {
        if (employeeInstance == null) {
            notFound()
            return
        }

        if (employeeInstance.hasErrors()) {
            respond employeeInstance.errors, view:'edit'
            return
        }

		//update properties with storeImage
		employeeInstance.properties = storeImage
        employeeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Employee.label', default: 'Employee'), employeeInstance.id])
                redirect employeeInstance
            }
            '*'{ respond employeeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Employee employeeInstance) {

        if (employeeInstance == null) {
            notFound()
            return
        }

        employeeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Employee.label', default: 'Employee'), employeeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'employee.label', default: 'Employee'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
