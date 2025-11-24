package array2;

/**
 * CodingBat - Array-2: has22
 *
 * Return true if the array contains a 2 next to another 2.
 */
public class Has22 {

    public boolean has22(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 2) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Has22 h = new Has22();

        System.out.println(h.has22(new int[]{1, 2, 2}));       // true
        System.out.println(h.has22(new int[]{1, 2, 1, 2}));    // false
        System.out.println(h.has22(new int[]{2, 2}));          // true
        System.out.println(h.has22(new int[]{2, 1, 2}));       // false
        System.out.println(h.has22(new int[]{1, 3, 2}));       // false
    }
}
