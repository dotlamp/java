package ch6_클래스의관계.a14_polymorphism_다형성;

import java.ch7_나머지주요구성요소.a8_inheritance_상속.Person;
import java.ch7_나머지주요구성요소.a8_inheritance_상속.Superman;

public class InstaceOfTest {

    public void badCasting(){
        Person person = new Person();
        Superman sman = (Superman)person;
        sman.fly();
    }

    public void goodCasting(){
        Person person = new Person();
        if(person instanceof Superman){
            Superman sman = (Superman)person;
            sman.fly();
        }else{
            System.out.println("Superman 에 적합하지 않은 객체");
        }
    }

    public static void main(String[] args) {
        InstaceOfTest iot = new InstaceOfTest();
        //iot.badCasting();
        //메서드 호출은 런타임 오류 발생
        iot.goodCasting();
    }
}