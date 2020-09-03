package polymorphism;

import inheritance.Person;
import inheritance.Superman;

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
