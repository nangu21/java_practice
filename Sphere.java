import java.io.*;
import java.lang.*;
import java.util.*;

public class Sphere{  //球体の体積を計算する
     public static void main(String[] args){
        //標準入力値を変数r(半径)に格納
        Scanner sc = new Scanner(System.in);
        System.out.println("r= ");
        double r = sc.nextDouble();

        //球体の体積を計算(Mathクラス)
        //フィールド定数PI
        //powメソッド(引数１を引数２で累乗)
        double vol = 4*(Math.PI * Math.pow(r, 3))/3;
        System.out.println("Voulume of sphere = " + vol);
     }
}
