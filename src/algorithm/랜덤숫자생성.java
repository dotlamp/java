package algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 랜덤숫자생성 {
    public static int[] random(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("생성할 숫자를 입력하세요 : ");
        //int n = sc.nextInt();
        int n = 10;
        int rn[] = new int[n];
            for(int i=0; i<n; i++){
            int temp = (rd.nextInt(n)+1);
            rn[i] = temp;
            for(int j=0; j<i; j++){
                if(rn[j] == temp){
                    i--;
                    break;
                }
            }
        }
        System.out.println("랜덤숫자 : " + Arrays.toString(rn));
        System.out.println("배열길이 : " + rn.length);
        System.out.println();

        return rn;
    }
}
