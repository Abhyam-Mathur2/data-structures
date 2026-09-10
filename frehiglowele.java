import java.util.*;
public class frehiglowele {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<n;i++){
            arr[i]= ob.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxfreq=0;
        int minfreq=n;
        int maxele=0;
        int minele=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int element= entry.getKey();
            int frequency =entry.getValue();
            if(maxfreq<frequency){
                maxfreq=frequency;
                maxele=element;
            }
            if(minfreq>frequency){
                minfreq=frequency;
                minele=element;
            }
        }
        System.out.println("element with highest frequency is "+ maxele +" "+maxfreq);
        System.out.println("element with lowest frequency is "+ minele+" "+minfreq);
    }
}
