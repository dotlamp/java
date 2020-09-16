package ch6_클래스의관계.a13_modifier_제어자;

public class SamePackageChildClass extends Parent {
    public void useMember(){
        this.publicVar = 1;
        this.protectVar = 2;
        this.defaultVar = 3;
        //private
        //this.privVar = 4;
    }
}
