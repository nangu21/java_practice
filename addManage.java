import java.io.*;
import java.lang.*;

public class addManage{
     public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("10個の数の和を計算します。");

            //配列を作成
            String[] arr= new String[10];
            
            //値を配列に格納
            for(int i=0; i<10; i++){
                System.out.println((i+1) + "番目の数を入力しReturnキーを押してください。");
                arr[i] = br.readLine();
            }

            //配列を引数に代入、メソッドを呼び出す
            Addition result= new Addition();
            System.out.println(result.addNum(arr));


        }catch(IOException e){
            System.out.println("標準入力において例外が発生しました。");
        }catch(NullPointerException e){
            System.out.println("オブジェクトが作成されませんでした。");
        }
     }
}
