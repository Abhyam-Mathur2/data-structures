import java.util.*;
public class twosum {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }

        System.out.print("Enter the target:");
        int target=ob.nextInt();
        boolean ans=twosumm(arr,target);
        System.out.print(ans);
    }
    public static boolean twosumm(int [] arr,int target){
        HashSet<Integer> set=new HashSet<>();
        for(int nums:arr){
            int required=target-nums;
            if(set.contains(required)){
                return true;
            }
            set.add(nums);
        }
        return false;
    }
}
