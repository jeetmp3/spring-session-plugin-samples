package demo

class SessionTestController {

    def index() {
        println session
        render view: 'index'
    }

    def put(String key, String value) {
        session.setAttribute(key, value)
        redirect(action: 'index')
    }

    def get(String key) {
        render session.getAttribute(key)
    }
}
