//標準入力した文字列の長さと
//「a」が最初に出てくる位置を求める

import java.io.*;
import java.lang.*;

public class Question3_1{
	public static void main(String[] args){
		String inputString;
		int stringLength, index;
		
		try{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("文字列を入力して「Return」キーを押してください。");
		inputString = br.readLine();
		
		// length()
		stringLength = inputString.length();
		System.out.println("文字列の長さ: " + stringLength);
		
		//indexOf()
		index = inputString.indexOf("a");
		System.out.println("「a」が最初にでてくる位置: " + index);
		
		}catch(IOException ioe){
			System.out.println("標準入力において例外が発生しました。");
		}
	}
}