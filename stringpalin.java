import java.util.*;
public class stringpalin {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a=ob.nextLine();
        boolean ans= palin(a,0,a.length()-1);
        System.out.println("The given strig is palindrome: "+ans);
    }
    public static boolean palin(String a,int left,int right){
        if(left>right){
            return true;
        }
        if(!Character.isLetterOrDigit(a.charAt(left))){
            return palin(a,left+1,right);
        }
        if(!Character.isLetterOrDigit(a.charAt(right))){
            return palin(a,left,right-1);
        }
        if(Character.toLowerCase(a.charAt(left))!=Character.toLowerCase(a.charAt(right))){
            return false;
        }
        return palin(a,left+1,right-1);
    }
}
