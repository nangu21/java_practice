import java.io.*;
import java.lang.*;

public class productManage{
     public static void main(String[] args){
        Product[] info= new Product[5];

        info[0]= new Product();
        info[0].name= "リンゴ";
        info[0].price= 75;

        info[1]= new Product();
        info[1].name= "みかん";
        info[1].price= 50;

        info[2]= new Product();
        info[2].name= "キウイ";
        info[2].price= 60;

        info[3]= new Product();
        info[3].name= "ブドウ";
        info[3].price= 160;

        info[4]= new Product();
        info[4].name= "マンゴー";
        info[4].price= 1000;

        Product pri= new Product();
        int amount= pri.calcSales(20,55,30,10,10);


        System.out.print(info[0].price + "円の" + info[0].name + "が20個、");
        System.out.print(info[1].price + "円の" + info[1].name + "が55個、");
        System.out.print(info[2].price + "円の" + info[2].name + "が30個、");
        System.out.print(info[3].price + "円の" + info[3].name + "が10個、");
        System.out.println(info[4].price + "円の" + info[4].name + "が10個売れました。");
        System.out.println("本日の売り上げは" + amount + "円です。");
     }
}

