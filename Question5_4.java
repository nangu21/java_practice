import java.io.*;
import java.lang.*;

public class Question5_4{
	public static void main(String[] args){
		
		try{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ドメインの判定を行います。メールアドレスを入力して「Return」キーを押してください。");
			
			String str= br.readLine();
			int index= str.indexOf("@");
			String domain= str.substring(index + 1
			);
			
			if((domain.equals("waseda.jp") || domain.equals("waseda.ac.jp"))){
				System.out.println("これは早稲田大学のメールアドレスです。");
			}else{
				System.out.println("これは早稲田大学のメールアドレスではありません。");
			}
			
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
		
	}
}