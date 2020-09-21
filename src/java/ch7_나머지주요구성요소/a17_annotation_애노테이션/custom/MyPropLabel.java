package java.ch7_나머지주요구성요소.a17_annotation_애노테이션.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //Retention에 유효기간이 RUNTIME으로 설정돼서 리플렉션 적용이 가능
@Target(ElementType.FIELD) //Target 적용 대상이 FIELD 이므로 멤버 변수에 적용할 수 있다.
public @interface MyPropLabel {
    String value();
    //String 타입의 value 속성을 갖는다. 기본값이 없으므로 애노테이션 적용 시 반드시 값을 지정

    String strDefault() default "아직 값 설정 전";
    //strDefault는 String 타입의 속성으로 default 값을 가지고 있으므로 반드시 설정할 필요 X

}
