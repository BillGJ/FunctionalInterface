import java.util.function.BinaryOperator;

public final class Main {
    public static void main(String[] args){
        BinaryOperation add = (a, b) -> a + b;
        // Or you could use:
        //
        //  BinaryOperation add = Integer::sum;
        assert 5 == add.apply(2, 3);
        System.out.println(add.apply(2, 3));
    }
}
