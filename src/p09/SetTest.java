package p09;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> set =new HashSet<>();
		System.out.println(set.size());// Set은 값이 중복되면 안넣어줌
		set.add(0);
		set.add(1);
		set.add(1);
		System.out.println(set.size());
	}
}
