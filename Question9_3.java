import java.io.*;
import java.lang.*;

public class question9_3{
	public static void main(String[] args){
		try{
			String str, filename;
			int i;
			
			//標準入力準備
			BufferedReader standardBr= new BufferedReader(new InputStreamReader(System.in));
			//出力ファイル名を入力してもらう
			System.out.println("出力ファイルの名前を入力し「Return」キーを押してください");
			filename= standardBr.readLine();
			
			//ファイル書き込み準備
			FileWriter fw= new FileWriter( filename + ".txt");
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter pw= new PrintWriter(bw);
			
			for(i = 0; i < 5; i++){
			System.out.println("好きなものひとつを入力し「Return」キーを押してください");
			str= standardBr.readLine();
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