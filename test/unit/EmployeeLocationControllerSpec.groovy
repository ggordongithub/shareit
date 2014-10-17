

import grails.test.mixin.*
import spock.lang.*

@TestFor(EmployeeLocationController)
@Mock(EmployeeLocation)
class EmployeeLocationControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.employeeLocationInstanceList
            model.employeeLocationInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.employeeLocationInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            def employeeLocation = new EmployeeLocation()
            employeeLocation.validate()
            controller.save(employeeLocation)

        then:"The create view is rendered again with the correct model"
            model.employeeLocationInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            employeeLocation = new EmployeeLocation(params)

            controller.save(employeeLocation)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/employeeLocation/show/1'
            controller.flash.message != null
            EmployeeLocation.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def employeeLocation = new EmployeeLocation(params)
            controller.show(employeeLocation)

        then:"A model is populated containing the domain instance"
            model.employeeLocationInstance == employeeLocation
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def employeeLocation = new EmployeeLocation(params)
            controller.edit(employeeLocation)

        then:"A model is populated containing the domain instance"
            model.employeeLocationInstance == employeeLocation
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/employeeLocation/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def employeeLocation = new EmployeeLocation()
            employeeLocation.validate()
            controller.update(employeeLocation)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.employeeLocationInstance == employeeLocation

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            employeeLocation = new EmployeeLocation(params).save(flush: true)
            controller.update(employeeLocation)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/employeeLocation/show/$employeeLocation.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/employeeLocation/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def employeeLocation = new EmployeeLocation(params).save(flush: true)

        then:"It exists"
            EmployeeLocation.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(employeeLocation)

        then:"The instance is deleted"
            EmployeeLocation.count() == 0
            response.redirectedUrl == '/employeeLocation/index'
            flash.message != null
    }
}
