package TwoSum;

import java.util.HashMap;
import java.util.Map;
//Starting out easy ;)
public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,2,7,11,15};
		int target = 18;
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i =0; i < nums.length; i++) {
			
			if(map.containsKey(target-nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				for (int j = 0; j < result.length;j++) {
					System.out.println(result[j]);
				}
				System.out.print(result.toString());
			}
			
			map.put(nums[i], i);
			
		}

	}

}
