

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmployeeExperienceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond EmployeeExperience.list(params), model:[employeeExperienceInstanceCount: EmployeeExperience.count()]
    }

    def show(EmployeeExperience employeeExperienceInstance) {
        respond employeeExperienceInstance
    }

    def create() {
        respond new EmployeeExperience(params)
    }

    @Transactional
    def save(EmployeeExperience employeeExperienceInstance) {
        if (employeeExperienceInstance == null) {
            notFound()
            return
        }

        if (employeeExperienceInstance.hasErrors()) {
            respond employeeExperienceInstance.errors, view:'create'
            return
        }

        employeeExperienceInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employeeExperience.label', default: 'EmployeeExperience'), employeeExperienceInstance.id])
                redirect employeeExperienceInstance
            }
            '*' { respond employeeExperienceInstance, [status: CREATED] }
        }
    }

    def edit(EmployeeExperience employeeExperienceInstance) {
        respond employeeExperienceInstance
    }

    @Transactional
    def update(EmployeeExperience employeeExperienceInstance) {
        if (employeeExperienceInstance == null) {
            notFound()
            return
        }

        if (employeeExperienceInstance.hasErrors()) {
            respond employeeExperienceInstance.errors, view:'edit'
            return
        }

        employeeExperienceInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'EmployeeExperience.label', default: 'EmployeeExperience'), employeeExperienceInstance.id])
                redirect employeeExperienceInstance
            }
            '*'{ respond employeeExperienceInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(EmployeeExperience employeeExperienceInstance) {

        if (employeeExperienceInstance == null) {
            notFound()
            return
        }

        employeeExperienceInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'EmployeeExperience.label', default: 'EmployeeExperience'), employeeExperienceInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'employeeExperience.label', default: 'EmployeeExperience'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
