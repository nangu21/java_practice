import java.io.*;
import java.lang.*;

public class Student{
     String name;
     int id;
     
     public double calcAverage(int eng, int jap, int math, int sci, int soc){
         double average;

         average = (double) ( eng + jap + math + sci + soc ) / 5;
         return average; 
     }
    
}