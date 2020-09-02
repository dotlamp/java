package singleton;
/*
* 싱글톤 패턴
* - 고정된 메모리 영역을 사용하도록 단 한번 new 연산자로 인스턴스를 얻어 오기 때문에 메모리 낭비 줄임
* - 전역 변수로 선언되고 전역 메서드로 호출하기 때문에 다른 클래스에서 사용하기 쉬움
* - 공통된 객체를 사용해야 하는 코딩에서 매번 객체를 생성하지 않고 같은 객체를 사용하도록 하면 성능면 우수
* */
public class SingletonClass {
    private static SingletonClass singletonClass = new SingletonClass();
    private SingletonClass(){
        System.out.println("Singleton Instance created");
    }

    public static SingletonClass getInstance(){
        return singletonClass;
    }
}
