package java.ch7_나머지주요구성요소.a16_enum_열거형데이터타입.Family;

public class UseConstructorTest {
    public static void main(String[] args) {
        Family current = Family.MOTHER;
        System.out.printf("값 확인 : %s, kor : %s \n", current, current.getKor());
        current.setKor("어머니");
        System.out.printf("값 확인 : %s, kor : %s \n", current, current.getKor());
    }
}
