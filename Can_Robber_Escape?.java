import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        // c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                c+=1;     
            }
        }
        if(c<=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}