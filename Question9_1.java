import java.io.*;
import java.lang.*;

public class question9_1{
	public static void main(String[] args){
		try{
			String str;
			FileReader fr= new FileReader("today.txt");
			BufferedReader br= new BufferedReader(fr);
			
			while(br.ready()){
				str= br.readLine();
				System.out.println(str);
			}
			br.close();
			fr.close();
		
		}catch(IOException e){
			System.out.println("入力された名前のファイルは存在しません");
		}
	}
}