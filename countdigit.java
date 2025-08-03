import java.util.Scanner;
public class countdigit {
    public static int countd(int num){
        int Count=0;
        while(num>0){
             num=num/10;
            Count++;

        }
       int val=Count;
        return val;



    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the num:");
        int num=s.nextInt();
        System.out.println(countd(num));
    }
    
}
