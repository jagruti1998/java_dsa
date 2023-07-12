package basic_maths;

public class GCD {
    public static void main(String[] args){
        int a=98, b=56;

        while(a!=b){
            if(a==0){
                System.out.println("GCD" +b);
                break;
            }

            if(b==0){
                System.out.println("GCD" +a);
            }

            if(a>b)
                a=a-b;
                if(b>a)
                    b=b-a;
                }
        if(a==b)
        {
            System.out.println("GCD : " +a);
        }
            }
        }

