package ch7_나머지주요구성요소.a16_enum_열거형데이터타입.method;

public class EnumMethodTest {
    public static void main(String[] args) {
        Tea[] teaArray = Tea.values(); //values 메서드를 이용해 Tea가 가진 모든 상수값을 배열 형태로 리턴
        for(Tea tea: teaArray){
            String strName = tea.name(); //enum 상수의 이름을 문자열로 반환 후 출력
            System.out.printf("이름 : %s \n", strName);
            System.out.printf("등장순서 : %d \n", tea.ordinal()); //enum 상수의 ordinal 값을 출력
            //문자열을 다시 Enum 타입으로
            Tea reTea = Tea.valueOf(strName);
            System.out.printf("원래의 객체와 같은가? %b \n", reTea.equals(tea));
            //문자열로 저장했던 enum 상수의 이름을 다시 enum 상수를 가져오고 원래의 값과 같은지 비교
        }
    }
}


/*이름 : COFFEE
등장순서 : 0
원래의 객체와 같은가? true
이름 : BLACK_TEA
등장순서 : 1
원래의 객체와 같은가? true
이름 : GREEN_TEA
등장순서 : 2
원래의 객체와 같은가? true */