import java.util.Scanner;
public class hcf {
    public static int high1(int num,int num2){
        int a=0;
        if(num>num2){
           a=num2;
        }
        else{
            a=num;
        }
         
        for(int i=num;i>0;i--){
        
       if(num%i==0 && num2%i==0){
        System.out.println(i);
        break;

       }
    
}
return 1;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter num ");
        int num=s.nextInt();
        System.out.println("enter num ");
        int num2=s.nextInt();
       high1(num,num2);

    }
}
