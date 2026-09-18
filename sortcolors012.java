import java.util.*;
public class sortcolors012 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the no(color) :");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        int c0=0;
        int c1=0;
        int c2=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        for (int i = 0; i < c0; i++) {
            arr[i]=0;
        }
        for(int i=c0;i<c1+c0;i++){
            arr[i]=1;
        }
        for(int i=c1+c0;i<n;i++){
            arr[i]=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
