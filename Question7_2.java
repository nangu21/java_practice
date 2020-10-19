import java.io.*;
import java.lang.*;

public class Question7_2{
	public static void main(String[] args){
		String day[] = {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur"};
		int num, result;
		
		try{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("曜日を出力します。数を入力し「Return」キーを押してください。");
			num = Integer.parseInt(br.readLine());
			// 7で割ったあまりを求め,resultに代入する
			result = num % 7;
			
			//対応する曜日を出力
			System.out.println(day[result] + "day");
			
		}catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}