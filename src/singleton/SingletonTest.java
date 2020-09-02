package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        /* 딱 한번 호출 됨 */
        SingletonClass sc1 = SingletonClass.getInstance();
        SingletonClass sc2 = SingletonClass.getInstance();

        if(sc1 == sc2){
            System.out.println("sc1 == sc2");
        }else {
            System.out.println("sc != sc2");
        }
    }
}
