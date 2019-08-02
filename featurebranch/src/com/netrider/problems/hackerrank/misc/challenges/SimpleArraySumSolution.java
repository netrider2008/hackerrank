package com.netrider.problems.hackerrank.misc.challenges;
/**
 * https://www.hackerrank.com/challenges/simple-array-sum
 * @author Mr Gaurav Rajapurkar
 *
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleArraySumSolution {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int res = 0;
        for (int i = 0; i < ar.length; i++) {
            res = res+ar[i];
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        if(arCount<0 && arCount>1000){
            System.out.println("invalid input "+arCount);
        }
        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            if(arItem <0 && arItem>1000){
            System.out.println("invalid input "+arItem);
             }
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
