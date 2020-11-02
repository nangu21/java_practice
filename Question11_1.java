import java.io.*;
import java.lang.*;

public class Question11_1{
     public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //変数：２つの数と結果
        int num1, num2, result;

        try{
        //標準入力ひとつめの数
        System.out.println("２つの数を計算します。ひとつ目の数を入力して「Return」キーを押してください");

        try{
            num1 = Integer.parseInt(br.readLine());
        }catch(NumberFormatException e){
            System.out.println("入力された文字列は数値に変換できません。入力しなおしてください。");
            num1 = Integer.parseInt(br.readLine());
        }

        //標準入力ふたつ目の数
        System.out.println("ふたつ目の数を入力して「Return」キーを押してください");
        try{
            num2 = Integer.parseInt(br.readLine());
        }catch(NumberFormatException e){
            System.out.println("入力された文字列は数値に変換できません。入力しなおしてください。");
            num2 = Integer.parseInt(br.readLine());
        }
        
        //計算結果
        result = num1 * num2;
        System.out.println("計算結果： " + result);


        }catch(IOException e){
            System.out.println("標準入力において例外が発生しました。");
        }
     }
}