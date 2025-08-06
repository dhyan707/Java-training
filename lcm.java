import java.util.Scanner;
public class lcm {

    public static int high1(int num,int num2){
         
        for(int i=1;;i++){
        
       if(i%num==0 && i%num2==0){
        
        System.out.println(i);
        break;

       }
    
    
}
return 0;
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

    
