import java.io.*;
import java.lang.*;

public class question9_2{
	public static void main(String[] args){
		try{
			//ファイル読み込み
			String str;
			FileReader fr= new FileReader("today.txt");
			BufferedReader br= new BufferedReader(fr);
			
			//ファイル書き込み
			FileWriter fw= new FileWriter("output.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter pw= new PrintWriter(bw);
			
			while(br.ready()){
				str= br.readLine();
				pw.println(str);
			}
		
			pw.close();
			bw.close();
			fw.close();
			
			System.out.println("出力が完了しました");
			
		}catch(IOException e){
			System.out.println("入力された名前のファイルは存在しません");
		}
	}
}