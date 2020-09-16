package ch7_나머지주요구성요소.a17_annotation_애노테이션;
/*
* 애노테이션의 사전적 의미는 주석
* 자바의 주석 형태 :
* - 단일행 주석(//)
* - 다중 행 주석 ( /* ... * / )
* - javaDoc 주석 (/** ...  * / )
* 애노테이션은 개발자 읽기 위한 주석이 아니라
* JVM, 컴파일러, 프레임워크 등에게 전달하는 일종의 메타데이터
* 메타데이터란 다른 테이터를 설명해주는 데이터로 속성 정보라고 한다.
* 즉, 부가적인 정보를 추가하기 위해 그 데이터와 함께 제공되는 것
 */
public class Main {

    /*
    *
    * @Target({TYPE, FILED, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
    * @Retention(RetentionPolicy.SOURCE)
    * //메타 에노테이션
    * public @interface SuppressWarnings{
    * //에노테이션 선언
    * String[] value();
    * //에노테이션 속성
    * }
    * */
}
