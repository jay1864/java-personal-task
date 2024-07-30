package calculator;

import calculator.operator.*;
import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    ArithmeticCalculator(ArrayList<Double> results) {
        super(results);
    }

    public double calculate (int num1, int num2, char op) throws InvalidInputException {
        Operator operator = switch (String.valueOf(op)){
            case "+" -> new AddOperator();
            case "-" -> new SubtractOperator();
            case "*" -> new MultiplyOperator();
            case "/" -> new DivideOperator();
            case "%" -> new ModOperator();
            default -> throw new InvalidInputException("[입력오류] : 연산기호를 확인해 주십시오.");
        };
        return operator.operate(num1, num2);
    }

    @Override
    void inquiryResults() {
        System.out.println("연산결과 목록 = " + super.getResults().toString());
    }
}
