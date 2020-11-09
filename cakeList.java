import java.io.*;
import java.lang.*;

public class cakeList{
     public static void main(String[] args){
        Cake info;
        try{
        info= new Cake("ショートケーキ", 120);

        System.out.println(info.name + ": " + info.price);
        }catch(NullPointerException e){
            System.out.println("オブジェクトが作成されていません");
        }
     }
}
