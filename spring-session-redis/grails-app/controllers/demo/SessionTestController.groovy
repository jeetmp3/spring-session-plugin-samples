package demo

class SessionTestController {

    def index() {
        render view: 'index'
    }

    def put(String key, String value) {
        session.setAttribute(key, value)
        session.setAttribute("user", new User(value))
        redirect(action: 'index')
    }

    def get(String key) {
        render session.getAttribute(key)
    }
}
