import java.util.*;
public class maxsubarrwithsumk {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the sum: ");
        int k= ob.nextInt();
        System.out.println("Enter element in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;int len=0;
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
            if(sum==k){
                len=i+1;
            }
            if(map.containsKey(sum-k)){
                int index=map.get(sum-k);
                int leng=i-index;
                len=Math.max(len,leng);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println("length of max subarray is: "+len);
    }
}
