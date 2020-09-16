package ch7_나머지주요구성요소.a16_enum_열거형데이터타입.Grade;

public class GradeEnumTest {

    public static void main(String[] args) {

        Grade grade = Grade.SALES; //Grade 탕비의 변수 grade 선언하고 Grade.SALES 상수를 할당한다. 각각의 상수가 enum 타입 값
        System.out.println(grade); //SALES // enum객체를 출력하면 enum에서 정의된 상수의 이름이 출력
        System.out.println(grade instanceof Enum); //true //grade가 Enum의 자손인지 확인한다.
        System.out.println(grade instanceof Object); //true //grade가 Object의 자손인지 확인한다.

    }
}
