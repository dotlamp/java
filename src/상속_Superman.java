public class 상속_Superman extends 상속_Person {

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
