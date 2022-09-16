import java.util.Scanner;
class Average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float average,n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        average=(n+m)/2;
        System.out.format("%.4f",average);
    }
}