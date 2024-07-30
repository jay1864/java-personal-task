package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArithmeticCalculator arithmeticCal = new ArithmeticCalculator(new ArrayList<>());
        CircleCalculator circleCal = new CircleCalculator(new ArrayList<>());

        do{
            System.out.println("진행할 계산을 선택하세요. (1: 사칙연산 / 2: 원의 넓이 계산)");
            int choice = sc.nextInt();
            double result;

            if(choice == 1){ // 사칙연산
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                try{
                    result = arithmeticCal.calculate(num1, num2, operator);
                    System.out.println("결과: " + result);
                    arithmeticCal.getResults().add(result);
                }catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if(sc.next().equals("remove")){
                    arithmeticCal.removeResult(0);
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if(sc.next().equals("inquiry")){
                    arithmeticCal.inquiryResults();
                }

            } else { // 원의 넓이 계산
                System.out.print("원의 반지름을 입력하세요 : ");
                double radius = sc.nextDouble();

                result = circleCal.calculateCircleArea(radius);
                System.out.println("결과: " + result);
                circleCal.getResults().add(result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if(sc.next().equals("remove")){
                    circleCal.removeResult(0);
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if(sc.next().equals("inquiry")){
                    circleCal.inquiryResults();
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        }while(!sc.next().equals("exit"));
    }
}
