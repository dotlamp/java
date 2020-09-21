package ch6_클래스의관계.a13_modifier_제어자;

public class SamePackageSomeClass {
    public void method(){
        Parent p = new Parent();
        p.publicVar = 1;
        p.protectVar = 2;
        // private
        // p.privVar = 4;
    }
}
