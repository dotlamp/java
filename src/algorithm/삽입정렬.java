package algorithm;

public class 삽입정렬 {
    /*
    * 정렬 방법론
    * 1. 0번째는 값이 맞는지 키값으로 사용하기 위해 -1처럼 가장 작은 값으로 둔다
    * 2. ~1번째까지와 2번째를 비교해서 2번째 원소가 들어갈 자리를 ~1번까지 중 만든다음 2번째 원소를 집어 넣는다.
    * 3. ~2번째까지와 3번째를 비교해서 ...
    * 4. 끝까지 간다.
    *
    * 특징
    * 1. 게속 비교하므로 리스트 크기가 크면 불리함(버블과 비슷)
    * 2. 정렬이 거의 된 데이터일 경우 유리, 교환이 적게 일어나므로(버블과 비슷)
    * 3. 데이터가 역순인 경우, 즉 최악의 경우에 시간이 엄청 느림(버블과 비슷)
    * 4. 버블정렬과 다른점은 버블정렬은 n번째와 n+1번째만 비교해서 자리를 바꾸지만
    * 삽입정렬은 n+1번째의 데이터를 0~n번째까지 중 어디에 들어가야할지 자리를 찾아 정렬된다.
    * */

    public int[] sort_오름차순(int[] arr){
        int temp;
        for(int i=0; i<arr.length; i++){
            for (int j=i; j>0; j--){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] sort_내림차순(int[] arr){
        int temp;
        for(int i=0; i<arr.length; i++){
            for (int j=i; j>0; j--){
                if(arr[j-1] < arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
