package algorithm;

import java.util.Arrays;

public class 정렬메인 {
    public static void main(String[] args){
        랜덤숫자생성 rn = new 랜덤숫자생성();
        int[] number = new int[100];
        number = rn.random();


        선택정렬 select = new 선택정렬();
        select.sort_오름차순(number);
        System.out.println(Arrays.toString(number));
        select.sort_내림차순(number);
        System.out.println(Arrays.toString(number));

        System.out.println();

        버블정렬 bubble = new 버블정렬();
        bubble.sort_오름차순(number);
        System.out.println(Arrays.toString(number));
        bubble.sort_내림차순(number);
        System.out.println(Arrays.toString(number));

        System.out.println();

        삽입정렬 insert = new 삽입정렬();
        insert.sort_오름차순(number);
        System.out.println(Arrays.toString(number));
        insert.sort_내림차순(number);
        System.out.println(Arrays.toString(number));
    }
}
