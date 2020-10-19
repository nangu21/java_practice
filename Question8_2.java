import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Question8_2{
	public static void main(String[] args){
		int num, result;
		ArrayList<String> day= new ArrayList<String>();
		day.add("Sun");
		day.add("Mon");
		day.add("Tues");
		day.add("Wednes");
		day.add("Thurs");
		day.add("Fri");
		day.add("Satur");
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("曜日を出力します。数を入力し「Return」キーを押してください。");
			num = Integer.parseInt(br.readLine());
			result = num % 7;
			
			System.out.println(day.get(result) + "day");
			
		}catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}