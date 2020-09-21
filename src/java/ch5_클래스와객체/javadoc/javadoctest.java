package ch5_클래스와객체.javadoc;

/*
* 이 클래스는 자바의 도큐멘테이션 주석을 테스트하기 위한 클래스이다
* @author dotlamp  <- 소스 작성자 정보를 넣기도 함.
*/

public class javadoctest {

    /*
    * 멤버 변수에 대한 주석
    * */
    public int memberVar;

    /*
    * 기본 생성자
    * */
    public javadoctest(){
        System.out.println("기본생성자");
    }

    /*
    * 멤버 메서드에 대한 주석
    * @param num  memberVar에 곱해지는 수
    * @return memberVar과 num으 곱을 리턴
    * */
    public int multiPlyMemberVar(int num){
        return memberVar*num;
    }
}
