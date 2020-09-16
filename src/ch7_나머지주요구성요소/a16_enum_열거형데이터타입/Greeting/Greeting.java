package ch7_나머지주요구성요소.a16_enum_열거형데이터타입.Greeting;

public enum Greeting {
    GOOD_MORNING, GOOD_AFTERNOON, GOOD_EVENING; //세미콜론 주의
    //다른 멤버를 추가하기 위해 ; 으로 마무리
    String message;
    //멤버 변수 추가 선언

    public Greeting nextGreeting(){
        if(this.equals(GOOD_EVENING)){
            return GOOD_MORNING;
        }else if(this.equals(GOOD_AFTERNOON)){
            return GOOD_EVENING;
        }else{
            return GOOD_AFTERNOON;
        }

        //this는 메서드를 호출하는 enum 상수 의미
    }
}
