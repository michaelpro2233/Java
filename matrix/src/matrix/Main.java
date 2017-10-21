package matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the dimensions of matrix: ");

		int n = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());
		int k = Integer.parseInt(reader.readLine());

		int[][] array1 = new int[n][];
		int[][] array2 = new int[m][];
		int[][] result = new int[n][];

		for (int i = 0; i < result.length; i++)
			result[i] = new int[k];

		System.out.println("Matrix 1:");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = new int[m];
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = (int) Math.round(Math.random() * 10);
				System.out.print(array1[i][j] + "    ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2:");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = new int[k];
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = (int) Math.round(Math.random() * 10);
				System.out.print(array2[i][j] + "    ");
			}
			System.out.println();
		}

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				for (int l = 0; l < array2.length; l++) {
					result[i][j] += array1[i][l] * array2[l][j];
					// A1[0,0] * A2[0][0] + A1[0][1] + A2[1][0] + A1[0][2]*A2[2][0]
				}
			}
		}
		System.out.println("Result: ");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "    ");
			}
			System.out.println();
		}
	}
}