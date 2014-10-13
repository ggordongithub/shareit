

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ProspectEmployerController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ProspectEmployer.list(params), model:[prospectEmployerInstanceCount: ProspectEmployer.count()]
    }

    def show(ProspectEmployer prospectEmployerInstance) {
        respond prospectEmployerInstance
    }

    def create() {
        respond new ProspectEmployer(params)
    }

    @Transactional
    def save(ProspectEmployer prospectEmployerInstance) {
        if (prospectEmployerInstance == null) {
            notFound()
            return
        }

        if (prospectEmployerInstance.hasErrors()) {
            respond prospectEmployerInstance.errors, view:'create'
            return
        }

        prospectEmployerInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'prospectEmployer.label', default: 'ProspectEmployer'), prospectEmployerInstance.id])
                redirect prospectEmployerInstance
            }
            '*' { respond prospectEmployerInstance, [status: CREATED] }
        }
    }

    def edit(ProspectEmployer prospectEmployerInstance) {
        respond prospectEmployerInstance
    }

    @Transactional
    def update(ProspectEmployer prospectEmployerInstance) {
        if (prospectEmployerInstance == null) {
            notFound()
            return
        }

        if (prospectEmployerInstance.hasErrors()) {
            respond prospectEmployerInstance.errors, view:'edit'
            return
        }

        prospectEmployerInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ProspectEmployer.label', default: 'ProspectEmployer'), prospectEmployerInstance.id])
                redirect prospectEmployerInstance
            }
            '*'{ respond prospectEmployerInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ProspectEmployer prospectEmployerInstance) {

        if (prospectEmployerInstance == null) {
            notFound()
            return
        }

        prospectEmployerInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ProspectEmployer.label', default: 'ProspectEmployer'), prospectEmployerInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'prospectEmployer.label', default: 'ProspectEmployer'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
