import java.util.Scanner;

public class power {
    public static int value(int a,int b){
        int i=1;
        int val=0;
        while(b>=i){
       val=a*a;
       i++;
        }
        // System.out.println(val);
       return val;


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         System.out.println("enter the base:");
        int a=s.nextInt();
        System.out.println("enter the power:");
        int i=s.nextInt();
       System.out.println(value(a,i));
    }
    
}
