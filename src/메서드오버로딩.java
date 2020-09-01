public class 메서드오버로딩 {
    /*
    * 메서드 오버로딩 : 동일한 기능을 수행, 많은 로직이 겹치게 됨 -> 코드의 재사용하기 위함
    * 메서드명은 같으나 파라미터 타입, 개수가 다름
    * 파라미터 이름 int add(int x, int y) , 리턴타입만 다른 것은 의미 없음 long add(int a, int b) return a+b;
    * 파라미터 순서가 달라도 의미 없음 long add(int a, long b)  / long add(long a, int b)
    * */
    int add(int a, int b){
        return a+b;
    }
    double add(double x, double y){
        return x+y;
    }
    int add(byte a, byte b){
        return a+b;
    }
}
