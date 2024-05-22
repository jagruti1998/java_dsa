package Top75Questions;
//if s is a subsequence of t,return true or false otherwise.
public class IsSubsequence {
    public static void main(String[] args){
        String s="axc", t="ahbgdc";
        System.out.println(isSubsequence(s,t));

    }

    public static boolean isSubsequence(String s, String t){

        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }

        return i==s.length();
    }


}
