package java.ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.Printer;

public class PrintClient {

    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printThis(String fileName){
        printer.print(fileName);
    }
}
