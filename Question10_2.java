import java.io.*;
import java.lang.*;

public class question10_2{
	public static void main(String[] args){
		String str, shortstr;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try{
		System.out.println("11文字以上の文字列を入力してください");
		try{
		str= br.readLine();
		//文字列3~10番目を取り出す
		shortstr= str.substring(3, 11);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("文字列は11文字以上入力してください");
			str= br.readLine();
			shortstr= str.substring(3, 11);
			System.out.println("取り出した文字列： " + shortstr);
		}
		}catch(IOException e){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}