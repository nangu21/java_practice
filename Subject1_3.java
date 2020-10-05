import java.io.*;
import java.lang.*;

public class Subject1_3{
	public static void main(String[] args){
		int num1,num2,num3,num4,result;
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("4ヶ月分のアルバイト料の平均を求めます。1ヶ月目のアルバイト料を入力し、「Return」キーを押してください。");
			num1 = Integer.parseInt(br.readLine());
			System.out.println("2ヶ月目のアルバイト料を入力し、「Return」キーを押してください。");
			num2 = Integer.parseInt(br.readLine());
			System.out.println("3ヶ月目のアルバイト料を入力し、「Return」キーを押してください。");
			num3 = Integer.parseInt(br.readLine());
			System.out.println("4ヶ月目のアルバイト料を入力し、「Return」キーを押してください。");
			num4 = Integer.parseInt(br.readLine());
			
			result = (num1 + num2 + num3 + num4) / 4;
			
			System.out.println("4ヶ月のアルバイト料の平均は " + result + " 円です。");
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}