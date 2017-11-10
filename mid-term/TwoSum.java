class TwoSum {
    public static void twoSum(int[] arr, int sum) {
        if (arr.length == 0) return;
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if ((arr[l] + arr[r]) < sum) {
                l++;
            } else if ((arr[l] + arr[r]) > sum) {
                r++;
            } else {
                System.out.println(l + ", " + r);
                break;
            }
        }
    }
}