import java.io.*;
import java.lang.*;

public class Question6_3{
	public static void main(String[] args){
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str, result= "";
		
		try{
		do{
			System.out.println("文字列を入力し「Return」キーを押してください。「End」を押すと終了します。");
			str = br.readLine();
			result = result + "「" + str + "」、";
		}while(!(str.equals("End")));
		
		System.out.println("あなたは" + result + "という順序で文字列を入力しました。");
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
		
	}
}