package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonClass sc1 = new SingletonClass.getInstance();
        SingletonClass sc2 = new SingletonClass.getInstance();

        System.out.printf("두 객체 same? %b \n", sc1 == sc2);
        sc1.sayHello();
    }
}
