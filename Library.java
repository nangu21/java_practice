import java.io.*;
import java.lang.*;

public class Library{
     public static void main(String[] args){
        Book entry[] = new Book[100];

        entry[0]= new Book();
        entry[0].title= "蟹工船";
        entry[0].author= "小林多喜二";

        Magazine mag= new Magazine();
        mag.title= "今週の文豪";
        mag.volume= 3;
        mag.number= 12;
        entry[1]= mag;

        entry[2]= new Book();
        entry[2].title= "山月記";
        entry[2].author= "中島敦";

        entry[3]= new Book();
        entry[3].title= "墨汁一滴";
        entry[3].author= "正岡子規";

        entry[4]= new Book();
        entry[4].title= "金色夜叉";
        entry[4].author= "尾崎紅葉";

        Magazine mag2= new Magazine();
        mag2.title= "新世界";
        mag2.volume= 121;
        mag2.number= 67;
        entry[5]= mag2;

        for(int i=0; i<5; i++){
            System.out.println(entry[i].getTitle());
        }
     }
}