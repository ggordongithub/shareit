

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ShareFormController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ShareForm.list(params), model:[shareFormInstanceCount: ShareForm.count()]
    }

    def show(ShareForm shareFormInstance) {
        respond shareFormInstance
    }

    def create() {
        respond new ShareForm(params)
    }

    @Transactional
    def save(ShareForm shareFormInstance) {
        if (shareFormInstance == null) {
            notFound()
            return
        }

        if (shareFormInstance.hasErrors()) {
            respond shareFormInstance.errors, view:'create'
            return
        }

        shareFormInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'shareForm.label', default: 'ShareForm'), shareFormInstance.id])
                redirect shareFormInstance
            }
            '*' { respond shareFormInstance, [status: CREATED] }
        }
    }

    def edit(ShareForm shareFormInstance) {
        respond shareFormInstance
    }

    @Transactional
    def update(ShareForm shareFormInstance) {
        if (shareFormInstance == null) {
            notFound()
            return
        }

        if (shareFormInstance.hasErrors()) {
            respond shareFormInstance.errors, view:'edit'
            return
        }

        shareFormInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ShareForm.label', default: 'ShareForm'), shareFormInstance.id])
                redirect shareFormInstance
            }
            '*'{ respond shareFormInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ShareForm shareFormInstance) {

        if (shareFormInstance == null) {
            notFound()
            return
        }

        shareFormInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ShareForm.label', default: 'ShareForm'), shareFormInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'shareForm.label', default: 'ShareForm'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
