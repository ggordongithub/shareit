

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class InterviewStateController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond InterviewState.list(params), model:[interviewStateInstanceCount: InterviewState.count()]
    }

    def show(InterviewState interviewStateInstance) {
        respond interviewStateInstance
    }

    def create() {
        respond new InterviewState(params)
    }

    @Transactional
    def save(InterviewState interviewStateInstance) {
        if (interviewStateInstance == null) {
            notFound()
            return
        }

        if (interviewStateInstance.hasErrors()) {
            respond interviewStateInstance.errors, view:'create'
            return
        }

        interviewStateInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'interviewState.label', default: 'InterviewState'), interviewStateInstance.id])
                redirect interviewStateInstance
            }
            '*' { respond interviewStateInstance, [status: CREATED] }
        }
    }

    def edit(InterviewState interviewStateInstance) {
        respond interviewStateInstance
    }

    @Transactional
    def update(InterviewState interviewStateInstance) {
        if (interviewStateInstance == null) {
            notFound()
            return
        }

        if (interviewStateInstance.hasErrors()) {
            respond interviewStateInstance.errors, view:'edit'
            return
        }

        interviewStateInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'InterviewState.label', default: 'InterviewState'), interviewStateInstance.id])
                redirect interviewStateInstance
            }
            '*'{ respond interviewStateInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(InterviewState interviewStateInstance) {

        if (interviewStateInstance == null) {
            notFound()
            return
        }

        interviewStateInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'InterviewState.label', default: 'InterviewState'), interviewStateInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'interviewState.label', default: 'InterviewState'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
