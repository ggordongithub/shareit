

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class InterviewTypeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond InterviewType.list(params), model:[interviewTypeInstanceCount: InterviewType.count()]
    }

    def show(InterviewType interviewTypeInstance) {
        respond interviewTypeInstance
    }

    def create() {
        respond new InterviewType(params)
    }

    @Transactional
    def save(InterviewType interviewTypeInstance) {
        if (interviewTypeInstance == null) {
            notFound()
            return
        }

        if (interviewTypeInstance.hasErrors()) {
            respond interviewTypeInstance.errors, view:'create'
            return
        }

        interviewTypeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'interviewType.label', default: 'InterviewType'), interviewTypeInstance.id])
                redirect interviewTypeInstance
            }
            '*' { respond interviewTypeInstance, [status: CREATED] }
        }
    }

    def edit(InterviewType interviewTypeInstance) {
        respond interviewTypeInstance
    }

    @Transactional
    def update(InterviewType interviewTypeInstance) {
        if (interviewTypeInstance == null) {
            notFound()
            return
        }

        if (interviewTypeInstance.hasErrors()) {
            respond interviewTypeInstance.errors, view:'edit'
            return
        }

        interviewTypeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'InterviewType.label', default: 'InterviewType'), interviewTypeInstance.id])
                redirect interviewTypeInstance
            }
            '*'{ respond interviewTypeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(InterviewType interviewTypeInstance) {

        if (interviewTypeInstance == null) {
            notFound()
            return
        }

        interviewTypeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'InterviewType.label', default: 'InterviewType'), interviewTypeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'interviewType.label', default: 'InterviewType'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
