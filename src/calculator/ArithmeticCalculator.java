package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    ArithmeticCalculator(ArrayList<Double> results) {
        super(results);
    }

    public double calculate (int num1, int num2, char op) throws InvalidInputException {
        double result;
        switch (String.valueOf(op)){
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0){
                    throw new InvalidInputException("[입력오류] : 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = (double)num1 / num2;
                result = Math.round(result * 100.0) / 100.0;    // 소숫점 둘째자리까지 반올림
            }
            default -> throw new InvalidInputException("[입력오류] : 연산기호를 확인해 주십시오.");
        }
        return result;
    }

    @Override
    void inquiryResults() {
        System.out.println("연산결과 목록 = " + super.getResults().toString());
    }
}
