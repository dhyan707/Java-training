import java.util.Scanner;

public class sum1 {
    public static int sumofl(int num) {
       
        int last1=0;
        int last=0;
        while(num>0){
        last=num%10;
        last1=last1+last;
        num=num/10;
    }
    System.out.println(last1);
    return 1;
}
public static void main(String[] args) {
    sumofl(12647);
}
}
