class Solution {
    public String longestCommonPrefix(String[] strs) {
  if (strs.length == 0) return "";

  String prefix = strs[0];

  for (int i = 1; i < strs.length; i++) {
    while (strs[i].indexOf(prefix) != 0) { 
      prefix = prefix.substring(0, prefix.length() - 1); 
      if (prefix.isEmpty()){
       return ""; 
      }
    }
  }

  return prefix;
}

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower", "flow", "flight"};

        String longestPrefix = solution.longestCommonPrefix(strs);
        if (longestPrefix.isEmpty()) {
            System.out.println("There is no common Prefix.");
        } else {
            System.out.println("Longest Common Prefix: " + longestPrefix);
      

    }
    }
    }