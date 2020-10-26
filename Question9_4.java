import java.io.*;
import java.lang.*;

public class Question9_4{
	public static void main(String[] args){
		try{
			String str, line;
			//標準入力
			BufferedReader standardBr= new BufferedReader(new InputStreamReader(System.in));
			//ファイル読み込み
			FileReader fr= new FileReader("SomeStatesOfAmerica.txt");
			BufferedReader br= new BufferedReader(fr);
			//ファイル書き込み
			FileWriter fw= new FileWriter("output2.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter pw= new PrintWriter(bw);
			
			while(br.ready()){
				str= br.readLine();
				System.out.println(str);
				System.out.println("別ファイルの出力に上記が必要であれば「1」を、不要であれば「0」を入力し「Return」キーを押してください。");
				int answer= Integer.parseInt(standardBr.readLine());
				
				if(answer == 1){
					pw.println(str);
				}
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