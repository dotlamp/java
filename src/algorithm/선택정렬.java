package algorithm;

import java.util.Arrays;
import java.util.Random;

public class 선택정렬 {
    /*
    * 정렬 방법론
    * 1. 최소값을 찾아서 0번째 위치와 바꿈
    * 2. 0번째 위치를 제외한 최소값을 찾아서 1번째 위치와 바꿈
    * 3. N번째까지의 위치를 제외한 최소값을 찾아서 N번째와 바꿈
    * 4. 끝까지 가면 성공
    *
    * 특징
    * 1. 정렬되있는 순서로 들어오던 아니던 실행시간이 비슷, 항상 비교하는 양이 동일
    * 2. 추가적인 기억장소를 요구하지 않음
    * */

    public int[] sort_오름차순(int[] arr){
        int min;
        int temp;

        for(int i=0; i<arr.length-1; i++){
            min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public int[] sort_내림차순(int[] arr){
        int max;
        int temp;

        for(int i=0; i<arr.length; i++){
            max = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
