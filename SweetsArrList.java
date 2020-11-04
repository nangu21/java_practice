import java.io.*;
import java.lang.*;
import java.util.ArrayList;


public class SweetsArrList{
     public static void main(String[] args){
        ArrayList<Sweets> sweet = new ArrayList<Sweets>();
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> price = new ArrayList<Integer>();

        try{
        //オブジェクトの作成 ??
            Sweets info = new Sweets();
            sweet.add(info);

            //info.add(name);
            //info.add(price);
            //コンパイルエラー

            name.add("うまい棒");
            name.add("チョコボール");
            name.add("エアリアル");
            name.add("パイの実");
            name.add("ドライフルーツミックス");

            
            price.add(9);
            price.add(68);
            price.add(190);
            price.add(150);
            price.add(350);


        //標準入力
            String input;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("お菓子の値段を表示します。銘柄を入力してください。");
            input = br.readLine();

        //入力とinfoの名前が一致したら値段を表示
            int i=0;
             for(String okashi: name){
                if(input.equals(name.get(i)))
                    System.out.println(price.get(i) + "円");
                    i += 1;
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