package spring.session.grails3.sample

class HomeController {

    def index() {
	render(new demo.App().sayHello());
    }
}
