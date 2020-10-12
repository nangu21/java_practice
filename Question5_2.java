import java.io.*;
import java.lang.*;

public class Question5_2{
	public static void main(String[] args){
		try{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("2つの文字列を比較します。1つ目の文字列を入力し「Return」キーを押してください。");
			String str1= br.readLine();
			
			System.out.println("2つ目の文字列を入力し「Return」キーを押してください。");
			String str2= br.readLine();
			
			if(str1.equals(str2)){
				System.out.println("Same!");
			}else{
				System.out.println("Different!");
			}
			
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
		
	}
}