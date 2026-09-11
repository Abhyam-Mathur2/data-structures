import java.util.*;
public class insertionsort {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a=ob.nextInt();
        int [] arr=new int[a];
        System.out.println("enter the no in array: ");
        for (int i = 0; i < a; i++) {
            arr[i]=ob.nextInt();
        }
        for (int i = 1; i <a ; i++) {               //O(n2)
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("sorted array: "+Arrays.toString(arr));
    }
}
