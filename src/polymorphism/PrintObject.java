package polymorphism;

public class PrintObject {
    public static void main(String[] args) {
        Object member = new MemberInfo();
        System.out.println("객체 정보 : ( "+ member + " )");

        //객체 정보 : ( polymorphism.MemberInfo@1b6d3586 )
        //prtintln(Object obj) method : write(String.valueOf(obj));
        //valueOf(Object obj) method : return (obj == null) ? "null" : obj.toString();
        //toString :  return getClass().getName() + "@" + Integer.toHexString(hashCode());

        //오버라이드 후, 객체 정보 : ( 이름 : 홍길동, 등급 : 정회원 )

        //생성하는 객체에서 toString() 오버라이드를 해야 값 출력 가능
        //가상 메서드 호출에 의해 언제나 마지막에 재정의된 메서드가 동작해서 출력내용이 결정


        System.out.println();
    }
}
