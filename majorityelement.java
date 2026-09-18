import java.util.*;
public class majorityelement {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=ob.nextInt();
        int[] arr =new int[n];
        System.out.println("enter the elements in array:");
        for (int i = 0; i <n ; i++) {
            arr[i]=ob.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxcount=0;
        int answer=arr[0];
        for(int num:arr){
            int count=map.getOrDefault(num,0)+1;
            map.put(num,count);
            if(count>maxcount){
                maxcount=count;
                answer=num;
            }
        }
        System.out.print(answer);

    }
}
