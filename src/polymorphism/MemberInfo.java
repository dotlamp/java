package polymorphism;

public class MemberInfo extends UserInfo {
    String grade = "정회원";

    @Override
    public String toString() {
        return super.toString() + ", 등급 : "+grade;
    }
}
