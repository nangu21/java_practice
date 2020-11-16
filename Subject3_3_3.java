import java.io.*;
import java.lang.*;

public class Subject3_3_3{
     public static void main(String[] args){
        //オブジェクト作成
        try{
        Subject3_3_1 train[]= new Subject3_3_1[5];

        train[0]= new Subject3_3_1();
        train[0].terminal= "静岡";
        train[0].kind= "自由席";
        train[0].fare= 5940;

        Subject3_3_2 info= new Subject3_3_2();
        info.terminal= "京都";
        info.kind= "指定席";
        info.reserved= 13850;
        train[1]= info;

        train[2]= new Subject3_3_1();
        train[2].terminal= "新大阪";
        train[2].kind= "自由席";
        train[2].fare= 13870;

        Subject3_3_2 info2= new Subject3_3_2();
        info2.terminal= "広島";
        info2.kind= "指定席";
        info2.reserved= 19440;
        train[3]= info2;

        train[4]= new Subject3_3_1();
        train[4].terminal= "博多";
        train[4].kind= "自由席";
        train[4].fare= 22220;


        //標準出力
        for(int i=0; i<5; i++){
            System.out.println(train[i].displayResult());
            System.out.println("運賃: " + train[i].displayFare());
        }

        }catch(NullPointerException e){
            System.out.println("オブジェクトが作成されていません。");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("配列要素の個数が正しくありません。");
        }
     }
}
