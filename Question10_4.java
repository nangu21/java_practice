import java.io.*;
import java.lang.*;

public class question10_4{
	public static void main(String[] args){
		String str, num1, num2, num3;
		int m, n, sum;
		double avarage;
		
		try{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("3つの数の平均を計算します。数は「,」で区切ってください。");
			str= br.readLine();
			m= str.indexOf(",");
			n= str.lastIndexOf(",");
			
			
			if(m == -1 || n == -1){
				System.out.println("3つの数字は「,」で区切ってください。");
				str= br.readLine();
				m= str.indexOf(",");
				n= str.lastIndexOf(",");
			}
			
			try{
			num1= str.substring(0, m);
			num2= str.substring(m + 1, n);
			num3= str.substring(n + 1);
			sum= Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);
			avarage= sum / 3;
			System.out.println("平均： " + avarage);
			}catch(NumberFormatException e){
			System.out.println("入力された文字列は数字に変換できません。入力し直してください。");
			str= br.readLine();
			num1= str.substring(0, m);
			num2= str.substring(m + 1, n);
			num3= str.substring(n + 1);
			sum= Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);
			avarage= sum / 3;
			System.out.println("平均： " + avarage);
			}
			}catch(IOException e){
			System.out.println("標準入力において例外が発生しました。");
		}
}
}