package modifier.otherPackage;

import modifier.Parent;

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
