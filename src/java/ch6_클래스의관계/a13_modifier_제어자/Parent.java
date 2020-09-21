package ch6_클래스의관계.a13_modifier_제어자;

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
