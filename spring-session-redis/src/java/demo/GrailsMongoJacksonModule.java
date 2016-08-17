package demo;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;


/**
 * @author Jitendra Singh.
 */
public class GrailsMongoJacksonModule extends SimpleModule {

    public void setupModule(SetupContext context) {
        ObjectMapper mapper = context.getOwner();
        if(mapper != null) {
            mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY);
        }
    }
}
