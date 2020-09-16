package ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.method;

public interface DefaultMethodInterface {
    void abstractMethod();

    default void defaultMethod(){
        System.out.println("기본 메서드");
    }
}
