import java.io.*;
import java.lang.*;

public class Magazine extends Book{
     int volume, number;

     public String getTitle(){
         String magTitle= title + volume + "巻" + number + "号";
         return magTitle;
     }
}