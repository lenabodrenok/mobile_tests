package guru.qa.owner;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")
public interface MobileConfig extends Config {
    String browserstackUser();
    String browserstackKey();
    String app();
    String device();
    String osVersion();
    String project();
    String build();
    String name();
    String baseUrl();
}
