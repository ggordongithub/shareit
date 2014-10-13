

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ShareReferenceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ShareReference.list(params), model:[shareReferenceInstanceCount: ShareReference.count()]
    }

    def show(ShareReference shareReferenceInstance) {
        respond shareReferenceInstance
    }

    def create() {
        respond new ShareReference(params)
    }

    @Transactional
    def save(ShareReference shareReferenceInstance) {
        if (shareReferenceInstance == null) {
            notFound()
            return
        }

        if (shareReferenceInstance.hasErrors()) {
            respond shareReferenceInstance.errors, view:'create'
            return
        }

        shareReferenceInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'shareReference.label', default: 'ShareReference'), shareReferenceInstance.id])
                redirect shareReferenceInstance
            }
            '*' { respond shareReferenceInstance, [status: CREATED] }
        }
    }

    def edit(ShareReference shareReferenceInstance) {
        respond shareReferenceInstance
    }

    @Transactional
    def update(ShareReference shareReferenceInstance) {
        if (shareReferenceInstance == null) {
            notFound()
            return
        }

        if (shareReferenceInstance.hasErrors()) {
            respond shareReferenceInstance.errors, view:'edit'
            return
        }

        shareReferenceInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ShareReference.label', default: 'ShareReference'), shareReferenceInstance.id])
                redirect shareReferenceInstance
            }
            '*'{ respond shareReferenceInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ShareReference shareReferenceInstance) {

        if (shareReferenceInstance == null) {
            notFound()
            return
        }

        shareReferenceInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ShareReference.label', default: 'ShareReference'), shareReferenceInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'shareReference.label', default: 'ShareReference'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
