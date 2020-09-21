package java.ch7_나머지주요구성요소.a8_inheritance_상속;

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
