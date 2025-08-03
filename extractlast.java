import java.util.Scanner;
public class extractlast {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=s.nextInt();
        while(num>0){
      int lastdigit=num%10;
      System.out.println(lastdigit);
       num=num/10;

        }
    }
    
}
