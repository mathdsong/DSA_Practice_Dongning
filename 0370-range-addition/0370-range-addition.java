// method1-trivial:
class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        for (int i = 0; i < updates.length; i++) {
            int start = updates[i][0];
            int end = updates[i][1];
            int change = updates[i][2];
            for (int j = start; j <= end; j++) {
                res[j] += change;
            }
        }
        return res;
    }
}


