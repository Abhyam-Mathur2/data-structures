import java.util.Scanner;

/* 852. Peak Index in a Mountain Array
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.



Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1
 */
public class Q852 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n = ob.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        Q852 x = new Q852();
        int result = x.peakIndexInMountainArray(arr);
        System.out.println("Peak index: " + result);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
