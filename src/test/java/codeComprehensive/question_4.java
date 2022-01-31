package codeComprehensive;

import java.util.Arrays;
import java.util.Scanner;

public class question_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //initialize array
        long arr[]=new long[5];
        long sum=0;

        //array elements
        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        //Sorting the array and storing the minimum and maximum values
        Arrays.sort(arr);
        long min=arr[4];
        long max=arr[0];
        long minSum = sum-min;
        long maxSum = sum-max;
        System.out.println(minSum+" "+maxSum);
    }
}
