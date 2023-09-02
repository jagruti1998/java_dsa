package basic_recursion;
//String is palindrome or not
public class Palindrome {
    public static void main(String[] args){
        String a="abcdba";
        int i=0,j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                System.out.println("Not a Palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
