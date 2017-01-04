package demo;

import java.io.Serializable;

/**
 * @author Jitendra Singh.
 */
public class User implements Serializable {

    private String name;
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
