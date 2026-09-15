import java.util.*;
public class findthemissingno {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int a=ob.nextInt();
        int [] arr=new int[a];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < a; i++) {
            arr[i]= ob.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int esum=0;
        for(int i=1;i<=arr.length+1;i++){
            esum=esum+i;
        }
        System.out.println(esum-sum);
    }
}
