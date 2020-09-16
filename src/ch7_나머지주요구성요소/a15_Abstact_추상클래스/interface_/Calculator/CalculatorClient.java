package ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.Calculator;

import java.util.Scanner;

public class CalculatorClient {
    Calculator calcLogic = new CalculatorStub();

    public void add(){
        System.out.println("첫번째 정수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        int b = sc.nextInt();
        System.out.printf("결과 : %d + %d = %d\n", a, b, calcLogic.add(a,b));
    }
}
