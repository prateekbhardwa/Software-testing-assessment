package codeComprehensive;

import java.util.Arrays;
import java.util.Scanner;

public class question_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //initialize array
        int arr[]=new int[5];
        int sum=0;

        //array elements
        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        //Sorting the array and storing the minimum and maximum values
        Arrays.sort(arr);
        int min=arr[4];
        int max=arr[0];
        int minSum = sum-min;
        int maxSum = sum-max;
        System.out.println(minSum+" "+maxSum);
    }
}
