import java.util.Scanner;
public class reverse {
    public static int rev(int num){
         int lastd=0 ;
        while(num>0){
           int last=num%10;
            lastd=lastd*10+last;
        
            num/=10;
        }
     return lastd;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int num =s.nextInt();

        System.out.println(rev(num));
    }
    
}
