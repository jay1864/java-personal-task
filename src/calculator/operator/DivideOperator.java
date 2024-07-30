package calculator.operator;

public class DivideOperator implements Operator {

    @Override
    public double operate(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("[입력오류] : 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        double result = (double)num1 / num2;
        return Math.round(result * 100.0) / 100.0;
    }
}
