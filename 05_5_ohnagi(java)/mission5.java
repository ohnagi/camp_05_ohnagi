package com.company;

import sun.lwawt.macosx.CInputMethod;

import java.util.Scanner;

public class mission5 {
    public static void main(String[] args) {
        String[] favorites ={"ハンバーグ","オムライス","ナポリタン","寿司","パン"};
        for(int i=0;i<5;i++){
        System.out.println("Q"+i+"."+favorites[i]+"が好きか");

        String[] alt = {"1:嫌い ","2:どちらかと言えば嫌い ","3:普通 ","4:どちらかと言えば好き ","5:好き"+"\n"};
        for(int j=0;j<5;j++){
        System.out.print(alt[j]);}}

        Scanner scanner = new Scanner(System.in);

        System.out.println("Q0の回答");
        int res0 = scanner.nextInt();

        System.out.println("Q1の回答");
        int res1 = scanner.nextInt();

        System.out.println("Q2の回答");
        int res2 = scanner.nextInt();

        System.out.println("Q3の回答");
        int res3 = scanner.nextInt();

        System.out.println("Q4の回答");
        int res4 = scanner.nextInt();

        System.out.println("食の相性度");
        int sum = (res0+res1+res2+res3+res4);
        System.out.println(sum+"/25");

        if(sum<=15){
            System.out.println("他の話をしましょう");
        }else if (15<sum){
            System.out.println("おいしい店を知っているので、一緒に行きませんか?");
        }
    }
}
