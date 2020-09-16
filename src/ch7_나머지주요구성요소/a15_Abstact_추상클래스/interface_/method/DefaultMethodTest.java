package ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.method;

public class DefaultMethodTest implements DefaultMethodInterface {

    @Override
    public void abstractMethod() {
        System.out.println("자식에서 반드시 재정의 필요");
    }

    public static void main(String[] args) {
        DefaultMethodTest dmt = new DefaultMethodTest();
        dmt.abstractMethod();;
        dmt.defaultMethod();
    }
}
