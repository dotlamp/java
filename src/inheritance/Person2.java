package inheritance;

class Person2{
    String name;
    Person2(String name){ //6. 호출
        //super(); //Object 기본생성자 호출
        this.name = name; //7. 부모이름 확인
        System.out.println("inheritance.Person2(String name) 끝"); //8. 출력
    }
}