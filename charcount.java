import java.util.*;
public class charcount {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a the size of array: ");
        int n=ob.nextInt();
        char[] arr=new char[n];
        System.out.println("Enter the char in array");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.next().charAt(0);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c=arr[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println("frequency of each char is: ");
        //System.out.print(map);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
