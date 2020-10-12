import java.io.*;
import java.lang.*;

public class Question5_3{
	public static void main(String[] args){
		int ordinaryDeposit= 150000, timeDeposit= 250000;
		double possible= (ordinaryDeposit + timeDeposit) * 0.9;
		
		try{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("引き出し金額を入力し「Return」キーを押してください。");
			int drawer= Integer.parseInt(br.readLine());
			int balance= ordinaryDeposit - drawer;
			
			if(drawer < ordinaryDeposit){
				System.out.println("ありがとうございました。残高は" + balance + "円です。");
			}else if(( drawer > ordinaryDeposit) && (drawer < possible)){
				System.out.println("ありがとうございました。引き出し金額が普通預金の金額を超えていたので、定期預金からの借用となります。残高は" + balance + "円です。");
			}else if(drawer > possible){
				System.out.println("引き出し可能金額は" + possible + "円なので、入力された金額を引き出すことはできません。");
			}
			
		}
		catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
		
	}
}