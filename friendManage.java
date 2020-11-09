import java.io.*;
import java.lang.*;

public class friendManage{
     public static void main(String[] args){
        String input;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("名前を入力し、Returnキーを押してください。");
            //標準入力（メソッドの引数になる）
            input = br.readLine();

            //1つ目のクラスのオブジェクトを作成
            Friend info= new Friend();
            //友達の名前を設定
            info.name= "竈門炭治郎";
            //1つ目のクラスのメソッドを呼び出し
            info.setName(input);

        }catch(IOException e){
            System.out.println("標準入力において例外が発生しました。");
        }
        catch (NullPointerException e) {
            System.out.println("オブジェクトが作成されていません。");
        }
     }
}
