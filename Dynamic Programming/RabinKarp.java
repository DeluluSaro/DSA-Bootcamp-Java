public class RabinKarp {

    // Prime number for hashing to reduce collisions
    static final int PRIME = 101;

    // Rabin-Karp function to search pattern in text
    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if (m > n) return -1; 

        long patternHash = createHash(pattern, m);
        long textHash = createHash(text, m);

        for (int i = 0; i <= n - m; i++) {
            // If hash matches, check the substring characters
            if (patternHash == textHash && text.substring(i, i + m).equals(pattern)) {
                return i; // Match found at index i
            }

            // Recalculate hash for next window
            if (i < n - m) {
                textHash = recalculateHash(text, i, i + m, textHash, m);
            }
        }

        return -1; // Pattern not found
    }

    // Create initial hash value for a string of length m
    private static long createHash(String str, int m) {
        long hash = 0;
        for (int i = 0; i < m; i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    // Recalculate hash by removing left char and adding right char
    private static long recalculateHash(String str, int oldIndex, int newIndex, long oldHash, int m) {
        long newHash = oldHash - str.charAt(oldIndex);
        newHash = newHash / PRIME;
        newHash += str.charAt(newIndex) * Math.pow(PRIME, m - 1);
        return newHash;
    }

    // Test the algorithm
    public static void main(String[] args) {
        String text = "hello this is a simple test";
        String pattern = "simple";

        int index = search(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found.");
        }
    }
}
