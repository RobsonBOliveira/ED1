package LeetCode.MoveZerous;

public class Main {
    public static void main(String[] args) {
        int [] nums = {0, 0, 1};
        moveZerous(nums);
        exibeVet(nums);
    }
    public static void moveZerous(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] != 0)
                nums[j++] = nums[i];
        }
        for(int i=j; i<n; i++){
            nums[i] = 0;
        }
    }
    public void moveZeroes2(int[] nums) {
        int n = nums.length;
        int cont = 0;

        for(int i = 0; i < n; i++) {
            if (nums[i] == 0)
                cont++;
        }
        if(nums[n - 1] == 0)
            cont--;
        while(cont > 0){
            for(int i=0; i < n; i++) {
                if(nums[i] == 0){
                    int j = i;
                    while(j < n-1){
                        nums[j] = nums[j+1];
                        j++;
                    }
                    nums[n-1] = 0;
                    cont--;
                }
            }
        }
    }
    public static void exibeVet(int [] nums) {
        for(int l = 0; l <nums.length; l++)
            System.out.print(nums[l] + " ");
        System.out.println();
    }
}
