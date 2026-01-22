
class Missingarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};  // 5 is missing

        int n = 6; // last number should be 6

        int totalSum = n * (n + 1) / 2;  // sum of 1 to 6 = 21
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int missing = totalSum - arrSum;

        System.out.println("Missing number is: " + missing);
    }
}
