//Given three integer arrays sorted in ascending order, have to find the smallest number that is common in all three arrays.
class leastCommonNumber {
    static int find_least_common_number(int[] arr1, int[] arr2, int[] arr3) {
        // TODO: Write - Your - Code
        int p = 0, q = 0, r = 0;

        while (p < arr1.length && q < arr2.length && r < arr3.length) {
            if (arr1[p] == arr2[q] && arr2[q] == arr3[r]) {
                return arr1[p];
            }
            if (arr1[p] >= arr2[q] && arr2[q] <= arr3[r]) {
                q++;
            } else if (arr1[p] >= arr3[r] && arr2[q] >= arr3[r]) {
                r++;
            } else if (arr1[p] <= arr2[q] && arr1[p] <= arr3[r]) {
                p++;
            }
        }
        return -1; // Replace with actual smallest common value
    }
}
