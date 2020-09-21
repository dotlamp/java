package java.ch7_나머지주요구성요소.a17_annotation_애노테이션.custom;

public class CustomPropSet {

    @MyPropLabel("db")
    String dbHost = "127.0.0.1";
    //dbHost 변수에 @MyPropLabel 적용. value 속성만 db로 설정 값은 127.0.0.1

    @MyPropLabel(value="web", strDefault = "localhost")
    String serverHost;
    //serverHost 변수에 @MyPropLabel 적용. value는 web, strDefaul에는 localhost 설정

    @MyPropLabel("db")
    String dbPort;
    //dbPort 변수에 선언된 애노테이션에는 value가 db로 설정되었고 별도의 값은 할당 X

    @MyPropLabel(value = "web", strDefault = "8080")
    String serverPort;

}
