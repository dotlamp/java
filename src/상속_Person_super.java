class Person2{
    String name;
    Person2(String name){ //6. 호출
        //super(); //Object 기본생성자 호출
        this.name = name; //7. 부모이름 확인
        System.out.println("Person2(String name) 끝"); //8. 출력
    }
}
public class 상속_Person_super extends Person2{

    상속_Superman superman;
    boolean isSuperman;

    상속_Person_super(String name, 상속_Superman superman, boolean isSuperman){ //4. 호출
        super(name); // 5. 부모이름 확인
        this.superman = superman; // 10.
        this.isSuperman = isSuperman; // 11.
        System.out.println("상속_Person_super(String name, Spider spider, boolean isSpiderman) 끝"); //12. 출력
    }

    상속_Person_super(String name){ //2. 호출
        this(name, new 상속_Superman(), true); //3. 오버로딩
        System.out.println("상속_Person_super(String name) 끝"); //13 출력
    }

    public static void main(String[] args){
        상속_Person_super sp = new 상속_Person_super("슈퍼슈퍼"); //1. 인스턴스 생성
    }

    /* 컴파일 결과
    * Person2(String name) 끝
    * 상속_Person_super(String name, Spider spider, boolean isSpiderman) 끝
    * 상속_Person_super(String name) 끝
    * */

}
