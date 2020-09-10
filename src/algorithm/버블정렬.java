package algorithm;

public class 버블정렬 {
    /*
    * 정렬 방법론
    * 1. N번째 위치와 N+1번째 위치의 값을 비교해서서, N+1번째 위치의 값이 더 클 경우 N번째와 N+1번째의 값을 교환함
    *
    * 특징
    * 1. 계속 비교하므로 리스트 크기가 크면 불리함
    * 2. 정렬이 거의 된 데이터일 경우 더 유리함
    * 3. 데이터가 역순인 경우, 즉 최악의 경우 시간이 엄청 느림
    * */

    public int[] sort_오름차순(int[] arr){
        int temp;

        for(int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] sort_내림차순(int[] arr){
        int temp;

        for(int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
