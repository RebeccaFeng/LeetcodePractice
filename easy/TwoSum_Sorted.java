package easy;

public class TwoSum_Sorted {
	
	public int[] twoSum(int[] numbers, int target) {
		int a[] = new int[2];
		int len = numbers.length;
		int index_1 = 0, index_2 = len - 1;
		int flag = 0;
		
		while(index_1 < index_2) {
			if(numbers[index_1] + numbers[index_2] > target) {
				index_2 --;
			}
			else if(numbers[index_1] + numbers[index_2] < target) {
				index_1 ++;
			}
			else {
				a[0] = index_1 + 1;
				a[1] = index_2 + 1;
				break;
			}
		}
		return a;
	}

}
