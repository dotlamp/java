package ch3_연산자와제어문.a6_operator_연산자;

import java.math.BigDecimal;

public class 연산자 {
    public static void main(String[] args){

        // int 미만 (4byte 미만)인 경우 int로 자동형변환
        //byte + byte = (int)byte + (int)byte = int
        byte a1 = 1;
        byte a2 = 2;
        //(int)byte a3 = (int)a + (int)b; //error
        int a3 = (int)a1+(int)a2;
        System.out.println(a3);

        //int + long = (long)int + long = long
        int b1 = 1;
        long b2 = 2;
        //int b3 = b1+b2; //error
        long b3 = (long)b1+b2;
        System.out.println(b3);

        //오버플로우(overflow)
        int c1 = 2147483647; //2^31-1 //Integer.MAX_VALUE;
        int c2 = c1+1; //오버플러우 발생
        int c3 = Integer.MAX_VALUE;
        System.out.println(c2); //-2147483648
        System.out.println(c3+1); //-2147483648

        //실수형의 정확도
        float f1 = 2.0f;
        float f2 = 1.1f;
        float f3 = f1 - f2;
        double d1 = 2.0;
        double d2 = 1.1;
        double d3 = d1 - d2;

        System.out.println(f3);
        System.out.println(d3);

        //문제해결1
        //원초적으로 해결하는 방법
        int i1 = (int)(d1*10);
        int i2 = (int)(d2*10);
        double i3 = (i1-i2) / 10.0;
        System.out.println(i3);

        //문제해결2
        //BigDecimal API 사용
        BigDecimal bd1 = new BigDecimal("2.0");
        BigDecimal bd2 = new BigDecimal("1.1");
        System.out.println(bd1.subtract(bd2));

        //Infinity 와 NaN
        //int i = 1 / 0; //ArithmeticException error
        //int j = 1 % 0; //ArithmeticException error

        try {
            int i = 1 / 0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException error");
            //e.printStackTrace();
        }


        //실수를 이용하면 에러 발생 안함 (심각한 문제)
        double dd1 = 1 / 0.0;  //Infinity
        double dd2 = 1 % 0.0;  //NaN

        double dd3 = dd1 + 100;  //Infinity
        double dd4 = dd2 + 100;  //NaN

        if(Double.isInfinite(dd1) || Double.isInfinite(dd2)){
            System.out.println("isInfinite error");
        }
        if(Double.isNaN(dd3) || Double.isNaN(dd4)){
            System.out.println("isNaN error");
        }

        //double 타입과 float 타입의 0.1
        double d4 = 0.1; //4byte
        float f4 = 0.1f; //3byte
        System.out.println("d4: "+d4+", f4: "+f4);
        System.out.println(d4 == f4); //false (float 타입의 0.1이 double 변환되는 과정에 근사값으로 표현되어 0.1000...0149011...
        System.out.println("d4 *10: "+(int)(d4*10) +" , f4 *10: "+ (int)(f4*10));
        System.out.println((float) d4 == f4); //true

        // 논리연산자
        // & AND operator.연산자 T & F  = F
        // | OR operator.연산자 T & F = T
        // ! NOT operator.연산자  ! T = F, !F = T
        // ^ XOR operator.연산자  T ^ F = T, T ^ T = F, F ^ F = F
        // &&, || 숏 서킷 operator.연산자 : 불필요한 연산자를 줄여서 프로그램의 성능을 좋게함

        // 증감 operator.연산자
        // //++, --
        // ++n, --n 전위연산자
        // n++, n-- 후위 operator.연산자
        int p = 1;
        System.out.println(p++); //1
        System.out.println(++p); //3
        System.out.println(p); //3
        System.out.println(--p); //2
        System.out.println(p--); //2
        System.out.println(p); //1


        // 삼항 operator.연산자
        // 평가식 ? <표현식1> : <표현식2>
        // TRUE 일때 표현식1, FALSE 일때 표현식2 수행
        String result = p<1 ? "true" : "false";
        System.out.println(result);

        // 비트연산자
        // & AND operator.연산자
        // | OR operator.연산자
        // ~ NOT operator.연산자
        // ^ XOR operator.연산자

        int ii1 = 3;
        int ii2 = 5;
        System.out.printf("%32s\n", Integer.toBinaryString(ii1)); //11 (3)
        System.out.printf("%32s\n", Integer.toBinaryString(ii2)); //101 (5)
        System.out.printf("%32s\n", Integer.toBinaryString(ii1 & ii2)); //1 (1)
        System.out.printf("%32s\n", Integer.toBinaryString(ii1 | ii2)); //111 (7)
        System.out.printf("%32s\n", Integer.toBinaryString(ii1 ^ ii2)); //110 (6)
        System.out.printf("%32s\n", Integer.toBinaryString(~ii1)); //11111111111111111111111111111100

        //  이동 비트 operator.연산자
        // << 오른쪽으로 피연산자만큼 이동시키고 빈자리는 0으로 채움
        // >> 오른쪽으로 피연산자만큼 이동시키고 빈자리는 부호 비트로 채움
        // >>>  >>와 이동은 동일, 빈자리를 0으로 채움
        int ii3 = 0b1000; //8
        System.out.printf("%32s\n", Integer.toBinaryString(ii3 << 1)); //10000 (32)
        System.out.printf("%32s\n", Integer.toBinaryString(ii3 >> 1)); //100 (8)
        System.out.printf("%32s\n", Integer.toBinaryString(ii3 >>> 1)); //100 (8)

        int ii4 = -100;
        System.out.printf("%32s\n", Integer.toBinaryString(ii4));          //11111111111111111111111110011100 (-100)
        System.out.println(ii4 << 1);
        System.out.printf("%32s\n", Integer.toBinaryString(ii4 << 1));  //11111111111111111111111100111000 (-200) 1개 0 생성
        System.out.println(ii4 >> 1);
        System.out.printf("%32s\n", Integer.toBinaryString(ii4 >> 1));  //11111111111111111111111111001110 (-50)
        System.out.println(ii4 >>> 1);
        System.out.printf("%32s\n", Integer.toBinaryString(ii4 >>> 1)); //1111111111111111111111111001110 (2147483598)

    }
}
