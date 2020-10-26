import java.io.*;
import java.lang.*;

public class question10_1{
	public static void main(String[] args){
			//配列を宣言：５つ
			int number[]= new int[5], i;
		try{
			//標準入力
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("数字を入力して「Return」キーを押してください");
			for(i = 0; i < 10; i = i + 1){
				//数値変換
			try{
				number[i]= Integer.parseInt(br.readLine());
			}catch(NumberFormatException e){
				System.out.println("入力された文字列は数値に変換できません。入力し直してください。");
		  		}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("配列の添字について例外が発生しました。要素の数は５つまでです。");
		}catch(IOException e){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}