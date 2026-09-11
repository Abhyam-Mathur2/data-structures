import java.util.*;
public class rotatearray {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter the no you want to rotate the array: ");
        int k=ob.nextInt();
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[i]=arr[i+1];
            }
            arr[n-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
