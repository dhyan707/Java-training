import java.util.Scanner;
public class facto {
    public static int fact1(int num){
        int prod=1;
        for(int i=num;i>=1;i--){
            prod=prod*i;
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the num:");
        int num=s.nextInt();
        System.out.println(fact1(num));
    }
}
