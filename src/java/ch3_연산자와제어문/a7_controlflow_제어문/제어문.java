package ch3_연산자와제어문.a7_controlflow_제어문;

import java.util.Scanner;

public class 제어문 {
    public static void main(String[] args){

        //controlflow.제어문 : 프로그램의 흐름을 제어하기 위함, 조건문과 반복문으로 나눔
        //if문

        //switch ~ case문
        //switch(조건문){
        //case 값1 : do somthing..; break;
        //case 값... :
        //default : //조건에 일치하는 값이 없을 때
        //}

        //for문

        //while문
        //do ~ while문 (한번 실행하고 나서 반복할지 결정)
        Scanner sc = new Scanner(System.in);
        int i=0;
        do{
           i = sc.nextInt();
            System.out.println(i+"의 제곱근은 : "+ Math.sqrt(i));
        }while (i>0);
        sc.close();
    }
}
