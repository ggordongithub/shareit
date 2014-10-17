

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class InvitationController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Invitation.list(params), model:[invitationInstanceCount: Invitation.count()]
    }

    def show(Invitation invitationInstance) {
        respond invitationInstance
    }

    def create() {
        respond new Invitation(params)
    }

    @Transactional
    def save(Invitation invitationInstance) {
        if (invitationInstance == null) {
            notFound()
            return
        }

        if (invitationInstance.hasErrors()) {
            respond invitationInstance.errors, view:'create'
            return
        }

        invitationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'invitation.label', default: 'Invitation'), invitationInstance.id])
                redirect invitationInstance
            }
            '*' { respond invitationInstance, [status: CREATED] }
        }
    }

    def edit(Invitation invitationInstance) {
        respond invitationInstance
    }

    @Transactional
    def update(Invitation invitationInstance) {
        if (invitationInstance == null) {
            notFound()
            return
        }

        if (invitationInstance.hasErrors()) {
            respond invitationInstance.errors, view:'edit'
            return
        }

        invitationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Invitation.label', default: 'Invitation'), invitationInstance.id])
                redirect invitationInstance
            }
            '*'{ respond invitationInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Invitation invitationInstance) {

        if (invitationInstance == null) {
            notFound()
            return
        }

        invitationInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Invitation.label', default: 'Invitation'), invitationInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'invitation.label', default: 'Invitation'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
