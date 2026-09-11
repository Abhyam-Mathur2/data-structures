import java.util.*;
public class unsortremovedupli {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=ob.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        int j=0;
        for (int i = 0; i < n; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
    }
}
