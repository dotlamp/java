package java.ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.Calculator;

public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        System.out.printf("파라미터 확인 %d, %d\n", a, b);
        return a+b;
    }
}
