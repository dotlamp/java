package Abstact_.interface_;

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
