import java.util.Arrays;
import java.util.Scanner;
public class insertarray {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= ob.nextInt();
        int [] arr=new int[size+1];
        System.out.println("Enter the postion and element to be inserted:");
        int pos= ob.nextInt();
        int element= ob.nextInt();
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < size; i++) {
            arr[i]=ob.nextInt();
        }
       for(int i=size-1;i>=pos;i--){ //size 5, i=4
           arr[i]=arr[i-1];       //
       }

       arr[pos-1]=element;
        for (int i = 0; i <size ; i++) {
            System.out.println(arr[i]);
        }
    }
}
