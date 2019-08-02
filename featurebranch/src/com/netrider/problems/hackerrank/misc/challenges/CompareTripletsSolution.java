package com.netrider.problems.hackerrank.misc.challenges;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * compareTriplets
 * https://www.hackerrank.com/challenges/compare-the-triplets
 * @author Mr Gaurav Rajapurkar
 *
 */
public class CompareTripletsSolution {

	 // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> resList = new ArrayList<>();
      int len = a.size();
      int aRes =0 , bRes = 0;
      for (int i=0 ; i <len ; i++){
           if(a.get(i)>b.get(i)){
                aRes++;
            }else if (a.get(i)< b.get(i)) {
                bRes++;
            }

        }
            resList.add(aRes);
            resList.add(bRes);
            return resList;           
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            if(aItem<=1 && aItem >=100){
                System.out.println("Invalid input "+ aItem);
            }else{
                a.add(aItem);

            }
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            if(bItem<1 && bItem >100){
                System.out.println("Invalid input "+ bItem);
            }else{
                b.add(bItem);

            }
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
