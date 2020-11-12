import java.io.*;
import java.lang.*;

public class Addition{
    public int addNum(int[] num){
        int sum=0;

        for(int val : num){
            sum += val;
        }

        return sum;
    }

    public int addNum(String[] arr){
        int sum=0, num2;

        try{
            for(String str : arr){
                num2= Integer.parseInt(str);
                sum += num2;
                }
        }catch(NumberFormatException e){
            System.out.println("数値でない文字列が含まれています。再度実行してください。");
        }

        return sum;
    }
}