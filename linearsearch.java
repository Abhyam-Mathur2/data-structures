import java.util.*;
public class linearsearch {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        System.out.println("Enter the elements in array: ");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        System.out.print("enter a element to find the element:");
        int x=ob.nextInt();
        int ans=linear(arr,x);
        if(ans!=-1){
            System.out.println("Element found at position: "+ ans);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int linear(int [] arr, int x){
        int found=-1;
        for (int i = 0; i <arr.length ; i++) {
            if(x==arr[i]){
                found=i;
            }
        }
        return found;
    }
}
