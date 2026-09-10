import java.util.*;
public class bubblesort {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            boolean swap=false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));//O(n^2)  for best(n)
    }
}
