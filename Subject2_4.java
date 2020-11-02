import java.io.*;
import java.lang.*;

import javax.annotation.processing.FilerException;

public class Subject2_4{
     public static void main(String[] args){
        try {
            String str, first, third;
            //金額に当たるthirdはint型に変換する
            int m, n, price, sum1 = 0, sum2 = 0, sum3 = 0;

            //ファイルの読み込み開始
            FileReader fr = new FileReader("Shopping-utf8.txt");
            BufferedReader br = new BufferedReader(fr);

            while(br.ready()){
                //１行ずつ読み込む
                str = br.readLine();
                m = str.indexOf(",");
                n = str.indexOf(":");
                first = str.substring(0, m);
                third = str.substring(n + 1);
                price = Integer.parseInt(third);

                //文字列の比較
                if(first.equals("1日")){
                    sum1 += price;
                }else if(first.equals("2日")){
                    sum2 += price;
                }else if(first.equals("3日")){
                    sum3 += price;
                }

            }

            br.close();
            fr.close();

            //ファイルの書き込み開始
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("1日目の合計支出金額は " + sum1 + " 円、");
            pw.println("2日目の合計支出金額は " + sum2 + " 円、");
            pw.println("3日目の合計支出金額は " + sum3 + " 円です。");

            pw.close();
            bw.close();
            fw.close();

            System.out.println("output.txtへ書き込みが完了しました。");

            
        }catch(IOException e){
            System.out.println("ファイルが存在しないか、権限がありません。");
        }
     }
}
