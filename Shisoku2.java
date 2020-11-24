import java.io.*;
import java.lang.*;
import java.util.*;

public class Shisoku2{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("x= ");
        double x = sc.nextDouble();
        System.out.print("y= ");
        double y = sc.nextDouble();

        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println(" 余り" + (x%y));
     }
}