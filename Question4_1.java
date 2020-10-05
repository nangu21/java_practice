import java.io.*;
import java.lang.*;

public class Question4_1{
	public static void main(String[] args){
		try{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("1つ目の文字列を入力してください。");
			String str1= br.readLine();
			System.out.println("2つ目の文字列を入力してください。");
			String str2 = br.readLine();
			
			String result = "1st string is " + str1 + ".\n" + "2nd string is " + str2 + ".";
			
			System.out.println(result);
		}
		catch(IOException ioe){
			System.out.println("標準出力において例外が発生しました。");
		}
	}
}