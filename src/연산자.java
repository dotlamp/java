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
    }
}
