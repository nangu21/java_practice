import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class productManage_ArrayList{
     public static void main(String[] args){
      ArrayList<Product_ArrayList> productList= new ArrayList<Product_ArrayList>();
      ArrayList<String> name= new ArrayList<String>();
      ArrayList<Integer> price= new ArrayList<Integer>();

      try{
      Product_ArrayList info= new Product_ArrayList();
      productList.add(info);

      name.add("リンゴ");
      name.add("みかん");
      name.add("キウイ");
      name.add("ブドウ");
      name.add("マンゴー");

      price.add(75);
      price.add(50);
      price.add(60);
      price.add(160);
      price.add(1000);

      
      Product_ArrayList pri= new Product_ArrayList();
      int amount= pri.calcSales(20,55,30,10,10);


        System.out.print(price.get(0) + "円の" + name.get(0) + "が20個、");
        System.out.print(price.get(1) + "円の" + name.get(1) + "が55個、");
        System.out.print(price.get(2) + "円の" + name.get(2) + "が30個、");
        System.out.print(price.get(3) + "円の" + name.get(3) + "が10個、");
        System.out.println(price.get(4) + "円の" + name.get(4) + "が10個売れました。");
        System.out.println("本日の売り上げは" + amount + "円です。");
      }catch(NullPointerException e){
         System.out.println("オブジェクトが作成されていません");
      }
     }
}

