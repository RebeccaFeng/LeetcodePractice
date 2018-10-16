package easy;

import java.util.HashMap;
import java.util.Map;

class Solution{
	public int[] twoSum(int[] numbers, int target){
		
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for(int i = 0; i < numbers.length; i++) {
//			map.put(numbers[i], i);
//		}
//		
//		for(int i = 0; i < numbers.length; i++) {
//			int y = target - numbers[i];
//			if(map.containsKey(y)) {
//				return new int[] {i+1, map.get(y) + 1};
//			}
//		}
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], i);
		}
		
		int j = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > target)
				break;
			else
				j = i;
		}
		
		for(int i = 0; i < j; i++) {
			int y = target - numbers[i];
			if(map.containsKey(y)) {
				return new int[] {i+1, map.get(y) + 1};
			}
		}

		return new int[2];

	}
}

public class TwoSum_InputSorted {

}
