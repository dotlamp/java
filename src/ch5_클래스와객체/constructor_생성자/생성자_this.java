package ch5_클래스와객체.constructor_생성자;

public class 생성자_this {
    /*
    * 생성자 : 객체를 생성할 때 일반 멤버 변수의 초기화 또는 실행하는 작업 정리
    *
    * 제한자 클래스명(타입 변수명, 타입 변수명 .. ){
    *  멤버 변수 초기화 작업
    * }
    * */


    /* 1. 기본 생성자 */
    String name;
    int age;
    public 생성자_this() {
    // public class 생성자(){} //생략된 기본 생성자
    }

    /* 2. 파라미터 생성자 */
    생성자_this(String n, int a){
        name = n;
        age = a;
    }


    /* this 용법 */
    /* 1. 현재 객체를 참조하기 위한 용도 */
    /*
    * ch5_클래스와객체.constructor.생성자_this(String name, int age){
        name = name;
        age = age;
    }
    * // 오류는 발생하지 않지만 경고 출력이 됨. 파라미터의 변수와  멤버 변수와 구분 X
    * ch5_클래스와객체.constructor.생성자_this(String name, int age){
        this.name = name;
        this.age ( 멤버 변수 의미) = age; (파라미터 변수 의미)
    }
    * static 에서는 사용 불가 ( this는 객체에 대한 레퍼런스(참조값) 이기 떄문에 객체 생성 전이기 떄문에)
    *
    *  2. 다른 생성자를 호출하는 this
    * 객체를 만들면서 초기화하려는 멤버 변수의 종류가 다를 떄 (생성자 오버로딩)
    * ch5_클래스와객체.constructor.생성자_this(String n){
        this(name, 20);
    }
    * */

    /* 생성자 자동완성 : alt + insert
    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public static void main(String[] args){
        생성자_this person1 = new 생성자_this(); // 인스턴스 생성 시 기본생성자 호출(멤버변수 초기화)
        person1.name = "홍길동";
        person1.age = 20;


        생성자_this person2 = new 생성자_this("홍길동", 20); // 파라미터 생성자를 이용하여 멤버 변수 초기화

        System.out.println(person1.name+person1.age);
        System.out.println(person2.name+person2.age);
    }
}
