import java.io.*;
import java.lang.*;

public class Question4_2{
	public static void main(String[] args){
		int num1,num2;
		double result;
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("2つの数値の平均値を求めます。1つ目の数値を入力し、「Return」キーを押してください。");
			num1 = Integer.parseInt(br.readLine());
			System.out.println("2つの数値の平均値を求めます。2つ目の数値を入力し、「Return」キーを押してください。");
			num2 = Integer.parseInt(br.readLine());
			
			result = (num1 + num2) / 2;
			System.out.println("2つの値の平均値は " + result + " です。");
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}