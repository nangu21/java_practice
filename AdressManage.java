import java.io.*;
import java.lang.*;

public class AdressManage{
     public static void main(String[] args){
        int i=0;
        String input;
        Manage info[] = new Manage[3];
        //オブジェクト作成の例外捕捉
        try {
            info[0] = new Manage();
            info[0].name= "緑谷出久";
            info[0].adress= "deku@heroacademy.jp";

            info[1] = new Manage();
            info[1].name= "飯田天哉";
            info[1].adress= "idaten@heroacademy.jp";

            info[2] = new Manage();
            info[2].name = "八百万百";
            info[2].adress= "yaomomo@heroacademy.jp";

            //標準入力
            try {
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("メールアドレスを表示します。名前を入力し「Return」キーを押してください");
                input = br.readLine();

                //入力とinfoの名前が一致したらアドレスを表示
                for(i=0; i<3; i += 1){
                    if(input.equals(info[i].name)){
                        System.out.println(info[i].adress);
                    }
                }

            } catch (IOException e) {
                System.out.println("標準入力において例外が発生しました");
            }
            
        } catch (NullPointerException e) {
            System.out.println("オブジェクトが作成されていません");
        }
     }
}