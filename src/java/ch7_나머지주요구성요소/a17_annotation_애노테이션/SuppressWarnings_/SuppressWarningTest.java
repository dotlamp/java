package java.ch7_나머지주요구성요소.a17_annotation_애노테이션.SuppressWarnings_;
/*
* SupressWarning 경고를 막겠다는 표시
* */
public class SuppressWarningTest {
    public int method1(){
        @SuppressWarnings("unused")
                int i = 0; //The value of the local variable i is not used
        return 0;
    }


}
