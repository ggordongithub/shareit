

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FileShareController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond FileShare.list(params), model:[fileShareInstanceCount: FileShare.count()]
    }

    def show(FileShare fileShareInstance) {
        respond fileShareInstance
    }

	//designed to parse blob input from database and write to screen 
	def showPayload() {
	  def fileShareInstance = FileShare.get(params.id) 	
	  response.outputStream << fileShareInstance.filePayload 
	  //response.flush()
	}

    def create() {
        respond new FileShare(params)
    }

    @Transactional
    def save(FileShare fileShareInstance) {
        if (fileShareInstance == null) {
            notFound()
            return
        }

        if (fileShareInstance.hasErrors()) {
            respond fileShareInstance.errors, view:'create'
            return
        }

        fileShareInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'fileShare.label', default: 'FileShare'), fileShareInstance.id])
                redirect fileShareInstance
            }
            '*' { respond fileShareInstance, [status: CREATED] }
        }
    }

    def edit(FileShare fileShareInstance) {
        respond fileShareInstance
    }

    @Transactional
    def update(FileShare fileShareInstance) {
        if (fileShareInstance == null) {
            notFound()
            return
        }

        if (fileShareInstance.hasErrors()) {
            respond fileShareInstance.errors, view:'edit'
            return
        }

        fileShareInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'FileShare.label', default: 'FileShare'), fileShareInstance.id])
                redirect fileShareInstance
            }
            '*'{ respond fileShareInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(FileShare fileShareInstance) {

        if (fileShareInstance == null) {
            notFound()
            return
        }

        fileShareInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'FileShare.label', default: 'FileShare'), fileShareInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'fileShare.label', default: 'FileShare'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
