

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmployeeReferenceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond EmployeeReference.list(params), model:[employeeReferenceInstanceCount: EmployeeReference.count()]
    }

    def show(EmployeeReference employeeReferenceInstance) {
        respond employeeReferenceInstance
    }

    def create() {
        respond new EmployeeReference(params)
    }

    @Transactional
    def save(EmployeeReference employeeReferenceInstance) {
        if (employeeReferenceInstance == null) {
            notFound()
            return
        }

        if (employeeReferenceInstance.hasErrors()) {
            respond employeeReferenceInstance.errors, view:'create'
            return
        }

        employeeReferenceInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employeeReference.label', default: 'EmployeeReference'), employeeReferenceInstance.id])
                redirect employeeReferenceInstance
            }
            '*' { respond employeeReferenceInstance, [status: CREATED] }
        }
    }

    def edit(EmployeeReference employeeReferenceInstance) {
        respond employeeReferenceInstance
    }

    @Transactional
    def update(EmployeeReference employeeReferenceInstance) {
        if (employeeReferenceInstance == null) {
            notFound()
            return
        }

        if (employeeReferenceInstance.hasErrors()) {
            respond employeeReferenceInstance.errors, view:'edit'
            return
        }

        employeeReferenceInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'EmployeeReference.label', default: 'EmployeeReference'), employeeReferenceInstance.id])
                redirect employeeReferenceInstance
            }
            '*'{ respond employeeReferenceInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(EmployeeReference employeeReferenceInstance) {

        if (employeeReferenceInstance == null) {
            notFound()
            return
        }

        employeeReferenceInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'EmployeeReference.label', default: 'EmployeeReference'), employeeReferenceInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'employeeReference.label', default: 'EmployeeReference'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
