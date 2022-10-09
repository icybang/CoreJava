import java.util.Arrays;
import java.util.Scanner;

public class BadElement {

	public static void main(String[] args) {
		int cnt = 1;
		int max = 1;
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = in.nextInt();
			}

			Arrays.sort(arr);

			for (int k = 0; k < arr.length - 1; k++) {
				if (arr[k] == arr[k + 1]) {
					cnt++;
					if (cnt > max)
						max = cnt;
				} else {
					cnt = 1;
				}
			}
			System.out.println(n - max);
			max = 1;
			cnt = 1;
		}

	}

}
