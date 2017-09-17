class Solution {
    /*
     * @param k : kth largest number
     * @param arr : array of nums
	 * @param i : start index of arr
	 * @param j ; ending index of arr
     * @return: description of return
     */
    
    
    public int findKthLargestNum(int[] arr, int i, int j, int k) {
        int targetIdx = arr.length - k;
        if(i < j) {
            int pos = partition(arr, i, j);
            if( pos < targetIdx) {
                return findKthLargestNum(arr, pos+1, j, k);
            } else if( pos > targetIdx ) {
                return findKthLargestNum(arr, i, pos-1, k);
            } else {
                return arr[pos];
            }
        }
        return arr[i];
    }
    
    private int partition(int[] arr, int i, int j) {
        int pivot = arr[j];
        int wall = i - 1;
        for (int k = i; k < j; k++) {
            if (arr[k] <= pivot) {
                wall++;
                swap(arr, k, wall);
            }
        }
        swap(arr, j, wall + 1);
        return wall + 1;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
};