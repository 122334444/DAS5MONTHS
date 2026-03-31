package DP.dpOneDimention;

///You are climbing a staircase. It takes n steps to reach the top. 
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class climbingStairs {
    public static int climbStairs(int n) {
        int a[] = new int[n + 1];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

    public static int climbStarirRec(int idx) {
        if (idx == 0)
            return 1;
        if (idx == -1)
            return 0;// if we are at 1 and calling for idx-2
        int l = climbStarirRec(idx - 1);
        int r = climbStarirRec(idx - 2);
        return l + r;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(climbStairs(n));
        System.out.println(climbStarirRec(n));
    }
}
