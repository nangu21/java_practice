import java.io.*;
import java.lang.*;

public class StudentManage{
     public static void main(String[] args){
        try{
        Student[] info = new Student[4];
        double[] result= new double[4];
        int i=0;

        info[0]= new Student();
        info[0].name="芦戸三奈";
        info[0].id=1;
        result[0]= info[0].calcAverage(60,55,38,100,30);

        info[1]= new Student();
        info[1].name="飯田天哉";
        info[1].id=2;
        result[1]= info[1].calcAverage(92,84,92,85,94);

        info[2]= new Student();
        info[2].name="切島鋭児郎";
        info[2].id= 3;
        result[2]= info[2].calcAverage(50,60,45,60,62);

        info[3]= new Student();
        info[3].name= "緑谷出久";
        info[3].id= 4;
        result[3]= info[3].calcAverage(82,85,84,85,80);
        
        System.out.println("【平均点】");
        for(i=0; i<=3; i++){
            System.out.println(info[i].name + ": " + result[i]);
        }

        }catch(NullPointerException e){
            System.out.println("オブジェクトが作成されていません");
        }
     }
}