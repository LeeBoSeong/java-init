package p09;

public class SortTest2 {
	public static void main(String[] args) {
		int[] nums = new int[] {10,18,35,17,4};
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				}
			}
			System.out.println(nums[i]);
		}
	}
}
// 완성하자