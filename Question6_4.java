import java.io.*;
import java.lang.*;

public class Question6_4{
	public static void main(String[] args){
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int  j, k, num1, num2;
		
		try{
			System.out.println( "1つ目の数を入力し、「Return」キーを押してください。");
			num1= Integer.parseInt(br.readLine());
			System.out.println( "2つ目の数を入力し、「Return」キーを押してください。");
			num2= Integer.parseInt(br.readLine());

			for(j = 1; j <= num1; j = j + 1){
				System.out.println("1 - " + j);
			}
			for(k = 1; k <= num2; k = k + 1){
				System.out.println("2 - " + k);
			}
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
	}