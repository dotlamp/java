package ch6_클래스의관계.a14_polymorphism_다형성;

import ch7_나머지주요구성요소.a8_inheritance_상속.Person;
import ch7_나머지주요구성요소.a8_inheritance_상속.Superman;

public class 다형성 {
    public static void main(String[] args) {
        Superman sman = new Superman();
        Person person = sman;
        Object obj = sman;
        System.out.println(sman);
        System.out.println(person);
        System.out.println(obj);

        System.out.println((sman==person)?"same":"!same");
        System.out.println((person==obj)?"same":"!same");
    }
}
