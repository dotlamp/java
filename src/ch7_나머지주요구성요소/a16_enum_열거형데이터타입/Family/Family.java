package ch7_나머지주요구성요소.a16_enum_열거형데이터타입.Family;

public enum Family {
    FATHER("아빠"), MOTHER("엄마"), SON("아들"), DAUGHTER("딸"); //내부에서 enum 상수를 선언하면서 생성자에게 파라미터 값 전달

    private String kor;

    Family(String kor){ //문자열을 받는 생성자
        this.kor = kor;
    }

    public String getKor() {
        return kor;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }
}
