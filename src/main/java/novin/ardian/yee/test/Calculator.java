package novin.ardian.yee.test;

/**
 * @author Novin on 14/07/2022
 * @project Learn-Unit-Test
 */
public class Calculator {

    public Integer divide(Integer first, Integer second) {
        if (second == 0) {
            throw new IllegalArgumentException("Cant divide by zero");
        } else {
            return first / second;
        }
    }

    public Integer add(Integer first, Integer second) {
        return first + second;
    }
}
