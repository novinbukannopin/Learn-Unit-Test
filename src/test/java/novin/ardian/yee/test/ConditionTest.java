package novin.ardian.yee.test;

import novin.ardian.yee.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

/**
 * @author Novin on 14/07/2022
 * @project Learn-Unit-Test
 */
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class ConditionTest {


    @Test
    public void testSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testRunOnlyOnWindows() {

    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    public void testDisabledOnWindows() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void testEnabledOnJava8() {

    }

    @Test
    @DisabledOnJre(JRE.JAVA_8)
    public void testDisabledOnJava8() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.OTHER)
    public void testEnableOnJava11to17() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.OTHER)
    public void testDisabledOnJava11to17() {

    }

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void testEnableVendorOnOracle() {

    }

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void testDisabledVendorOnOracle() {

    }


}
