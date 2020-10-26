import java.io.*;
import java.lang.*;

public class question10_3{
	public static void main(String[] args){
	int num, sum=0;
	try{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("入力された数を足し合わせます。「0」を入力すると計算を終了します。");
		do{
			try{
			num= Integer.parseInt(br.readLine());
			sum += num;
			}catch(NumberFormatException e){
				System.out.println("入力された文字列は数に変換できません。入力し直してください。");
				num= Integer.parseInt(br.readLine());
				sum += num;
			}
		}while(num != 0);
	System.out.println("入力された数の和： " + sum);
	}catch(IOException e){
		System.out.println("標準入力において例外が発生しました。");
	}
	}
}