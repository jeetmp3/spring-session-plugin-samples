import geb.spock.GebReportingSpec
import spock.lang.Stepwise
import pages.SessionTestPage

@Stepwise
class SessionTestSpec extends GebReportingSpec {

    def "response must be present"() {
        when:
        to SessionTestPage

        then:
        at SessionTestPage
    }

    def "session cookie must be present"() {
        to SessionTestPage
        println driver.manage().dump()

        expect:
        !driver.manage().getCookieNamed("JSESSIONID")
        driver.manage().getCookieNamed("SESSION")
    }

    def cleanup() {
//        browser.quit()
//        browser.close()
    }
}