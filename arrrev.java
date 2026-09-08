import java.util.*;
public class arrrev {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int a=ob.nextInt();
        int [] arr=new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=ob.nextInt();
        }
        rev(arr);
    }
    public static void rev(int [] arr){
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
     /*   for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        } */
        System.out.print(Arrays.toString(arr));

    }
}
