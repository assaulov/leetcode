package problems;

public class LongestUncommonSubsequenceII {
    public int findLUSlength(String[] strs) {
        int result = -1;
        for (int i = 0 ,j; i <strs.length ; i++) {
            for (j = 0; j <strs.length ; j++) {
                if(i==j) continue;
                if(isSubsequence(strs[i], strs[j])) break;
            }
            if(j== strs.length) result = Math.max(result, strs[i].length());
        }
    return result;
    }

    private boolean isSubsequence(String a, String b) {
        int i =0;
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        for (int j = 0; i <aChars.length && j< bChars.length ; ++j) {
            if(aChars[i]==bChars[j]) {
                ++i;
            }
        }
        return i==aChars.length;
    }
}
