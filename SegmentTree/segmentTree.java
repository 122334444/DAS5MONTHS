package SegmentTree;

public class segmentTree {

    public static class SegmentTree {

        int tree[];
        int arr[];

        SegmentTree(int ar[]) {
            arr = ar;
            tree = new int[4 * arr.length];
            build(1, 0, arr.length - 1);
        }

        private void build(int node, int st, int end) {
            if (st == end) {
                tree[node] = arr[st];
            } else {
                int mid = (st + end) / 2;
                int left = node * 2;
                int right = node * 2 + 1;
                build(left, st, mid);
                build(right, mid + 1, end);
                tree[node] = Math.max(tree[left], tree[right]);
            }
        }

        private int query(int node, int st, int end, int l, int r) {

        }

        int query(int l, int r) {

        }
    }

    public static void main(String args[]) throws Exception {

    }
}
