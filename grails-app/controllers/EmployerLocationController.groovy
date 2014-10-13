

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmployerLocationController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond EmployerLocation.list(params), model:[employerLocationInstanceCount: EmployerLocation.count()]
    }

    def show(EmployerLocation employerLocationInstance) {
        respond employerLocationInstance
    }

    def create() {
        respond new EmployerLocation(params)
    }

    @Transactional
    def save(EmployerLocation employerLocationInstance) {
        if (employerLocationInstance == null) {
            notFound()
            return
        }

        if (employerLocationInstance.hasErrors()) {
            respond employerLocationInstance.errors, view:'create'
            return
        }

        employerLocationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employerLocation.label', default: 'EmployerLocation'), employerLocationInstance.id])
                redirect employerLocationInstance
            }
            '*' { respond employerLocationInstance, [status: CREATED] }
        }
    }

    def edit(EmployerLocation employerLocationInstance) {
        respond employerLocationInstance
    }

    @Transactional
    def update(EmployerLocation employerLocationInstance) {
        if (employerLocationInstance == null) {
            notFound()
            return
        }

        if (employerLocationInstance.hasErrors()) {
            respond employerLocationInstance.errors, view:'edit'
            return
        }

        employerLocationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'EmployerLocation.label', default: 'EmployerLocation'), employerLocationInstance.id])
                redirect employerLocationInstance
            }
            '*'{ respond employerLocationInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(EmployerLocation employerLocationInstance) {

        if (employerLocationInstance == null) {
            notFound()
            return
        }

        employerLocationInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'EmployerLocation.label', default: 'EmployerLocation'), employerLocationInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'employerLocation.label', default: 'EmployerLocation'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
