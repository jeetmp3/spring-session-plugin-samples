package samples.springsession

import demo.User

class HomeController {

    def index() {
        if(params.key != null && params.value != null) {
            session.setAttribute(params.key as String, params.value as Object)
            session.setAttribute(params.key as String, new User(params.value as String))
        }
        render(view: 'index')
    }

    def put() {
        if(params.key != null && params.value != null) {
            session.setAttribute(params.key as String, params.value as Object)
        }
        render true
    }

    def get(String key) {
        render session.getAttribute(key)
    }
}
