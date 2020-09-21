package java.ch7_나머지주요구성요소.a16_enum_열거형데이터타입.Season;

public class SesonEnumTest {
    public void compareEnum(Season season){
        if(season.equals(Season.SPRING)){ //상수값 비교
            System.out.println("따뜻한 봄");
        }else if(season.compareTo(Season.WINTER)<0 ){ //compareTO() 메서드 이용해서 파라미터로 들어오는 season 과 Season.WINTER의 ordinal 값의 차 계산 (3)
            //만약 Season.FALL 이 들어오면 ordinal의 값(2) 이므로 compareTo는 2-3 으로 -1을 리턴한다
            System.out.println("최소한 겨울은 아니잖아요");
        }else{
            System.out.println(season.compareTo(Season.WINTER));
        }
    }

    public void enumSwitch(Season season){ //switch~case문에서 enum을 사용한다. 주의할 점은 case에서 enum 상수를 사용할 때 enum의 이름을 사용하지 않는다는 점
        switch (season){
            case SPRING:
                System.out.println("새잎이 나는 시기");
                break;
            case SUMMER:
                System.out.println("열매가 무르 익는 시기");
                break;
            case FALL:
                System.out.println("잎이 떨어지는 시기");
                break;
            default:
                System.out.println("겨울잠을 자는 시지");
        }
    }


    public static void main(String[] args) {
        SesonEnumTest set = new SesonEnumTest();
        set.compareEnum(Season.FALL);
        set.enumSwitch(Season.SPRING);
    }
}
