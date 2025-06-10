package leetcode;

public class _3442 {

        public int maxDifference(String s) {
            int[] arr = new int[26];
            for (char c : s.toCharArray()) arr[c - 'a']++;

            int maxOdd = Integer.MIN_VALUE;
            int maxEven = Integer.MAX_VALUE;
            for (int i = 0; i < 26; i++) {
                if (arr[i] > 0) { // non-zero element
                    if(arr[i] % 2 != 0) maxOdd = Math.max(maxOdd, arr[i]);
                    else maxEven = Math.min(maxEven, arr[i]);
                }
            }
            return maxOdd - maxEven;
        }

}
