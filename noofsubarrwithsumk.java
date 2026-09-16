import java.util.*;
public class noofsubarrwithsumk {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the sum you need to find");
        int k=ob.nextInt();
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
            if(map.containsKey(sum-k)){
                count=count+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
