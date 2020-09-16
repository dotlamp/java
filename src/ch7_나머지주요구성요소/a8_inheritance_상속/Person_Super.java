package ch7_나머지주요구성요소.a8_inheritance_상속;


public class Person_Super extends Person2{

    Superman superman;
    boolean isSuperman;

    Person_Super(String name, Superman superman, boolean isSuperman){ //4. 호출
        super(name); // 5. 부모이름 확인
        this.superman = superman; // 10.
        this.isSuperman = isSuperman; // 11.
        System.out.println("inheritance.상속_Person_super(String name, Spider spider, boolean isSpiderman) 끝"); //12. 출력
    }

    Person_Super(String name){ //2. 호출
        this(name, new Superman(), true); //3. 오버로딩
        System.out.println("inheritance.상속_Person_super(String name) 끝"); //13 출력
    }

    public static void main(String[] args){
        Person_Super sp = new Person_Super("슈퍼슈퍼"); //1. 인스턴스 생성
    }

    /* 컴파일 결과
    * inheritance.Person2(String name) 끝
    * inheritance.상속_Person_super(String name, Spider spider, boolean isSpiderman) 끝
    * inheritance.상속_Person_super(String name) 끝
    * */

}
