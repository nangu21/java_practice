import java.io.*;
import java.lang.*;

public class Number{
     public String sortNum(int num){

         if(num % 2 == 0){
             return num + " は偶数です";
         }else{
             return num + " は奇数です";
         }
     }
}