import java.io.*;
import java.lang.*;

public class Calculate_2{
     public static void main(String[] args){
        try{
        int num1, num2;
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("2つの数を掛け算します。1つ目の値を入力してReturnキーを押してください。");
             try {
                 num1= Integer.parseInt(br.readLine());
             } catch (NumberFormatException e) {
                 System.out.println("数値を入力してください。");
                 num1= Integer.parseInt(br.readLine());
             }

             System.out.println("2つ目の値を入力してReturnキーを押してください。");
             try {
                 num2= Integer.parseInt(br.readLine());
             } catch (NumberFormatException e) {
                 System.out.println("数値を入力してください。");
                 num2= Integer.parseInt(br.readLine());
             }

             //NumberContentsオブジェクト
             NumberContents_2 result= new NumberContents_2();
             result.firstNumber = num1;
             result.secondNumber = num2;

             System.out.println("1つ目のクラス： " + result.calculate());

             //ExtendNumberContentsオブジェクト
             ExtendNumberContents_2 result2= new ExtendNumberContents_2();
             result2.firstNumber = num1;
             result2.secondNumber = num2;

             System.out.println("2つ目のクラス： " + result2.calculate());
            

            } catch (IOException e) {
             System.out.println("標準入力において例外が発生しました。");
         }
}
}
