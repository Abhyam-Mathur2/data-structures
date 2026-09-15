import java.util.*;
public class nothatappearone {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= ob.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)==1){
                System.out.println(key);
            }
        }
    }
}
