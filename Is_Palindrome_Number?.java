import java.util.Scanner;
class Palindrome{
    public static int ispal(int n){
        int rev=0;
        int temp=n;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(temp==rev){
            return 2;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ispal(n));
    }
}