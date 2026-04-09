/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */
import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;
public class Q1929 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=ob.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i <size ; i++) {
            arr[i]= ob.nextInt();
        }
        concat(arr);
    }
    public static void concat(int [] arr){
        int size=arr.length;
        int [] temp=new int[2*size];
        for (int i = 0; i <size; i++) {
            temp[i]=arr[i];
        }
        int count=0;
        for (int j = size; j <temp.length ; j++) {
            temp[j]=arr[count];
            count++;
        }
        System.out.println(Arrays.toString(temp));
    }
}
