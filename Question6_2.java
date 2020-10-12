import java.io.*;
import java.lang.*;

public class Question6_2{
	public static void main(String[] args){
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int num, sum= 0;
		
		try{
		do{
			System.out.println("数の合計を計算します。「０」を入力して終了してください。");
			num= Integer.parseInt(br.readLine());
			sum= sum + num;
		}while(num != 0);
		
		System.out.println("合計： " + sum);
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
		
	}
}