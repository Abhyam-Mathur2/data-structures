import java.util.Scanner;
public class delearray {
    public static void main(String [] args){
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size=ob.nextInt();
    int[] arr= new int[size];
    System.out.println("enter the position to be deleted");
    int pos=ob.nextInt();
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]= ob.nextInt();
        }
        for(int j=pos;j<size;j++){
            arr[j-1]=arr[j];
        }
        if(pos<=size){
            size--;
        }
        System.out.println("array after deleting ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
