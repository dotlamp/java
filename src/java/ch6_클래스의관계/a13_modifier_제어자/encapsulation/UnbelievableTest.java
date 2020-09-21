package ch6_클래스의관계.a13_modifier_제어자.encapsulation;

public class UnbelievableTest {
    public static void main(String[] args) {
        UnbelievealbleUserInfo info = new UnbelievealbleUserInfo();
        System.out.printf("user info : %s, %d \n", info.name, info.account);
        info.name = null;
        info.account = -10000;
        System.out.printf("user info : %s, %d \n", info.name, info.account);
    }

    //외부에서 접근가능

}
