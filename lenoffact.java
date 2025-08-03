import java.util.Scanner;
public class lenoffact {
    public static int lan1(int num){
        int Count=0;
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
             sum=sum+i;
                Count++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the num:");
        int num=s.nextInt();
        System.out.println(lan1(num));
    }
    
}
