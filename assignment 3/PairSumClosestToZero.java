import java.util.*;

class PairSumClosestToZero {
    static public void pairSumClosestToZero(int[] arr) {
        Arrays.sort(arr);

        int start = 0, end = arr.length - 1;
        int sum = Integer.MAX_VALUE;
        int finalStart = -1;
        int finalEnd = -1;

        while(start < end) {
            if(sum > Math.abs(arr[start] + arr[end])) {
                sum = Math.abs(arr[start] + arr[end]);
                finalStart = start;
                finalEnd = end;
            }
            if(arr[start] + arr[end] == 0) {
                System.out.println("Sum = 0. Start = " + start + ", End = " + end);
                return;
            } else if(arr[start] + arr[end] < 0) {
                start ++;
            } else {
                end --;
            }
        }
        
        System.out.println("Abs of Sum = " + sum + ", Start = " + finalStart + ", End = " + finalEnd);
        
        
    }

    public static void main(String[] args) {
        int[] arr = { -100, -3, -2, 1, 77 };
        pairSumClosestToZero(arr);
    }
}