import java.util.Scanner;
class disk{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t,s,b;
        long m;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        m=2*t*s*b*512;
        System.out.println(m);
        
    }
}