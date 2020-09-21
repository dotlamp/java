package ch6_클래스의관계.a14_polymorphism_다형성;

public class SubClass extends SuperClass {
    String x = "Sub";
    public void method(){
        System.out.println("sub class method");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.x); //Sub
        subClass.method(); //sub class method


        //
        SuperClass superClass = new SubClass();
        System.out.println(superClass.x); //Super
        superClass.method(); //*** sub class method
        //상속 관계에서 객체의 맴버변수가 중복될 때는 참조 변수의 타입에 따라 연결이 달라진다.
        //즉 SuperClass로 참조할 때는 SuperClass의 멤버변수, SubClass로 참조할 때는 SubClass 멤버변수가 사용된다.
        //하지만 상속관계에서는 메서드가 오버라이딩 되었을 때는 무조건* 자식 클래스의 메서드가 호출된다.
        //이것을 가상메서드 호출(virtual method call)
        //메서드의 재정의는 부모가 물려준 메서드를 자식 입장에 맞게 최적화 시킨다고 할 때 실제 메모리에 있는 객체가
        //가진 가장 최적화된 메서드가 동작한다고 생각하면 좋겠다.

    }
}
