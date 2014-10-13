

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmployeeLocationController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond EmployeeLocation.list(params), model:[employeeLocationInstanceCount: EmployeeLocation.count()]
    }

    def show(EmployeeLocation employeeLocationInstance) {
        respond employeeLocationInstance
    }

    def create() {
        respond new EmployeeLocation(params)
    }

    @Transactional
    def save(EmployeeLocation employeeLocationInstance) {
        if (employeeLocationInstance == null) {
            notFound()
            return
        }

        if (employeeLocationInstance.hasErrors()) {
            respond employeeLocationInstance.errors, view:'create'
            return
        }

        employeeLocationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employeeLocation.label', default: 'EmployeeLocation'), employeeLocationInstance.id])
                redirect employeeLocationInstance
            }
            '*' { respond employeeLocationInstance, [status: CREATED] }
        }
    }

    def edit(EmployeeLocation employeeLocationInstance) {
        respond employeeLocationInstance
    }

    @Transactional
    def update(EmployeeLocation employeeLocationInstance) {
        if (employeeLocationInstance == null) {
            notFound()
            return
        }

        if (employeeLocationInstance.hasErrors()) {
            respond employeeLocationInstance.errors, view:'edit'
            return
        }

        employeeLocationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'EmployeeLocation.label', default: 'EmployeeLocation'), employeeLocationInstance.id])
                redirect employeeLocationInstance
            }
            '*'{ respond employeeLocationInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(EmployeeLocation employeeLocationInstance) {

        if (employeeLocationInstance == null) {
            notFound()
            return
        }

        employeeLocationInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'EmployeeLocation.label', default: 'EmployeeLocation'), employeeLocationInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'employeeLocation.label', default: 'EmployeeLocation'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
