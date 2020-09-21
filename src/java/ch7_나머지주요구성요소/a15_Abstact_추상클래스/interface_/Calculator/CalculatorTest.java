package java.ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.Calculator;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorClient client = new CalculatorClient(); //Scanner 사용
        client.add();

        System.out.println("_________________");

        Calculator calcLogic = new CalculatorImpl();
        int result = calcLogic.add(100,200); // Scanner 불필요
        System.out.printf("결과 확인 : %d \n", result);
    }
}
