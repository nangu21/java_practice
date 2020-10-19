import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Question8_1_2{
	public static void main(String[] args){
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(98);
		num.add(80);
		num.add(66);
		num.add(55);
		num.add(90);
		int sum=0,average;
		
		for(Integer raw: num){
			sum += raw;
		}
		
		average = sum / 5;
		System.out.println(average);
	}
}