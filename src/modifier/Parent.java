package modifier;

public class Parent {

    public int publicVar;
    protected int protectVar;
    int defaultVar;
    private int privVar;

    public void useMember(){
        this.publicVar = 1;
        this.protectVar = 2;
        this.defaultVar = 3;
        this.privVar = 4;
    }
    protected void method(){

    }
}
