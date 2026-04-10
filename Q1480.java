/*
Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.


*/
import java.util.Arrays;
import java.util.Scanner;
public class Q1480 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=ob.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i <size ; i++) {
            arr[i]=ob.nextInt();
        }
        int sum=0;int [] temp=new int[size];
        for (int i = 0; i <size ; i++) {
            sum=sum+arr[i];
            temp[i]=sum;
        }
        System.out.println(Arrays.toString(temp));
    }
}

