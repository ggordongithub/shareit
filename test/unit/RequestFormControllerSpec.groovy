

import grails.test.mixin.*
import spock.lang.*

@TestFor(RequestFormController)
@Mock(RequestForm)
class RequestFormControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.requestFormInstanceList
            model.requestFormInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.requestFormInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            def requestForm = new RequestForm()
            requestForm.validate()
            controller.save(requestForm)

        then:"The create view is rendered again with the correct model"
            model.requestFormInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            requestForm = new RequestForm(params)

            controller.save(requestForm)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/requestForm/show/1'
            controller.flash.message != null
            RequestForm.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def requestForm = new RequestForm(params)
            controller.show(requestForm)

        then:"A model is populated containing the domain instance"
            model.requestFormInstance == requestForm
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def requestForm = new RequestForm(params)
            controller.edit(requestForm)

        then:"A model is populated containing the domain instance"
            model.requestFormInstance == requestForm
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/requestForm/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def requestForm = new RequestForm()
            requestForm.validate()
            controller.update(requestForm)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.requestFormInstance == requestForm

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            requestForm = new RequestForm(params).save(flush: true)
            controller.update(requestForm)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/requestForm/show/$requestForm.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/requestForm/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def requestForm = new RequestForm(params).save(flush: true)

        then:"It exists"
            RequestForm.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(requestForm)

        then:"The instance is deleted"
            RequestForm.count() == 0
            response.redirectedUrl == '/requestForm/index'
            flash.message != null
    }
}
