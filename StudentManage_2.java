import java.io.*;
import java.lang.*;


public class StudentManage_2{
     public static void main(String[] args){
        Student_2[] score = new Student_2[5];
        try {
           int i;
           for(i=0; i<5; i += 1){
               score[i] = new Student_2();
           } 

           score[0].name="緑谷出久";
           score[0].number=1;
           score[0].english=75;
           score[0].japanese=90;
           score[0].math=89;
           score[0].science=92;
           score[0].society=85;

           score[1].name="飯田天哉";
           score[1].number=2;
           score[1].english=80;
           score[1].japanese=88;
           score[1].math=92;
           score[1].science=90;
           score[1].society=90;

           score[2].name="芦戸三奈";
           score[2].number=3;
           score[2].english=95;
           score[2].japanese=75;
           score[2].math=90;
           score[2].science=100;
           score[2].society=50;

           score[3].name="切島鋭児郎";
           score[3].number=4;
           score[3].english=80;
           score[3].japanese=78;
           score[3].math=50;
           score[3].science=55;
           score[3].society=69;

           score[4].name="麗日お茶子";
           score[4].number=5;
           score[4].english=80;
           score[4].japanese=82;
           score[4].math=66;
           score[4].science=79;
           score[4].society=75;

           for(i=0; i<5; i += 1){
               score[i].average= (score[i].english + score[i].japanese + score[i].math + score[i].science + score[i].society) / 5;
               System.out.println(score[i].name + ": " + score[i].average);
           }

        } catch (NullPointerException e) {
            System.out.println("オブジェクトが作成されていません");
        }
     }
}