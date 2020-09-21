package java.ch7_나머지주요구성요소.a15_Abstact_추상클래스;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new DieselSUV_ab(), new ElectricCar_ab() };

        for (Vehicle v : vehicles){
            v.addFuel();
            v.reportPosition();
        }
    }
}
