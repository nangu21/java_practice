import java.io.*;
import java.lang.*;
import java.util.*;

public class Shisoku1{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("x= ");
        int x = sc.nextInt();
        System.out.print("y= ");
        int y = sc.nextInt();

        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println(" 余り" + (x%y));
     }
}