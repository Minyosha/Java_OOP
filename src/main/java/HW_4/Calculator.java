package HW_4;

import java.util.List;

public class Calculator<T> {
    public Double summ(List<? extends Number> list) {
        Double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public Double multiply(List<? extends Number> list) {
        Double mult = 1.0;
        for (Number n : list) {
            mult *= n.doubleValue();
        }
        return mult;
    }

    public Double divide(List<? extends Number> list) {
        Double div = 1.0;
        for (Number n : list) {
            div /= n.doubleValue();
        }
        return div;
    }

    public String toBinary(T num) {
        int result = 0;
        if (num instanceof String) {
            String str = (String) num;
            if (str == null || str.isEmpty()) {
                return "Введена пустая строка";
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(str.charAt(i))) {
                        return "Допустимы только положительные целые числа";
                    }
                }
                result = Integer.valueOf(str);
            }
        } else if (num instanceof Double) {
            result = ((Double) num).intValue();
        } else {
            result = (int) num;
        }
        return Integer.toBinaryString(result);
    }
}
