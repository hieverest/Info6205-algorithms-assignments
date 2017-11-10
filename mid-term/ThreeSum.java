class ThreeSum {
    public static void threeSum(int[] arr, int k) {
        if (arr.length == 0) return;
        for (int i = 0; i <arr.length - 2; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if ( sum == k) {
                    System.out.println(i + ", " + l + ", " + r);
                    System.out.println();
                    break;
                } else if (sum < k) {
                    l++;
                } else {
                    r--;
                }
            }
        }
    }
}