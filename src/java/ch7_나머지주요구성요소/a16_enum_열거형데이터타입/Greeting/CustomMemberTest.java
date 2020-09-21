package java.ch7_나머지주요구성요소.a16_enum_열거형데이터타입.Greeting;

public class CustomMemberTest {

    public static void main(String[] args) {
        Greeting current = Greeting.GOOD_AFTERNOON; //Greeting.GOOD_AFTERNOON 상수(객체)를 current에 할당하고
        //멤버 변수인 message와 nextGreeting 메서드를 사용한다.
        //이 시점에서 nextGreeting 메서드는 내부에서의 this는 current 
        current.message = "Hello";
        Greeting next = current.nextGreeting();
        next.message = "Hi";
        System.out.printf("지금 : %s, 메세지 : %s\n", current, current.message);
        System.out.printf("다음 : %s, 메세지 : %s\n", next, next.message);

    }
}
