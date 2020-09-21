package java.ch7_나머지주요구성요소.a18_Generic_제네릭.Box;

public class NormalBoxTest {
    public static void main(String[] args) {

        NormalBox nBox1 = new NormalBox();
        nBox1.setSome(new Toy());
        Object some = nBox1.getSome();
        if(some instanceof Toy){
            Toy toy = (Toy)some;
        }else if(some instanceof Grocery){
            Grocery grocery = (Grocery)some;
        }else{
            System.out.println("알수없음");
        }
    }
}
