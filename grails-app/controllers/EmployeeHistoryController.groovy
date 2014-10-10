

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmployeeHistoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond EmployeeHistory.list(params), model:[employeeHistoryInstanceCount: EmployeeHistory.count()]
    }

    def show(EmployeeHistory employeeHistoryInstance) {
        respond employeeHistoryInstance
    }

    def create() {
        respond new EmployeeHistory(params)
    }

    @Transactional
    def save(EmployeeHistory employeeHistoryInstance) {
        if (employeeHistoryInstance == null) {
            notFound()
            return
        }

        if (employeeHistoryInstance.hasErrors()) {
            respond employeeHistoryInstance.errors, view:'create'
            return
        }

        employeeHistoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employeeHistory.label', default: 'EmployeeHistory'), employeeHistoryInstance.id])
                redirect employeeHistoryInstance
            }
            '*' { respond employeeHistoryInstance, [status: CREATED] }
        }
    }

    def edit(EmployeeHistory employeeHistoryInstance) {
        respond employeeHistoryInstance
    }

    @Transactional
    def update(EmployeeHistory employeeHistoryInstance) {
        if (employeeHistoryInstance == null) {
            notFound()
            return
        }

        if (employeeHistoryInstance.hasErrors()) {
            respond employeeHistoryInstance.errors, view:'edit'
            return
        }

        employeeHistoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'EmployeeHistory.label', default: 'EmployeeHistory'), employeeHistoryInstance.id])
                redirect employeeHistoryInstance
            }
            '*'{ respond employeeHistoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(EmployeeHistory employeeHistoryInstance) {

        if (employeeHistoryInstance == null) {
            notFound()
            return
        }

        employeeHistoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'EmployeeHistory.label', default: 'EmployeeHistory'), employeeHistoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'employeeHistory.label', default: 'EmployeeHistory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
