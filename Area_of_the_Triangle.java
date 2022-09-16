import java.util.Scanner;
class Triangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Double area,s,a,b,c;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
    }
}