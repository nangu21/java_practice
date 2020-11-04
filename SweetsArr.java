import java.io.*;
import java.lang.*;

public class SweetsArr{
     public static void main(String[] args){
        Sweets[] info= new Sweets[5];
        try{
            int i;
            for(i = 0; i<5; i+=1){
                info[i]= new Sweets();
            }

            info[0].name="うまい棒";
            info[0].price=9;

            info[1].name="チョコボール";
            info[1].price=68;

            info[2].name="エアリアル";
            info[2].price=190;

            info[3].name="パイの実";
            info[3].price=150;

            info[4].name="ドライフルーツミックス";
            info[4].price=350;

        //標準入力
            String input;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("お菓子の値段を表示します。銘柄を入力してください。");
            input = br.readLine();
             //入力とinfoの名前が一致したら値段を表示
             for(i=0; i<5; i += 1){
                if(input.equals(info[i].name)){
                    System.out.println(info[i].price + "円");
                }
            }

            if(input == ""){
                System.out.println("文字を入力してください");
                input = br.readLine();
            }

        }catch(NullPointerException e){
            System.out.println("オブジェクトが作成されていません");
        }catch(IOException e){
            System.out.println("標準入力において例外が発生しました");
        }
     }
}