import java.io.*;
import java.lang.*;

public class Question4_3{
	public static void main(String[] args){
		int jpy;
		double result1,result2;
		double usd = 0.95;
		double eur = 0.81;
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("両替したい日本円の金額を入力し、「Return」キーを押してください。");
			jpy = Integer.parseInt(br.readLine());
			result1 = jpy * usd / 100;
			result2 = jpy * eur / 100;
			
			System.out.println(jpy + "円は\n" + result1 + "ドル\n" + result2 + "ユーロ\nになります。");
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}