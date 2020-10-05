import java.io.*;
import java.lang.*;

public class Subject1_2{
	public static void main(String[] args){
		int price = 70,budget = 30000,candy,people,remainder;
		
		candy = budget / price;
		people = candy / 5;
		remainder = candy % people;
		
		System.out.println("用意できる飴玉の最大個数: " + candy);
		System.out.println("飴玉を配ることができる人数: " + people);
		System.out.println("余る飴玉の個数: " + remainder);
	}
}