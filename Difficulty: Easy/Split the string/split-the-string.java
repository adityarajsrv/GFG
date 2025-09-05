class Solution {
    static int isPossible(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        int n = map.size();
        int s = S.length();
        if(n==s && n==4) return 1;
        else if(s < 4) return 0;
        else if (n >= 10) return 1;
        else if (s >= 5 && n >= 3) return 1;
        else if (s >= 6 && n >= 2) return 1;
        else return 0;
    }
}