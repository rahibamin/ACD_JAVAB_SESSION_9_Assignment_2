package Session9.Assignments2;

import java.util.HashSet;

public class unionSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intSet1 = { 1, 2, 3, 4, 5 };
		int[] intSet2 = { 6, 7, 8, 9, 10 };

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();

		for (int i = 0; i < intSet1.length; i++) {
			set1.add(intSet1[i]);
		}
		for (int i = 0; i < intSet2.length; i++) {
			set2.add(intSet2[i]);
		}

		set1.addAll(set2);
		System.out.println(set1);
	}

}
