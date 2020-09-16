package ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.Printer;

public class PrintClientTest {
    public static void main(String[] args) {

        PrintClient pc = new PrintClient();

        pc.setPrinter(new Printer_Dot());
        pc.printThis("hello");
        pc.setPrinter(new Printer_Laser());
        pc.printThis("hi");
    }
}
