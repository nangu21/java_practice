import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class balanceManage{
     public static void main(String[] args){
        try {
            //収入金額
            System.out.println("収支割合の計算をします。収入金額を入力しReturnキーを押してください。");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //オブジェクト作成
            int number= Integer.parseInt(br.readLine());
            Balance info= new Balance();
            info.income= number;
            

            //支出金額入力
            System.out.println("支出金額を入力しReturnキーを押してください。Endと入力すると終了します。");
            
            //支出金額配列準備
            ArrayList<Integer> lists= new ArrayList<Integer>();
            String data= "";
            int sum=0;
            
            while(!(data=br.readLine()).equals("") || !(data=br.readLine()).equals("End")){
                    if(!data.equals("End")){
                        //Endと入力されるまで値を追加
                        lists.add(Integer.parseInt(data));
                    }else if(data.equals("End")){
                        //Endと入力されたらdata分の配列に値を格納
                        int[] expenditure= new int[lists.size()];

                        for(int i=0; i<lists.size(); i++){
                            expenditure[i]= lists.get(i);
                        }

                        //金額の合計を出す
                         for(int list : expenditure){
                            sum += list;
                        }

                        //合計値を引き渡し
                        info.sum2= sum;

                        //結果を表示
                        //System.out.println(sum);
                        //System.out.println(number);
                        System.out.println(info.calcratio() + "%");
                        break;

                    }
                }

        }catch(IOException e){
            System.out.println("標準入力において例外が発生しました。");
        }catch(NullPointerException e){
            System.out.println("オブジェクトが作成されていません。");
        }catch(NumberFormatException e){
            System.out.println("数値を入力してください。");
        }
    }
}
