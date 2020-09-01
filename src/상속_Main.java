public class 상속_Main {
    public static void main(String[] args){
        /* 부모 */
        상속_Person person = new 상속_Person();
        person.eat();
        person.jump();
        person.run();

        System.out.println();

        /* 자식 */
        상속_Superman man = new 상속_Superman();
        man.fly();
        man.run(); //부모
        man.eat(); //부모

        System.out.println();

        /* 슈퍼맨1 의 자식 */
        상속_Superman2 man2 = new 상속_Superman2();
        man2.isSuperman = false;
        man2.fly();
        man2.run(); //부모의 부모
        man2.eat(); //부모의 부모

        System.out.println();

        man.jump(); //부모(조상) 을 참조하는 super

        System.out.println();

        man2.jump(); //부모(조상) 을 참조하는 super
    }


}
