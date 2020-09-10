package Abstact_.interface_;

/* 인터페이스 자체로는 객체가 될 수 없기 때문에
* 생성자나 초기화 블록도 존재하지 않는다.
* 멤버 변수와 메서드로만 구성된다.
* 인터페이스 멤버 변수는 반드시!
* public static final 이어야 한다.
* 모든 변수에 이 속성이 적요되어야 하므로 이 3개의 제어자는 생략 불가하다.
* protected, black final 형태로 구성 X */
public interface MyInterface {
    public static final int Member1 = 10;
    int Member2 = 10;

    public abstract void method1(int param);
    void method2(int param);
}
