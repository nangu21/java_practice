import java.io.*;
import java.lang.*;

public class Subject2_1{
     public static void main(String[] args){
        try{
        //変数：標準入力された数(繰り返し回数)、計算結果、i
        int num, i;
        long result = 1;
        //標準入力
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1から入力された数までの積を求めます。数を入力し「Return」キーを押してください。ただし、入力する数字は20以下とします。");

        //num数値に変換できなかったら例外処理
        try{
            num = Integer.parseInt(br.readLine());
        }catch(NumberFormatException e){
            System.out.println("入力された文字列は数に変換できません。入力しなおしてください。");
            num = Integer.parseInt(br.readLine());
        }

        //20より大きい数が入力された場合、やり直し(結果がマイナスになる)
        if(num > 20){
            while(num > 20){
            System.out.println("積が大きくなりすぎます。20以下の数字を入力してください。");
            num = Integer.parseInt(br.readLine());
            }
        }

        //繰り返し処理
        for(i=1; i <= num; i++){
            result *= i;
        }

        //計算結果表示
        System.out.println("計算結果： " + result);

        }catch(IOException e){
            System.out.println("標準入力において例外が発生しました。");
        }
     }
}