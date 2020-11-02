import java.io.*;
import java.lang.*;

public class Subject2_2{
     public static void main(String[] args){
        try{
            //標準入力で入力された数(順位)
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int rank = 0;
            //配列にランキング内容を格納(商品名、値段)
            String name[] = {"空気清浄機", "加湿器", "ヒーター", "こたつ", "掃除機"};
            int price[] = {16380, 10800, 6980, 9999,13900};

            try {
                System.out.println("売り上げランキング何位の商品が知りたいですか？1~5までの数を入力し「Return」キーを押してください。");
                rank = Integer.parseInt(br.readLine());
            }catch(NumberFormatException e){
                System.out.println("入力された文字列は数値に変換できません。入力しなおしてください。");
                rank = Integer.parseInt(br.readLine());
            }

            System.out.println("売り上げ" + rank + "位の商品の名前は" + name[rank - 1] + "、" + "値段は" + String.format("%,d" , price[rank - 1])+ "円です。");

        }catch(IOException e){
            System.out.println("標準入力において例外が発生しました。");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("1から5までの数を入力してください。");
        }
     }
}