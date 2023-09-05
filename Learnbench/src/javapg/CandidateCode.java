package javapg;

/* Read input from STDIN. Print your output to STDOUT*/

import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int X = scanner.nextInt();

		int[] energyLevels = new int[N];
		for (int i = 0; i < N; i++) {
			energyLevels[i] = scanner.nextInt();
		}

		Arrays.sort(energyLevels);
		reverse(energyLevels);

		int savedAnimals = 0;
		int p = energyLevels[X - 1];
		int i = 0;

		while (savedAnimals < X && i < N) {
			if (energyLevels[i] >= p) {
				savedAnimals++;
			} else {
				p = energyLevels[i];
			}
			i++;
		}

		if (savedAnimals <= X) {
			System.out.println(p);
		} else {
			System.out.println("-1");
		}

		scanner.close();
	}

	private static void reverse(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
	}

}
