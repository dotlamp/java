package java.ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.IronMan;

public class IronManTest {
    public static void main(String[] args) {
        IronMan iman = new IronMan();
        Object obj = iman;
        Heroable heroable = iman; //upgrade // extends Fightable, Transformable
        Fightable fightable = iman; //fire
        Transformable transformable = iman; //changeShape


        iman.fire();
        iman.upgrade();
        iman.changeShape(true);

        heroable.fire();
        heroable.upgrade();
        heroable.changeShape(false);

        fightable.fire();

        transformable.changeShape(true);

    }
}
