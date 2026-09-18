import java.util.*;


public class FourSum {
    public List<List<Integer>> bonSum(int[] nums ){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length ;
        for ( int j =0 ; j < len -3 ; j++){
            if (j > 0 && nums[j] == nums[j - 1]) continue;
            for ( int i =j+1 ; i <  len -2 ; i++ ){
                if ( i > j+1 && nums[i-1] == nums[i]) continue ;
                int left = i+1 ;
                int right = len-1 ;
                while ( left < right ){
                    long sum = (long) nums[i] + nums[left] + nums[right] + nums[j];
                    if ( sum == 0){
                        ans.add(Arrays.asList(nums[j], nums[i], nums[left], nums[right]));
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
            }
        
        return ans;
    }   
public static void main(String[] args) {
        FourSum solver = new FourSum();
        int[] nums = {-1, 0, 1, 2, -1, -4, -2};
        List<List<Integer>> result = solver.bonSum(nums);
        System.out.println(result);
}     
}
