package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] resultList = new double[10];
        int index = 0;

        do{
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            double result = 0;
            switch (String.valueOf(operator)){
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> {
                    if (num2 == 0) System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    else result = (double)num1 / num2;
                }
                default -> System.out.println("연산기호를 확인해 주십시오.");
            }
            resultList[index++] = result;
            System.out.println("결과: " + String.format("%.1f", result));
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        }while(!sc.next().equals("exit"));


    }
}
