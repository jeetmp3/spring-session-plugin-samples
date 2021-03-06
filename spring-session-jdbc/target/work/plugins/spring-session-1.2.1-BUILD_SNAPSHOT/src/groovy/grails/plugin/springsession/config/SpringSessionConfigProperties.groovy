package grails.plugin.springsession.config

import grails.plugin.springsession.enums.Serializer
import grails.plugin.springsession.enums.SessionStore
import grails.plugin.springsession.enums.SessionStrategy

/**
 * @author Jitendra Singh.
 */
class SpringSessionConfigProperties {

    int maxInactiveInterval
    SessionStore sessionStore
    Serializer defaultSerializer = Serializer.JDK
    SessionStrategy defaultSessionStrategy = SessionStrategy.COOKIE
    String cookieName
    String httpHeaderName
    Boolean allowPersistMutable

    private static SpringSessionConfigProperties configProperties;

    public static synchronized SpringSessionConfigProperties getInstance(ConfigObject config) {
        if (configProperties == null) {
            configProperties = new SpringSessionConfigProperties(config)
        }
        return configProperties
    }

    private SpringSessionConfigProperties(ConfigObject config) {
        maxInactiveInterval = config.maxInactiveIntervalInSeconds ?: 1800
        sessionStore = config.sessionStore ?: SessionStore.REDIS
        defaultSerializer = config.defaultSerializer ?: Serializer.JDK
        defaultSessionStrategy = config.strategy.defaultStrategy ?: SessionStrategy.COOKIE
        cookieName = config.strategy.cookie.name
        httpHeaderName = config.strategy.httpHeader.headerName
        allowPersistMutable = config.allow.persist.mutable ?: false
    }
}
