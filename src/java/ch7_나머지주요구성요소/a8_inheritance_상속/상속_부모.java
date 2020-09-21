package java.ch7_나머지주요구성요소.a8_inheritance_상속;

public class 상속_부모 {
    String x = "parent";

    static class 상속_자식 extends 상속_부모{
        //String x = "child";

        void method(){
            //String x = "method";
            System.out.println("x : " + x);
            System.out.println("this.x : " + this.x);
            System.out.println("super.x : " + super.x);

        }
    }

    public static void main(String[] args){
        상속_자식 child = new 상속_자식();
        child.method();

        /* 컴파일 결과 */
        /*
        * x : method
        * this.x : child
        * super.x : parent
        *
        *
        *  //String x = "method"; 주석 처리
        * x : child
        * this.x : child
        * super.x : parent
        *
        *  //String x = "method"; //String x = "child"; 주석 처리
        * x : parent
        * this.x : parent
        * super.x : parent
        * */

        /* 메서드 내부 로컬 변수 -> 해당 클래스 멤버 변수 -> 부모 클래스 멤버 변수 -> 조상클래스 멤버 변수
        * 로 확장해ㅐ 가며 서언된 곳을 찾아간다. 그러다가 최상위 객체인 Object 까지 찾아봤는데도 선언된
        * 변수가 없으면 오류 발생*/
    }
}
