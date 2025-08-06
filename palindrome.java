import java.util.Scanner;
public class palindrome {
    public static void palin(int num){
    int nld=0;
    int newnum=num;

    while(num>0){
    int  ld=num%10;
    nld=nld*10+ld;
    num/=10;
    }
    if(newnum==nld){
         System.out.println("palindrome");
    }
        else{
            System.out.println("not palindrome");
        }
      

    }
    
public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter a num:");
    int num=s.nextInt();
palin(num);
}

}