import java.io.*;
import java.lang.*;

public class StudentManage{
     public static void main(String[] args){
        Student[] info = new Student[5];
        try{

        //オブジェクトの作成と値の代入
        info[0] = new Student();
        info[0].name = "飯田天哉";
        info[0].number = 1;
        info[0].average = 93.3;

        info[1] = new Student();
        info[1].name = "芦戸三奈";
        info[1].number = 2;
        info[1].average = 70.4;

        info[2] = new Student();
        info[2].name = "緑谷出久";
        info[2].number = 3;
        info[2].average = 90.8;

        info[3] = new Student();
        info[3].name = "切島鋭児郎";
        info[3].number = 4;
        info[3].average = 65.8;

        info[4] = new Student();
        info[4].name = "八百万百";
        info[4].number = 5;
        info[4].average = 94.8;

        //出力
        System.out.println("出席番号 名前 平均点");

        System.out.println(info[0].number + " " + info[0].name + " " + info[0].average);
        System.out.println(info[1].number + " " + info[1].name + " " + info[1].average);
        System.out.println(info[2].number + " " + info[2].name + " " + info[2].average);
        System.out.println(info[3].number + " " + info[3].name + " " + info[3].average);
        System.out.println(info[4].number + " " + info[4].name + " " + info[4].average);
        }catch(NullPointerException e){
            System.out.println("オブジェクトが作成されていません");
        }
     }
}