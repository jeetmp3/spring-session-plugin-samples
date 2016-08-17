package demo

import org.springframework.jdbc.core.JdbcTemplate

class SessionTestController {

    JdbcTemplate springSessionJdbcOperations

    def index() {
        println session
        println springSessionJdbcOperations
        println springSessionJdbcOperations.dataSource.connection.dump()
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
