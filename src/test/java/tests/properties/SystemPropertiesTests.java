package tests.properties;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    @Tag("prod")
    void someTest() {
        System.getProperty("value", "value1");
        String value = System.getProperty("value", "firefox");
        System.out.println(value);
    }

    @Test
    @Tag("smoke")
    void someTest1() {
        System.getProperty("value", "value1");
        String value = System.getProperty("value", "explorer");
        System.out.println(value);
    }

    @Test
    //@Tag("properties")
    void someTest2() {
        System.getProperty("value", "value1");
        String value = System.getProperty("value", "opera");
        System.out.println(value);
    }

    @Test
    @Disabled
    @Tag("properties")
    void someTest3() {
        System.getProperty("value", "value1");
        String value = System.getProperty("value", "chrome");
        System.out.println(value);
    }

    @Test
    @Tag("properties")
    void someTest4() {
        String browser = System.getProperty("value", "chrome");
        String version = System.getProperty("value", "91");
        String browserSize = System.getProperty("value", "300*300");
        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);
    }
}
