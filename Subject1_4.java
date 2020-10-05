import java.io.*;
import java.lang.*;

public class Subject1_4{
	public static void main(String[] args){
		String str;
		int num;
		
		try{
			
			System.out.println("学籍番号(ハイフン以降除く)を入力してください。");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
			num = Integer.parseInt(str.substring(2, 4));
			System.out.println("この人の入学年度は20" + num + "です。");
			
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}