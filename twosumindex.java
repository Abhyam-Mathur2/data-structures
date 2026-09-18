import java.util.*;
public class twosumindex {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=ob.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter the targer sum");
        int target=ob.nextInt();
       int[] ans=answ(arr,target);
       System.out.print(Arrays.toString(ans));
    }
    public static int[] answ(int[] arr, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int required=target-arr[i];
            if(map.containsKey(required)){
                return new int[] {map.get(required),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
}
