class Solution {
    public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int ans = 0;
        
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n + 1; j ++) {
//                 if (allUnique(s, i , j)) ans = Math.max(ans, j - i);
//             }
//         }
//         return ans;
//     }
        
        
        
//     public boolean allUnique(String s, int start, int end) {
//         Set<Character> set = new HashSet();

//         for (int i = start; i < end; i++) {
//             Character ch = s.charAt(i);
//             if (set.contains(ch)) return false;
//             set.add(ch);
//         }

//         return true;
//     }
        
//         int n =s.length();
//         Set<Character> set = new HashSet();
//         int ans = 0, i = 0, j = 0;
        
//         while (i < n && j < n) {
// //             try to extend the range [i,j]
//             if (!set.contains(s.charAt(j))) {
// //                 add j to window
//                 set.add(s.charAt(j++));
                
//                 ans = Math.max(ans, j - i);
//             } else {
// //                 move i to right if s[j] is already in the HashSet
//                 set.remove(s.charAt(i++));
//             }
            
            
//         }
        
        
//         return ans;
        
        int n = s.length(), ans = 0;
//         index from 1++
        Map<Character, Integer> map = new HashMap<>();
        
        for (int j = 0, i = 0; j < n; j++) { 
            if (map.containsKey(s.charAt(j))) {
//                 skip chars then increase i to j+1
                i = Math.max(map.get(s.charAt(j)), i);
            }
            
            ans = Math.max(ans, j-i+1);
            
            map.put(s.charAt(j), j + 1);
        }
        
        return ans;
    }
    
}
