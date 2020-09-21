package ch6_클래스의관계.a13_modifier_제어자.final_;    /* 제어자(modifier)
    * 접근 제어자 : public protected, default=package, private
    * 그외 : static, final, abstract, synchronized
    * */

    /* final : 클래스, 메서드, 변수 사용*/
    /* final 클래스 : 상속 불가 ( String, Math)
    * 기존 메서드보다 잘 만들수 있을까? 재정의하면 어떻게 될까? 등에 대한
    * 근본적 방지
    * 상속은 허용, 오버라이딩 불가
    * */
class Member {
    final String name = "A";


    public Member(String name) {
        //this.name = name; //error    java: cannot assign a value to final variable name
    }
}

// final 변수는 선언과 동시에 초기화 해주나 초기화를 하지 않을 경우는 blank final 이라고 함
class Member_blank {
    /* blank final */
    final String name;


    public Member_blank(String name) {
        this.name = name;
    }
}

public class 제어자_final {

    public static void main(String[] args){
        Member_blank mb1 = new Member_blank("h");
        Member_blank mb2 = new Member_blank("ns");
        System.out.println(mb1.name+" , "+mb2.name);


        Member m1 = new Member("h");
        Member m2 = new Member("ns");
        System.out.println(m1.name+" , "+m2.name);
    }

}
