import java.io.*;
import java.lang.*;

public class Subject3_2_2{
     public static void main(String[] args){
        //現在のポイント数を設定(1000ポイント)
        Subject3_2_1 current= new Subject3_2_1();
        current.point= 1000;

        //標準入力から商品の金額を入力
        //値段を変数に格納
        int pri;

        //入力された文字列が数値に変換できない場合は再度入力
        try{
            System.out.println("現在のポイント数を計算します。商品の金額を入力しReturnキーを押してください。");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try{
                pri= Integer.parseInt(br.readLine());
            }catch(NumberFormatException e){
                System.out.println("数値を入力してください。");
                pri= Integer.parseInt(br.readLine());
            }

        //結果出力
        System.out.println("現在のポイント: " + current.calculate(pri));

    }catch(IOException e){
        System.out.println("標準入力において例外が発生しました。");
    }
  }
}