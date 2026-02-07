class Solution {
    public static void main (String [] args) {
        boolean increasing = true;
        boolean decreasing = true;
            int nums[] = {1,2,3,5,7,8,9,8};
        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] > nums[i + 1]) {
                increasing = false;
            }
            
            if(nums[i] < nums[i + 1]) {
                decreasing = false;
            }
        }

      System.out.println(increasing || decreasing);
    }
}
