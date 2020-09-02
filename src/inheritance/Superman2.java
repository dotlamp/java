package inheritance;

public class Superman2 extends Superman {

    Superman man = new Superman();
    boolean isSuperman;

    public void fly(){
        if(isSuperman){
            man.fly();
        }else{
            System.out.println("슈퍼맨 날기 불가");
        }
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("슈퍼2 점프");
    }
}
