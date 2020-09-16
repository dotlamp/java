package algorithm.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 아스키코드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        //System.out.println((int)str.charAt(0));

        int arr[] = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            //System.out.println((int)str.charAt(i));
            arr[i] = (int)str.charAt(i); //문자 -> 아스키코드
        }
        System.out.println(Arrays.toString(arr)); //배열 출력

        for (int i=0; i<arr.length; i++){
            System.out.print((char)arr[i]); //아스키코드 -> 문자
        }
    }
}
