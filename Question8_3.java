import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Question8_3{
	public static void main(String[] args){
		ArrayList<String> name= new ArrayList<String>();
				
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			
			do{
			System.out.println("名前を入力してください。「End」を入れると終了します。");
			str = br.readLine();
			name.add(str);
			}while(!(str.equals("End")));
			
			for(String raw: name){
				System.out.println(raw);
			}
			
		}catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}