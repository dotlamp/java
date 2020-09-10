package Abstact_;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new DieselSUV_ab(), new ElectricCar_ab() };

        for (Vehicle v : vehicles){
            v.addFuel();
            v.reportPosition();
        }
    }
}
