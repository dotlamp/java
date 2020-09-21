package ch5_클래스와객체.a3_class_클래스와객체;

/*
 *  클래스 : 도면
 *  객체 : 도면을 이용해서 생산하는 제품
 * */

public class 클래스와객체 {
    /*
     * 클래스
     *  - 자동차의 설계도 즉 구조나 기능 등을 명세하는 것
     *  - 자동차의 구체적인 이름과 색깔 등은 정해지지 않은 상태
     * */

    public static class Car { //클래스 생성
        String name;  //지역변수
        String color;
        int createYear;

        void carDrive(){
            System.out.println("차량 전진");
        }
        void carParking(){
            System.out.println("차량 주차");
        }
        int carCreateYear(){
            return createYear;
        }
        void getCarCreateYear(int year){
            createYear = year;
        }
    }

    public static void main(String[] args) {
        /*
         * 객체
         *  - 객체는 현실 세계의 대상을 말함.
         *  - 차량의 종류( 코나, 셀토스 등)
         *  - 객체들이 공통적으로 가질 수 있는 상태 정보와 행동에 대해 정의해 놓은 것을 클래스 라고 함.
         * */
        Car kona; //객체생성
        Car seltos; //객체생성

        /*
         * 인스턴스
         *  - 자동차 설계도인 클래스를 이용하여 객체를 실체화한 것이 인스턴스이다.
         *  - 프로그래밍에서는 메모리에 적재되었을 때
         *  - 실체화된 차를 전진시키고 주차할 수 있다.
         * */

        kona = new Car(); //인스턴스 생성
        seltos = new Car(); //인스턴스생성

        kona.carDrive(); //인스턴스 호출
        seltos.carParking(); //인스턴스 호출

    }

}
