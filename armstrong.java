import java.util.Scanner;

public class  armstrong {
    public static void armq(int num){
        int lastd=0;
        int val=num;
        
        while(num>0){
           int last=num%10;
            lastd=lastd+(last*last*last);
        
            num/=10;
        }
      
        if(val==lastd){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
           
        }
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=s.nextInt();
        armq(num);
    }
    }
       