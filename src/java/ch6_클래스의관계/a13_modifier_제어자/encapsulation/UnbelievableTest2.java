package ch6_클래스의관계.a13_modifier_제어자.encapsulation;

public class UnbelievableTest2 {
    public static void main(String[] args) {
        UnbelievealbleUserInfo2 info = new UnbelievealbleUserInfo2();
        System.out.printf("user info : %s, %d \n", info.getName(), info.getAccount());
        info.setName(null);
        info.setAccount(-10000);
        System.out.printf("user info : %s, %d \n", info.getName(), info.getAccount());
    }

}
