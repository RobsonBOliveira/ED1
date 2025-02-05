package LeetCode.MissingNumber;

public class Main {
    public static void main(String[] args) {
        int [] nums = {0, 3, 2};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int missingNumber = 0;
        boolean isMissing = true;
        for (int i = 0; i <= nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i == nums[j]) {
                    isMissing = false;
                    break;
                }
                else{
                    isMissing = true;
                }
            }
            if(isMissing) {
                missingNumber = i;
                break;
            }
            }
        return missingNumber;
        }
    }
