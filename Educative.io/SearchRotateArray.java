class searchRotated {
    static int binary_search_rotated(int[] arr, int key) {
        // TODO: Write - Your - Code
        return binarySearch(arr, key, 0, arr.length - 1);
    }

    static int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high)
            return -1;
        int mid = low + ((high - low) / 2);
        if (arr[mid] == key) {
            return mid;
        }
        // if it in sorted part
        if (arr[low] <= arr[mid] && arr[low] <= key && key <= arr[mid]) {
            return binarySearch(arr, key, low, mid - 1);
        } else if (arr[low] <= arr[high] && arr[mid] < key && key <= arr[high]) {
            return binarySearch(arr, key, mid + 1, high);
        } else if (arr[low] >= arr[mid] && arr[mid] < key) {
            return binarySearch(arr, key, low, mid - 1);
        } else if (arr[high] <= arr[mid]) {
            return binarySearch(arr, key, mid + 1, high);
        }
        // System.out.print(mid);
        return -1;
    }
}