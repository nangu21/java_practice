import java.io.*;
import java.lang.*;

public class Question5_1{
	public static void main(String[] args){
		int random= (int)(Math.random()*1000);
		
		if(random > 500){
			System.out.println("Big");
		}else{
			System.out.println("Small");
		}
		
	}
}