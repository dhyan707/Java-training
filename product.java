import java.util.Scanner;

public class product {
    public static int sumofl(int num) {
       
        int last1=1;
        int last=0;
        while(num>0){
        last=num%10;
        last1=last1*last;
        num=num/10;
    }
    System.out.println(last1);
    return 1;
}
public static void main(String[] args) {
    sumofl(123);
}
}
