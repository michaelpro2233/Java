package hometask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("Enter b");
		int b = Integer.parseInt(reader.readLine());
		System.out.println("Greatest Common Divisor: " + gcd(a, b));
		System.out.println("Least Common Multiple: " + lcm(a, b));
		
		System.out.println("Enter numeric: ");
		int n = Integer.parseInt(reader.readLine());
		System.out.println(SimpleNum(n));
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		} else
			return gcd(b, a % b);
	}
	
	public static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}
	
	public static String SimpleNum(int n) {
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) return "It is composite numeric";
		} return "It is prime numeric";
	}
}