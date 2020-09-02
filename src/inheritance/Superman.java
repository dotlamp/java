package inheritance;

public class Superman extends Person {

    boolean isSuperman;

    public void fly(){
        System.out.println("슈퍼맨 날기");
    }

    public void run() {
        System.out.println("슈퍼1 뛰기");
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("슈퍼1 점프");
    }
}
