public class strong {
    public static void main(String[] args){
    int num=145;
    int prod=1;
    int temp=0;
    while(num>=0){
       int lg=num%10;
        int newnum=lg;
        for(int i=newnum-1;i<=1;i--){
        prod=prod*lg;
        num=num/10;
}
      temp=prod+temp;
    }
if(temp==num){
        System.out.println("strong num");
    }
else{
        System.out.println("not");
    }
}
}