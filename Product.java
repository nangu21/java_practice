import java.io.*;
import java.lang.*;

public class Product{
     String name;
     int price;

     public int calcSales(int app,int ora,int kiwi,int gra,int man){

        return (75*app) + (50*ora) + (60*kiwi) + (160*gra) + (1000*man);
     }
}