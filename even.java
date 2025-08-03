import java.util.Scanner;
class even{
    public static void main(String[] args) {
        int Count = 1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=s.nextInt();

        for(int i=1;Count<=a;i++){
            if(i%2!=0){
                Count++;
                System.out.println(i);
            }
        }
    }
        
    }
