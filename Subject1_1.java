import java.io.*;
import java.lang.*;

public class Subject1_1{
	public static void main(String[] args){
		int breakfast,lunch,dinner,amount,result;
		breakfast = 320;
		lunch = 730;
		dinner = 950;
		amount = breakfast + lunch + dinner;
		result = amount - 1800;
		
		System.out.println("目標を" + result + "kcalオーバーしています。");
	}
}