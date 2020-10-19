import java.io.*;
import java.lang.*;

public class Question7_3{
	public static void main(String[] args){
		//添え字一つ目が時限(1~5)、二つ目が曜日(月~金の0~4)
		int i,j;
		String subject[][] = new String[5][5];
		subject[0][0] = "国語";
		subject[0][1] = "図工";
		subject[0][2] = "図工";
		subject[0][3] = "算数";
		subject[0][4] = "社会";
		subject[1][0] = "体育";
		subject[1][1] = "算数";
		subject[1][2] = "社会";
		subject[1][3] = "理科";
		subject[1][4] = "なし";
		subject[2][0] = "音楽";
		subject[2][1] = "国語";
		subject[2][2] = "家庭科";
		subject[2][3] = "家庭科";
		subject[2][4] = "英語";
		subject[3][0] = "算数";
		subject[3][1] = "理科";
		subject[3][2] = "英語";
		subject[3][3] = "社会";
		subject[3][4] = "なし";
		subject[4][0] = "体育";
		subject[4][1] = "社会";
		subject[4][2] = "英語";
		subject[4][3] = "国語";
		subject[4][4] = "理科";

System.out.println("   月曜 火曜 水曜 木曜 金曜");
	 for(j = 0; j < 5; j = j + 1){	
	  System.out.print(j+1 + "限");
	 	for(i = 0; i < 5; i = i + 1){	
				System.out.print(subject[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}
}