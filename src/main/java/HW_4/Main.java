package HW_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        List<Double> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            ls1.add((double) i);
            ls2.add(i);
        }

        System.out.println(calc.summ(ls1));
        System.out.println(calc.summ(ls2));

        System.out.println(calc.multiply(ls1));
        System.out.println(calc.multiply(ls2));

        System.out.println(calc.divide(ls1));
        System.out.println(calc.divide(ls2));

        System.out.println(calc.toBinary(1));
        System.out.println(calc.toBinary("10"));
        System.out.println(calc.toBinary("-10"));
        System.out.println(calc.toBinary("12.1"));
        System.out.println(calc.toBinary("asd"));
        System.out.println(calc.toBinary(""));
    }
}