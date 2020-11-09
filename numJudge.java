import java.io.*;
import java.lang.*;

//処理クラス
//数をひとつ入力する
//数の情報クラスのメソッドを使い、入力された数が偶数か奇数かを判定する
public class numJudge{
     public static void main(String[] args){
        try{
        Number result= new Number();
        int input;

        try {
            System.out.println("偶奇判定を行います。数字を入力して「Return」キーを押してください。");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                input= Integer.parseInt(br.readLine());
            } catch(NumberFormatException e){
                System.out.println("入力された文字列は数字に変換できません。再度入力してください。");
                input= Integer.parseInt(br.readLine());
            }
            
        
        System.out.println(result.sortNum(input));

        } catch (IOException e) {
            System.out.println("標準入力において例外が発生しました");
        }
        }catch(NullPointerException e){
            System.out.println("オブジェクトが作成されていません");
        }
     }
}