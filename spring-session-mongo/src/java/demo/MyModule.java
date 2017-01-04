package demo;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;

/**
 * @author Jitendra Singh.
 */
public class MyModule extends Module {
    @Override
    public String getModuleName() {
        return "MyModule";
    }

    @Override
    public Version version() {
        return Version.unknownVersion();
    }

    @Override
    public void setupModule(SetupContext setupContext) {
        setupContext.setMixInAnnotations(User.class, UserMixin.class);
    }
}
