import java.util.*;

class Solution {
    public int shortestMatchingSubstring(String s, String p) {
        int n = s.length();
        String[] parts = p.split("\\*", -1);
        // parts should have length 3: a, b, c
        String a = parts[0], b = parts[1], c = parts[2];

        List<int[]> aOcc = a.isEmpty() ? null : kmpSearch(s, a);
        List<int[]> bOcc = b.isEmpty() ? null : kmpSearch(s, b);
        List<int[]> cOcc = c.isEmpty() ? null : kmpSearch(s, c);

        int ans = Integer.MAX_VALUE;

        if (b.isEmpty()) {
            // pattern is a**c, need a before c (or empty)
            if (a.isEmpty() && c.isEmpty()) return 0;
            if (a.isEmpty()) {
                // just need c
                if (cOcc.isEmpty()) return -1;
                // shortest is length of c itself (start=0? no, must contain c)
                // actually a is empty, so substring is just c at earliest... any occurrence
                // shortest is min over c occurrences of length of c = c.length()
                // but we could pick any c occurrence, all same length
                return c.length();
            }
            if (c.isEmpty()) {
                if (aOcc.isEmpty()) return -1;
                return a.length();
            }
            // both non-empty, a before c
            // for each c occurrence, find latest a ending before c.start
            // cOcc sorted by start
            int best = Integer.MAX_VALUE;
            for (int[] co : cOcc) {
                // find latest a with end <= co[0]
                // aOcc sorted by start, binary search
                int lo = 0, hi = aOcc.size() - 1, idx = -1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if (aOcc.get(mid)[1] <= co[0]) { idx = mid; lo = mid + 1; }
                    else hi = mid - 1;
                }
                if (idx >= 0) {
                    best = Math.min(best, co[1] - aOcc.get(idx)[0]);
                }
            }
            return best == Integer.MAX_VALUE ? -1 : best;
        }

        // b non-empty
        for (int[] bo : bOcc) {
            int sb = bo[0], eb = bo[1];
            int startA, endC;

            if (a.isEmpty()) {
                startA = sb;
            } else {
                // latest a with end <= sb
                int lo = 0, hi = aOcc.size() - 1, idx = -1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if (aOcc.get(mid)[1] <= sb) { idx = mid; lo = mid + 1; }
                    else hi = mid - 1;
                }
                if (idx < 0) continue;
                startA = aOcc.get(idx)[0];
            }

            if (c.isEmpty()) {
                endC = eb;
            } else {
                // earliest c with start >= eb
                int lo = 0, hi = cOcc.size() - 1, idx = -1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if (cOcc.get(mid)[0] >= eb) { idx = mid; hi = mid - 1; }
                    else lo = mid + 1;
                }
                if (idx < 0) continue;
                endC = cOcc.get(idx)[1];
            }

            ans = Math.min(ans, endC - startA);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private List<int[]> kmpSearch(String s, String pat) {
        List<int[]> res = new ArrayList<>();
        if (pat.isEmpty()) return res;
        int n = s.length(), m = pat.length();
        int[] lps = new int[m];
        for (int i = 1, len = 0; i < m; ) {
            if (pat.charAt(i) == pat.charAt(len)) lps[i++] = ++len;
            else if (len > 0) len = lps[len - 1];
            else lps[i++] = 0;
        }
        for (int i = 0, j = 0; i < n; ) {
            if (s.charAt(i) == pat.charAt(j)) { i++; j++; }
            if (j == m) {
                res.add(new int[]{i - m, i});
                j = lps[j - 1];
            } else if (i < n && s.charAt(i) != pat.charAt(j)) {
                if (j > 0) j = lps[j - 1];
                else i++;
            }
        }
        return res;
    }
}
