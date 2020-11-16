import java.io.*;
import java.lang.*;

public class Subject3_1_2{
     public static void main(String[] args){
        //パン情報のオブジェクト作成
        try{
        Subject3_1_1 info[]= new Subject3_1_1[5];

        info[0]= new Subject3_1_1();
        info[0].rank= 1;
        info[0].name= "エビカツサンド";
        info[0].price= 360;

        info[1]= new Subject3_1_1();
        info[1].rank= 2;
        info[1].name= "クロワッサン";
        info[1].price= 140;

        info[2]= new Subject3_1_1();
        info[2].rank= 3;
        info[2].name= "塩パン";
        info[2].price= 120;

        info[3]= new Subject3_1_1();
        info[3].rank= 4;
        info[3].name= "クリームパン";
        info[3].price= 240;

        info[4]= new Subject3_1_1();
        info[4].rank= 5;
        info[4].name= "メロンパン";
        info[4].price= 150;


        //標準入力
        try {
            //入力された順位を格納
            int num;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("売り上げ何位のパンが知りたいですか？1~5位までの順位を入力しReturnキーを押してください。");
            
            //入力された文字列が数値に変換できない場合は再度入力
            try{
                num= Integer.parseInt(br.readLine());
            }catch(NumberFormatException e){
                System.out.println("数値を入力してください。");
                num= Integer.parseInt(br.readLine());
            }

        //パン情報の出力
        //標準入力と順位が一致したら表示
        for(int i=0; i<5; i++){
            if(num == info[i].rank){
                System.out.println(num + "位のパンは: " + info[i].name + "" + info[i].price + "円");
            }
        }

        }catch(IOException e){
            System.out.println("標準入力において例外が発生しました。");
        }
     }catch(NullPointerException e){
         System.out.println("オブジェクトが作成されていません。");
     }
    }
}
