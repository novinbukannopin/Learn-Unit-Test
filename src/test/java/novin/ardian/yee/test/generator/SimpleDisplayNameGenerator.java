package novin.ardian.yee.test.generator;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

/**
 * @author Novin on 14/07/2022
 * @project Learn-Unit-Test
 */
public class SimpleDisplayNameGenerator implements DisplayNameGenerator {
    @Override
    public String generateDisplayNameForClass(Class<?> aClass) {
        return "Test " + aClass.getSimpleName();
    }


    @Override
    public String generateDisplayNameForMethod(Class<?> aClass, Method method) {
        return "Test " + aClass.getSimpleName() + " -> " + method.getName();
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> aClass) {
        return null;
    }
}
