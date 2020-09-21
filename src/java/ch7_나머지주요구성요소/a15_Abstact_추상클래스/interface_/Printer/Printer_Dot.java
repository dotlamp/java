package java.ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.Printer;

public class Printer_Dot implements Printer{

    @Override
    public void print(String fileName) {
        System.out.printf("Dot Printer로 출력 중 : %s \n", fileName);
    }
}
