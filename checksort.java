import java.util.*;
public class checksort {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i <n ; i++) {
            arr[i]=ob.nextInt();
        }
        boolean check=true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                check=false;
            }
        }
        if(check){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not sorted array");
        }
    }
}
