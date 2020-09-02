package modifier.otherPackage;

import modifier.Parent;

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
