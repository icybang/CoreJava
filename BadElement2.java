import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class BadElement2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] arr1 = new int[n];
			ArrayList<Integer> arr = new ArrayList<>();

			for (int i1 = 0; i1 < n; i1++) {
				arr1[i1] = in.nextInt();
				arr.add(arr1[i1]);

			}

			Hashtable<Integer, Integer> map = new Hashtable<>();
			for (int key : arr1) {
				if (map.containsKey(key)) {
					int occurance = map.get(key);
					occurance++;
					map.put(key, occurance);
				} else {
					map.put(key, 1);
				}

			}
//			for (Integer key : map.keySet()) {
//				int occurance = map.get(key);
//				System.out.println(key + " occure " + occurance + " times");
//			}
			int max = 0;
			int maxkey = 0;
			for (Integer key : map.keySet()) {
				if (max < map.get(key)) {
					max = map.get(key);
					maxkey = key;
				}
			}
			for (int i1 = 0; i1 < arr1.length; i1++) {
				if (arr1[i1] == maxkey)
					if (arr.contains(arr1[i]))

						arr.remove(arr.indexOf(arr1[i1]));

			}
			System.out.println();
			System.out.println(arr.size());
		}

	}

}
