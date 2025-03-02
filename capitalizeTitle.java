//leetcode-2129
class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder result = new StringBuilder();
        String[] words = title.split(" ");

        for (String word : words) {
            if (word.length() > 2) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase());
            } else {
                result.append(word.toLowerCase());
            }
            result.append(" ");
        }

        return result.toString().trim(); 
    }
}

