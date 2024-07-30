package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    private final static double PI = 3.14;

    CircleCalculator(ArrayList<Double> results) {
        super(results);
    }

    public double calculateCircleArea(double radius) {
        return Math.round((PI * radius * radius)*100.0)/100.0;  // 소숫점 둘째자리까지 반올림
    }

    @Override
    void inquiryResults() {
        System.out.println("원 넓이 목록 = " + super.getResults().toString());
    }
}
