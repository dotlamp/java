package modifier.encapsulation;

public class UnbelievableTest2 {
    public static void main(String[] args) {
        UnbelievealbleUserInfo2 info = new UnbelievealbleUserInfo2();
        System.out.printf("user info : %s, %d \n", info.getName(), info.getAccount());
        info.setName(null);
        info.setAccount(-10000);
        System.out.printf("user info : %s, %d \n", info.getName(), info.getAccount());
    }

}
