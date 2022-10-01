import java.util.*;
class aditya{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=0;
        for (i=0;i<n;i++){
            s+=arr[i];
        }
        if(n>=0 && n<=30){
            System.out.print(s);
        }
        else
            System.out.print("Enter a valid number");
        
    }
}