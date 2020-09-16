package ch6_클래스의관계.a13_modifier_제어자.otherPackage;

import ch6_클래스의관계.a13_modifier_제어자.Parent;

public class OtherPackageSomeClass {
    public void method(){
        Parent p = new Parent();
        p.publicVar = 1;
        //protected
        //p.protectVar =2;
        //default
        //p.defaultVar = 3;
        //private
        //p.privVar = 4;
    }
}
