package variable;

public class member_local_variable_call {

    public static void main(String[] args){

        member_variable.print1(); //인스턴스를 생성하지 않아도 호출 가능

        member_variable name = new member_variable(); //인스턴스 생성
        name.print2(); //호출


        System.out.println("클래스 변수 a : "+ member_variable.a);
        member_variable ex1 = new member_variable();
        member_variable ex2 = new member_variable();

        System.out.println("클래스 변수 ex1.a : "+ex1.a);
        System.out.println("클래스 변수 ex2.a : "+ex2.a);
        System.out.println("인스턴스 변수 ex1.b : "+ex1.b);
        System.out.println("인스턴스 변수 ex2.b : "+ex2.b);

        ex1.a = 3;
        ex1.b = 4;
        System.out.println("클래스 변수 ex1.a = 3 변경");
        System.out.println("클래스 변수 ex1.b = 4 변경");

        System.out.println("클래스 변수 ex1.a : "+ex1.a);
        System.out.println("클래스 변수 ex2.a : "+ex2.a);
        // 객체가 생성될 때마다 생성되는 각각의 변수가 아니라
        // 공유하는 변수이므로 ex1 객체에서 클래스 변수를 수정하고
        // ex2 객체에서 이 클래스 변수를 출력하면 수정한 값이 출력된다.
        System.out.println("인스턴스 변수 ex1.b : "+ex1.b);
        System.out.println("인스턴스 변수 ex2.b : "+ex2.b);
        // ex1 객체의 인스턴스 변수를 수정하더라도 ex2 객체의 인스턴스 변수와는 별개이다


        /*
         * 클래스 변수
         * - 클래스 안에 있는 멤버변수로 변수 앞에 static을 붙여 사용.
         *   클래스가 메모리에 올라갈 때 생성되므로 모든 객체가 해당 변수를 공유한다.
         *   따라서 위의 예시처럼 따로 객체를 생성하지 않아도 직접 변수에 접근이 가능하다.
         *
         * 인스턴스 변수
         * - 인스턴스 변수는 인스턴스가 생성될 때 각각의 인스턴스가 가지는 변수이다.
         *   따라서 인스턴스를 생성하지 않고 인스턴스 변수에 접근하여 출력 불가
         *
         * 지역변수
         * - 지역변수는 메소드 내에서 선언되며 메소드 내에서만 사용할 수 있는 변수이다.
         *   메소드가 실행될 때 메모리를 할당 받으며 메소드가 끝나면 소멸되어 사용할 수 없게 된다.
         * */


    }


}
