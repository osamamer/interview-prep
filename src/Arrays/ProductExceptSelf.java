package Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] preProduct = new int [nums.length];
        int [] postProduct = new int [nums.length];
        int [] result = new int [nums.length];
        int currentPre = 1;
        int currentPost = 1;
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) { // YOU FORGOT THE j--!!!!!
            preProduct[i] = currentPre;
            postProduct[j] = currentPost;

            currentPre *= nums[i];
            currentPost *= nums[j];

        }
        for (int i = 0; i < result.length; i++) {
            result[i] = preProduct[i] * postProduct[i];
        }
        return result;
    }
}
