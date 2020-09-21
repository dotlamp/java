package ch2_변수와자료형.a4_variable_변수;

public class member_variable {

    static void print1(){ //클래스메소드
        System.out.println("클래스 메소드입니다.");
    }

    void print2(){ //인스턴스메소드
        System.out.println("인스턴스메소드입니다");
    }

    static int a = 1; //클래스변수(공유변수)

    int b = 2; //인스턴스 변수(객체 변수)

}

