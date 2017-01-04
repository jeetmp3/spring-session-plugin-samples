package demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Jitendra Singh.
 */
public abstract class UserMixin {

    @JsonCreator
    public UserMixin(@JsonProperty("name") String name) {

    }
}
