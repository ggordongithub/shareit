

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ShareController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Share.list(params), model:[shareInstanceCount: Share.count()]
    }

    def show(Share shareInstance) {
        respond shareInstance
    }
	
	def operate() {
		respond view:'operate'
	}

    def create() {
        respond new Share(params)
    }

    @Transactional
    def save(Share shareInstance) {
        if (shareInstance == null) {
            notFound()
            return
        }

        if (shareInstance.hasErrors()) {
            respond shareInstance.errors, view:'create'
            return
        }

        shareInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'share.label', default: 'Share'), shareInstance.id])
                redirect shareInstance
            }
            '*' { respond shareInstance, [status: CREATED] }
        }
    }

    def edit(Share shareInstance) {
        respond shareInstance
    }

    @Transactional
    def update(Share shareInstance) {
        if (shareInstance == null) {
            notFound()
            return
        }

        if (shareInstance.hasErrors()) {
            respond shareInstance.errors, view:'edit'
            return
        }

        shareInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Share.label', default: 'Share'), shareInstance.id])
                redirect shareInstance
            }
            '*'{ respond shareInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Share shareInstance) {

        if (shareInstance == null) {
            notFound()
            return
        }

        shareInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Share.label', default: 'Share'), shareInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'share.label', default: 'Share'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
