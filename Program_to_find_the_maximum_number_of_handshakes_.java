import java.util.Scanner;

class Sample {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		n -= 1;
		int ans = (int) (n * (n + 1)) / 2;
		System.out.println(ans);
	}
}