import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Question8_1_1{
	public static void main(String[] args){
		int sum, average;
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(98);
		num.add(80);
		num.add(66);
		num.add(55);
		num.add(90);
		
		sum = num.get(0) + num.get(1) + num.get(2) + num.get(3) + num.get(4);
		average = sum / 5;
		
		System.out.println(average);
	}
}