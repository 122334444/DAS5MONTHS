package DP;

public class subsetSuMTarget {
    private static boolean subSum(int arr[], int idx, int target, Boolean dp[][]) {

        if (target == 0)
            return true;
        if (idx == 0)
            return arr[0] == target;

        if (dp[idx][target] != null)
            return dp[idx][target];
        // not pick
        boolean notPick = subSum(arr, idx - 1, target, dp);
        // pick
        boolean pick = false;
        if (target >= arr[idx]) {
            pick = subSum(arr, idx - 1, target - arr[idx], dp);
        }
        // not pick

        return dp[idx][target] = (pick || notPick);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5, 3, 6, 8, 2 };
        int n = arr.length;
        int target = 7;
        Boolean dp[][] = new Boolean[n][target + 1];
        System.out.println(subSum(arr, n - 1, target, dp));
    }
}
