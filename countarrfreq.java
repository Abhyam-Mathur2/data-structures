import java.util.*;
public class countarrfreq {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a size of array : ");
        int a=ob.nextInt();
        int[] arr=new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=ob.nextInt();
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println("Frequency of each element ");
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
