import java.io.*;
import java.lang.*;

public class Question7_1_2{
	public static void main(String[] args){
		int english[] = {90, 80, 68, 98, 50};
		int i,sum = 0;
		
		for(i=0; i < 5; i = i + 1){
			sum += english[i];
		}
		
		int average = sum / 5;
		System.out.println(average);
	}
}