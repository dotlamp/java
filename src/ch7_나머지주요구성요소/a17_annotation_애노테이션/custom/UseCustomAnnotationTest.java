package ch7_나머지주요구성요소.a17_annotation_애노테이션.custom;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class UseCustomAnnotationTest {

    public static void main(String[] args) throws Exception{

        CustomPropSet cps = new CustomPropSet();
        //CustomPropSet 객체 생성 <- MyPropLabel 애노테이션 설정이 되어 있음
        Map<String, Object> dbProp = new HashMap<>();
        Map<String, Object> webProp = new HashMap<>();
        //각각 db, web 타입으로 설정된 변수들을 저장할 객체 생성
        Field[] fields = CustomPropSet.class.getDeclaredFields(); //CustomPropSet 클래스에 선언된 멤버 변수들에 대한 정보가 Field[] 타입으로 반환
        for(Field field : fields){
            MyPropLabel annotation = field.getDeclaredAnnotation(MyPropLabel.class);

            if(field.get(cps) == null){
                field.set(cps, annotation.strDefault());
            }
            //filed의 해당값이 없다면 애노테이션 설정된 strDefault 값 할당
            if(annotation.value().equals("web")){
                webProp.put(field.getName(), field.get(cps));
            }else{
                dbProp.put(field.getName(), field.get(cps));
            }
            //애노테이션이 가진 value가 web이면 webProp / db면 dbProp 에 정보 저장
        }
        //반복문에서 멤버 변수에 설정된 @MyPropLabel의 Value와 strDefault 속성 분석
        System.out.printf("DB 관련 변수 : %s \n", dbProp);
        System.out.printf("WEB 관련 변수 : %s \n", webProp);
    }
}
