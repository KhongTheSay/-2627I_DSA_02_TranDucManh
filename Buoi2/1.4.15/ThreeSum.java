import java.util.*;


public class ThreeSum {
    public List<List<Integer>> baSum(int[] nums ){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length ;
        for ( int i =0 ; i < len -2 ; i++ ){
            if( nums[i] > 0 ) break ;
            if ( i > 0 && nums[i-1] == nums[i]) continue ;
            int left = i+1 ;
            int right = len-1 ;
            while ( left < right ){
                int sum = nums[i] + nums[left] + nums[right];
                if ( sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while ( left < right && nums[left] == nums[left+1]) left++;
                    while ( left < right && nums[right] == nums[right -1]) right--;
                    left++;
                    right--;
                } else {
                    if ( sum < 0 ) left++;
                    else right--;
                }
            }
        }
        return ans;
    }   
public static void main(String[] args) {
        ThreeSum solver = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solver.baSum(nums);
        System.out.println(result);
}     
}

