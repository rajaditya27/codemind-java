import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        // String Summer,Winter,Rainy,Spring;
        // Summer=sc.nextLine();
        // Winter=sc.nextLine();
        // Rainy=sc.nextLine();
        // Spring=sc.nextLine();
        if (n==4||n==5||n==6)
        System.out.println("Summer");
        else if(n==7||n==8||n==9||n==10)
        System.out.println("Rainy");
        else if(n==11||n==12||n==1)
        System.out.println("Winter");
        else if(n==2||n==3)
        System.out.println("Spring");
        else
        System.out.println(-1);
    }
}