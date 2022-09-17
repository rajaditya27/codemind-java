import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[],n,c=0;
        n=sc.nextInt();
        a=new int[100];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-2;i+=2){
            if(!(a[i]<a[i+1] && a[i+1]>a[i+2]) && !(a[i]>a[i+1] && a[i+1]<a[i+2])){
                // c++;
             System.out.println("no");
             return;
            }
        }
        // if(c==n){
            System.out.println("yes");
        // }
    }
}