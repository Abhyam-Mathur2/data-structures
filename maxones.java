import java.util.*;
public class maxones {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=ob.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        int ans=findmax(arr);
        System.out.println("Max one is "+ ans);
    }

    public static int findmax(int[] arr){
        int n=arr.length;
        int count=0;int max=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
