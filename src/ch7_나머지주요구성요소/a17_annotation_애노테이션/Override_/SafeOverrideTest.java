package ch7_나머지주요구성요소.a17_annotation_애노테이션.Override_;

public class SafeOverrideTest extends SuperClass {
    @Override
    protected void someMethod() {
        super.someMethod();
    }

    //조상 메서드 이름과 동일
    //이름이 다르면 메서드 재정의 실패
    //컴파일러는 이를 파악하고 오류 메세지 발생시켜 컴파일이 진행 X
}
