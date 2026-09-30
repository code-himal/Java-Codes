public class ransom_note {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Use characters for ransomNote
        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;

            // Not enough characters
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println(canConstruct(ransomNote, magazine));
    }
}