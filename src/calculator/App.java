package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        do{
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            try{
                double result = calc.calculate(num1, num2, operator);
                System.out.println("결과: " + String.format("%.1f", result));
                calc.resultList.add(result);
            }catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if(sc.next().equals("remove")){
                calc.resultList.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if(sc.next().equals("inquiry")){
                for(double val : calc.resultList){
                    System.out.println(val);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        }while(!sc.next().equals("exit"));


    }
}
