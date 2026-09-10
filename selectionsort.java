import java.util.*;
public class selectionsort {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        for (int i = 0; i <n-1 ; i++) {
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        System.out.println(Arrays.toString(arr));   //O(n^2)
    }
}
