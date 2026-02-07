class Solution {
    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3) {
            return false;
        }

        boolean increasing = true;
        boolean decreasing = true;

        int peakIndex = -1;

        // Step 1: Find Peak Index
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                peakIndex = i + 1;
            }
        }

        // Peak must not be first or last
        if (peakIndex <= 0 || peakIndex >= arr.length - 1) {
            return false;
        }

        // Step 2: Check increasing before peak
        for (int i = 0; i < peakIndex; i++) {
            if (arr[i] >= arr[i + 1]) {
                increasing = false;
            }
        }

        // Step 3: Check decreasing after peak
        for (int i = peakIndex; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                decreasing = false;
            }
        }

        return increasing && decreasing;
    }
}
