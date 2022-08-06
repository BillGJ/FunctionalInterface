
@FunctionalInterface
public interface BinaryOperation {

    /* This class must have one abstract method
    also called functional method
    because it is a functional interface
    It can also have default methods*/

    int apply(int a, int b);

}
