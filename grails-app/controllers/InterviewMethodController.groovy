

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class InterviewMethodController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond InterviewMethod.list(params), model:[interviewMethodInstanceCount: InterviewMethod.count()]
    }

    def show(InterviewMethod interviewMethodInstance) {
        respond interviewMethodInstance
    }

    def create() {
        respond new InterviewMethod(params)
    }

    @Transactional
    def save(InterviewMethod interviewMethodInstance) {
        if (interviewMethodInstance == null) {
            notFound()
            return
        }

        if (interviewMethodInstance.hasErrors()) {
            respond interviewMethodInstance.errors, view:'create'
            return
        }

        interviewMethodInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'interviewMethod.label', default: 'InterviewMethod'), interviewMethodInstance.id])
                redirect interviewMethodInstance
            }
            '*' { respond interviewMethodInstance, [status: CREATED] }
        }
    }

    def edit(InterviewMethod interviewMethodInstance) {
        respond interviewMethodInstance
    }

    @Transactional
    def update(InterviewMethod interviewMethodInstance) {
        if (interviewMethodInstance == null) {
            notFound()
            return
        }

        if (interviewMethodInstance.hasErrors()) {
            respond interviewMethodInstance.errors, view:'edit'
            return
        }

        interviewMethodInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'InterviewMethod.label', default: 'InterviewMethod'), interviewMethodInstance.id])
                redirect interviewMethodInstance
            }
            '*'{ respond interviewMethodInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(InterviewMethod interviewMethodInstance) {

        if (interviewMethodInstance == null) {
            notFound()
            return
        }

        interviewMethodInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'InterviewMethod.label', default: 'InterviewMethod'), interviewMethodInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'interviewMethod.label', default: 'InterviewMethod'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
