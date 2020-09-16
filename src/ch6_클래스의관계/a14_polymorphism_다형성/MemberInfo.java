package ch6_클래스의관계.a14_polymorphism_다형성;

public class MemberInfo extends UserInfo {
    String grade = "정회원";

    @Override
    public String toString() {
        return super.toString() + ", 등급 : "+grade;
    }
}
