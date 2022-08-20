import java.util.Arrays;

public class Day9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        // Using == operator
        if (arr1 == arr2) 
            System.out.println("Same");
        else
            System.out.println("Not same");
        
        // using equals method of Arrays
        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
        
        //using equals on array
        if (arr1.equals(arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
	}

}
