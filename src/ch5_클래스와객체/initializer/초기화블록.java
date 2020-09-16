package ch5_클래스와객체.initializer;

public class 초기화블록 {

    /* 초기화 블록(ch5_클래스와객체.initializer) : 생성자 처럼 멤버 변수 초기화 */
    /* 클래스 초기화
    *  클래스 로딩 -> 클래스 초기화 블록
    *
    * 인스턴스 초기화
    *  객체생성 -> new 사용 -> 인스턴스 초기화 블록 -> 생성자 코드
    *
    * */

    int a;
    static int b;

    static{ //클래스 초기화 블록
        System.out.println("static ch5_클래스와객체.initializer");
        b = 200;
    }

    {
        System.out.println("instance initalizer");
        a = 100;
    }

    public 초기화블록(){ //파라미터 없는 생성자
        System.out.printf("ch5_클래스와객체.constructor a: %d, b: %d \n", a, b);
        this.a = 300;
    }

    public static void main(String[] args){
        초기화블록 it1 = new 초기화블록();
        System.out.printf("객체 1 생성 후 a: %d, b: %d\n", it1.a, ch5_클래스와객체.initializer.초기화블록.b);
        초기화블록 it2 = new 초기화블록();
        System.out.printf("객체 2 생성 후 a: %d, b: %d\n", it2.a, ch5_클래스와객체.initializer.초기화블록.b);

        /* 컴파일 결과
        * static ch5_클래스와객체.initializer //클래스가 로딩 되면서 클래스 초기화 블록 동작 하여 멤버 변수 b의 값을 200으로 변경
          instance initalizer  //main 메서드가 동작하면서 ch5_클래스와객체.initializer.초기화블록 객체를 생성하는 과정에 인스턴스 초기화 블록이 동작해 멤버변수 a값을  100으로 변경
          ch5_클래스와객체.constructor a: 100, b: 200  //셍성자 내부 코드에 의해 b값을 300으로 초기화 후 객체 생성
          객체 1 생성 후 a: 300, b: 200 //생성된 후 값
          instance initalizer
          ch5_클래스와객체.constructor a: 100, b: 200
          객체 2 생성 후 a: 300, b: 200
        *
        * */
    }
}
