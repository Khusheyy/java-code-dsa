//https://leetcode.com/problems/combinations/description/
package leetcode;

import java.util.*;
public class combinations77 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }
    public  static void backtrack(int start, int n, int k, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) {
            temp.add(i);
            backtrack(i + 1, n, k, temp, result);
            temp.remove(temp.size() - 1); // backtrack so that its a recursive approach
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = combine(4,2);
        System.out.println(ans);
    }
}


