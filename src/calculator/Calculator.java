package calculator;

import java.util.ArrayList;

public class Calculator {
    // 원의 넓이 계산에 사용된는 원주율은 고정값으로 반복된다.
    static final double PI = 3.14;
    private ArrayList<Double> results, resultsCircle;

    Calculator(ArrayList<Double> results, ArrayList<Double> resultsCircle){
        this.results = results;
        this.resultsCircle = resultsCircle;
    }

    // 사칙연산 구역
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

    public ArrayList<Double> getResults() {
        return results;
    }

    public void setResults(ArrayList<Double> results) {
        this.results = results;
    }

    public void removeResult(int index) {
        this.results.remove(index);
    }

    public void inquiryResults() {
        System.out.println("연산결과 목록 = " + this.results.toString());
    }


    // 원 넓이 연산 구역
    public double calculateCircleArea(double radius) {
        return Math.round((PI * radius * radius)*100.0)/100.0;  // 소숫점 둘째자리까지 반올림
    }

    public ArrayList<Double> getResultsCircle() {
        return resultsCircle;
    }

    public void setResultsCircle(ArrayList<Double> resultsCircle) {
        this.resultsCircle = resultsCircle;
    }

    public void removeResultsCircle(int index) {
        this.resultsCircle.remove(index);
    }

    public void inquiryResultsCircle() {
        System.out.println("연산결과 목록 = " + this.resultsCircle.toString());
    }
}
