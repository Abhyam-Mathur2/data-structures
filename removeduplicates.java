import java.util.*;
public class removeduplicates {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the no in array: ");
        for (int i = 0; i <n ; i++) {
            arr[i]=ob.nextInt();
        }
        int i=0;
        for (int j = 1; j < n; j++) {
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        for (int j = 0; j <= i; j++) {
            System.out.println("Array after removing elements: "+ arr[j]);
        }
    }
}
