import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.nextLine().charAt(0);
        if (ch=='a'|| ch=='A' ||ch=='e'|| ch=='E' || ch=='i'|| ch=='I' || ch=='o'|| ch=='O' ||ch=='u'|| ch=='U')
            System.out.println("Vowel");
        
        else
            System.out.println("Consonant");
        
    }
}