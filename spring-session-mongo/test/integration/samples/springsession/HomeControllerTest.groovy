package samples.springsession

import grails.test.spock.IntegrationSpec

/**
 * @author Jitendra Singh.
 */
class HomeControllerTest extends IntegrationSpec {

    def "set values test"() {
        given: 'Home Controller'
        def home = new HomeController()

        and: 'parameters key and value'
        home.params.key = "name"
        home.params.value = "Jitendra"

        when: 'invoked index action'
        home.put()

        then:
        home.response.text == "true"
    }
}
