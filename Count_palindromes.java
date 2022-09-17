import java.util.Scanner;
class Solution{
    public static boolean pal(int n){
        int rev=0,temp=n,p;
        while(n!=0){
        p=n%10;
        rev=rev*10+p;
        n=n/10;
        }
        if (temp==rev)
            return true;
        else
            return false;
    
}
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a[],count=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){    
           if (pal(a[i]))
            count++;
        }
    System.out.println(count);
    }
    
}
