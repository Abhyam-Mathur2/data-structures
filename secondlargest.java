import java.util.*;
public class secondlargest {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i <n ; i++) {
            arr[i]=ob.nextInt();
        }
        //finding largest first
        int largest=-1;
        int secondlargest=-1;
        for (int i = 0; i < n; i++) {
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        //now second largest
        for(int i=0;i<n;i++){
            if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("Second largest element is: " +secondlargest);
    }
}
