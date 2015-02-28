

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class RequestFormController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond RequestForm.list(params), model:[requestFormInstanceCount: RequestForm.count()]
    }

    def show(RequestForm requestFormInstance) {
        respond requestFormInstance
    }

    def create() {
        respond new RequestForm(params)
    }

    @Transactional
    def save(RequestForm requestFormInstance) {
        if (requestFormInstance == null) {
            notFound()
            return
        }

        if (requestFormInstance.hasErrors()) {
            respond requestFormInstance.errors, view:'create'
            return
        }

        requestFormInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'requestForm.label', default: 'RequestForm'), requestFormInstance.id])
                redirect requestFormInstance
            }
            '*' { respond requestFormInstance, [status: CREATED] }
        }
    }

    def edit(RequestForm requestFormInstance) {
        respond requestFormInstance
    }

    @Transactional
    def update(RequestForm requestFormInstance) {
        if (requestFormInstance == null) {
            notFound()
            return
        }

        if (requestFormInstance.hasErrors()) {
            respond requestFormInstance.errors, view:'edit'
            return
        }

        requestFormInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'RequestForm.label', default: 'RequestForm'), requestFormInstance.id])
                redirect requestFormInstance
            }
            '*'{ respond requestFormInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(RequestForm requestFormInstance) {

        if (requestFormInstance == null) {
            notFound()
            return
        }

        requestFormInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'RequestForm.label', default: 'RequestForm'), requestFormInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'requestForm.label', default: 'RequestForm'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
