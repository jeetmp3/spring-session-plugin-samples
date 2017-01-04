package demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Jitendra Singh.
 */
public class UserMixin {
    private String name;

    @JsonCreator
    public UserMixin(@JsonProperty("name") String name) {

    }
}
