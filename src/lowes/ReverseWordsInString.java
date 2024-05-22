package lowes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsInString {
    public static void main(String[] args){
        char[] s = {'h','e','l','o'};

        reverse(s);
        System.out.println(s);

    }

    public static char[] reverse(char[] s){

        int n=s.length;
        for(int i=0;i<n/2;i++){
            char temp=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=temp;
        }


        return s;
    }

    @Test
    public void reverseTest(){

        char s[]={'h','e','l','o'};

        // Expected result
        char expected[]={'o','l','e','h'};

        // Actual result
        char actual[] = reverse(s);

        // Assertion
        assertEquals(expected, actual);

    }
}
