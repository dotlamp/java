package polymorphism;

//공변 리턴타입 (공병 : 하나가 변하면 다음 것이 따라서 변하는 것을 말함 Covariant)
//조상메서드의 리턴 타입을 서브클래스 범위 안에서 다양하게 사용 할 수 있다는 것
public class Phone_Hand extends Phone {
    public int weight = 100;

    @Override
    public Phone_Hand aboutMe() {
        return this;
    }

    public static void main(String[] args) {
        Phone_Hand hp = new Phone_Hand(); //자식
        Phone aboutMe = hp.aboutMe(); //부모 <- 자식

        if(aboutMe instanceof Phone_Hand){
            System.out.println(((Phone_Hand)aboutMe).weight);
        }

        //공변 반환 타입 이용시
        //형변환의 번거로움 최소화
        Phone_Hand aboutMe2 = hp.aboutMe();
        System.out.println(aboutMe2.weight);

    }
}
