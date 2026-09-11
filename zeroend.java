import java.util.*;
public class zeroend {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in array: ");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
