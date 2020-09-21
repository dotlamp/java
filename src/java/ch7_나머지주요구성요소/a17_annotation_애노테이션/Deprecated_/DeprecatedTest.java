package java.ch7_나머지주요구성요소.a17_annotation_애노테이션.Deprecated_;

import java.util.Date;
/*
* Deprecated 원래 사용하던 메서드에 대해 앞으로 없어질 수 있으니 사용 자제
* */
public class DeprecatedTest {
    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        sc.oldMethod();
        //객체 생성 후 oldMethod 사용하면 취소선 표시
        Date date = new Date(2000, 01, 01);
        //자바API에도 deprecated 된 생성자, 메서드들이 존재
        //이런 API는 가급적 사용 X
    }
}
