package ch6_클래스의관계.a13_modifier_제어자.otherPackage;

import ch6_클래스의관계.a13_modifier_제어자.Parent;

public class OtherPackageChildClass extends Parent {
    public void useMember(){
        this.publicVar = 1;
        this.protectVar = 2;
        //default
        //this.defaultVal = 3;
        //private
        //this.privVar = 4;
    }
}
