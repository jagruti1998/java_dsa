package basic_maths;

public class ArmstrongNumber {
    public static void main(String[] args){
        int n=153,temp,arm=0;
        int original=n;

        while(n>0){
            temp=n%10;
            temp = (int) Math.pow(temp, 3);
            arm=arm+temp;
            n=n/10;
        }
        if(arm==original){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
}
