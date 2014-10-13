

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class InterviewController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Interview.list(params), model:[interviewInstanceCount: Interview.count()]
    }

    def show(Interview interviewInstance) {
        respond interviewInstance
    }

    def create() {
        respond new Interview(params)
    }

    @Transactional
    def save(Interview interviewInstance) {
        if (interviewInstance == null) {
            notFound()
            return
        }

        if (interviewInstance.hasErrors()) {
            respond interviewInstance.errors, view:'create'
            return
        }

        interviewInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'interview.label', default: 'Interview'), interviewInstance.id])
                redirect interviewInstance
            }
            '*' { respond interviewInstance, [status: CREATED] }
        }
    }

    def edit(Interview interviewInstance) {
        respond interviewInstance
    }

    @Transactional
    def update(Interview interviewInstance) {
        if (interviewInstance == null) {
            notFound()
            return
        }

        if (interviewInstance.hasErrors()) {
            respond interviewInstance.errors, view:'edit'
            return
        }

        interviewInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Interview.label', default: 'Interview'), interviewInstance.id])
                redirect interviewInstance
            }
            '*'{ respond interviewInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Interview interviewInstance) {

        if (interviewInstance == null) {
            notFound()
            return
        }

        interviewInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Interview.label', default: 'Interview'), interviewInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'interview.label', default: 'Interview'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
