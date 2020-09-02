package modifier;

public class 제어자_접근제어자 {

    /*
    * 사용가능 범위
    * 구분             \ 클래스 \ 생성자 \ 멤버
    * public           \   O    \   O    \  O
    * protected        \        \   O    \  O
    * default(package) \   O    \   O    \  O
    * private          \        \   O    \  O
    *
    * 적용가능 범위
    * 구분             \같은클래스\같은패키지\다른패키지 자손클래스\전체
    * public           \    O     \    O     \         O           \  O
    * protected        \    O     \    O     \                     \
    * default(package) \    O     \    O     \                     \
    * private          \    O     \          \                     \
    * */

}
