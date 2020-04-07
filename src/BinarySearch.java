public class BinarySearch {
    public static boolean binarySearch(int[] arr, int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return true;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid - 1, value);
            return binarySearch(arr, mid + 1, high, value);
        }
        return false;
    }

}
