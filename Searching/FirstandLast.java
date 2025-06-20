package Searching;
public class FirstandLast {
    public static int bSearch(int arr[], int target, boolean isLeft) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;

                if (isLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 5, 5, 6, 7, 7, 7, 7, 9 };

        int target = 7;

        int arr[] = { -1, -1 };

        int right = bSearch(a, target, false);
        int left = bSearch(a, target, true);

        arr[0] = left;
        arr[1] = right;

        System.out.println(arr[0] + " " + arr[1]);

    }
}
