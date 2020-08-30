public class int에서2_8_16진수변환 {
    public static void main(String[] main){
        int a = 10;

        String bin = Integer.toBinaryString(a);
        String oct = Integer.toOctalString(a);
        String hex = Integer.toHexString(a);

        System.out.println("int -> 문자열 이진수 : " + bin);
        System.out.println("int -> 문자열 8진수  : " + oct);
        System.out.println("int -> 문자열 16진수 : " + hex);
        System.out.println();

        System.out.println("문자열 이진수 -> int : " + Integer.valueOf(bin, 2));
        System.out.println("문자열 8진수  -> int : " + Integer.valueOf(oct, 8));
        System.out.println("문자열 16진수 -> int : " + Integer.valueOf(hex, 16));
        System.out.println();

        int binLiteral = 0b1010; //2진수 리터럴 (자바7버전 부터 지원)
        int octLiteral = 012; //8진수 리터럴
        int hexLiteral = 0xa; //16진수 리터럴

        System.out.println("binLiteral:" +binLiteral); //10, 10진수로 출력
        System.out.println("octLiteral:" +octLiteral); //10, 10진수로 출력
        System.out.println("hexLiteral:" +hexLiteral); //10, 10진수로 출력

    }
}
