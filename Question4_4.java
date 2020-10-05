import java.io.*;
import java.lang.*;

public class Question4_4{
	public static void main(String[] args){
		String date,year,month,day;
		int m,n;
		
		try{
			System.out.println("year.month.dayという形式で日付を入力してください。");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			date = br.readLine();
			m = date.indexOf(".");
			n = date.lastIndexOf(".");
			year = date.substring(0, m);
			month = date.substring(m + 1, n);
			day = date.substring(n + 1);
			
			System.out.println(year + "年" + month + "月" + day + "日");
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}