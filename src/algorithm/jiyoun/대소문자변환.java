package algorithm.jiyoun;

public class 대소문자변환 {

    String new_id = "";

    public String id(String id){
        char tmp;
        for(int i=0; i<id.length(); i++){
            tmp = id.charAt(i);
            if( (65 <= tmp) && (tmp <= 90)){ //대문자
                this.new_id += id.valueOf(tmp).toLowerCase();
            }else if( (97 <= tmp) && (tmp <= 122)){ //소문자
                this.new_id += id.valueOf(tmp).toUpperCase();
            }else{ //그외
                this.new_id += (char)tmp;
            }
        }
        return new_id;
    }

    public static void main(String[] args) {
        대소문자변환 Aa1 = new 대소문자변환();
        대소문자변환 Aa2 = new 대소문자변환();
        System.out.println(Aa1.id("AAA"));
        System.out.println(Aa2.id("aaa"));

    }
}
