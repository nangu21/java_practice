import java.io.*;
import java.lang.*;

public class Question6_1_for{
	public static void main(String[] args){
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int i, num, sum= 0;
		
		try{
		for(i = 1; i <= 5; i = i + 1){
			System.out.println("5人の得点の平均を求めます。" + i +"人目の得点を入力し「Return」キーを押してください。");
			num= Integer.parseInt(br.readLine());
			sum= sum + num;
		}
		
		double avarage= sum / 5;
		System.out.println("平均点： " + avarage + "点");
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
		
	}
}