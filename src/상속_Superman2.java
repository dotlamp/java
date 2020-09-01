public class 상속_Superman2 extends 상속_Superman {

    상속_Superman man = new 상속_Superman();
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
