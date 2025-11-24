package array2;

/**
 * CodingBat - Array-2: sum67
 */
public class Sum67 {

    public int sum67(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 6){
                while(nums[i] != 7){
                    i++;
                }
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum67 s = new Sum67();

        System.out.println(s.sum67(new int[]{1, 2, 2}));               // 5
        System.out.println(s.sum67(new int[]{1, 2, 2, 6, 99, 99, 7})); // 5
        System.out.println(s.sum67(new int[]{1, 1, 6, 7, 2}));         // 4
        System.out.println(s.sum67(new int[]{6, 7, 1, 6, 7}));         // 1
    }
}
