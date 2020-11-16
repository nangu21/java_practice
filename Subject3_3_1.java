import java.io.*;
import java.lang.*;

public class Subject3_3_1{
     String terminal, kind;
     int fare;

     public String displayResult(){
        return terminal + "行きの" + kind + "の切符です";
     }

     public int displayFare(){
         return fare;
     }
}