import java.util.*;

public class TwoSum{
    public List<List<Integer>> haiSum(int[] nums ){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length-1 ;
            int left = 0;
            int right = len ;
            while ( left < right ){
                int sum = nums[left] + nums[right];
                if ( sum ==0){
                    ans.add(Arrays.asList(nums[left],nums[right]));
                    left++;
                    right--;
                }
                else {
                    if ( sum > 0){
                        right--;
                    } else { left++;}
                }
            }
            return ans;
    }

public static void main(String[] args ){
        TwoSum solver = new TwoSum();
        int[] nums = {-1, 0, 1, 2, -1, -4, 4};
        List<List<Integer>> result = solver.haiSum(nums);
        System.out.println(result);

}
}



