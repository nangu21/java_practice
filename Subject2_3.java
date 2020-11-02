import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Subject2_3{
     public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //標準入力で入力された数(予想)、配列ないの個数合計、乱数
        int i, input, sum = 0, random = 0;

        //ArrayListに値を登録(10000個)
        for(i=0; i<=10000; i++){
            random = (int)(Math.random() * 100) + 1;
            numbers.add(random);
        }

        //標準入力
        try{
            System.out.println("ArrayListに登録されている1~100までの数を予想し入力してください。");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try{
                input = Integer.parseInt(br.readLine());
            }catch(NumberFormatException e){
                System.out.println("入力された文字列は数値に変換できません。入力しなおしてください。");
                input = Integer.parseInt(br.readLine());
            }
        
        //予想された数がArrayListにいくつ入っているか出力
        //要素をoutputで取り出して比較
        for(int output : numbers){
            if(input == output){
                sum += 1;
            }
        }

        System.out.println("予想された数は、ArrayListに" + sum + "個入っています。");

        }catch(IOException e){
            System.out.println("標準入力において例外が発生しました。");
        }
     }
}
