package modifier;

public class SamePackageSomeClass {
    public void method(){
        Parent p = new Parent();
        p.publicVar = 1;
        p.protectVar = 2;
        // private
        // p.privVar = 4;
    }
}
