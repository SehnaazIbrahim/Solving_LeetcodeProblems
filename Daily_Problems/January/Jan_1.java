class Solution {
     // Method to calculate the maximum score
    public int maxScore(String s) {
        // Step 1: Count total ones
        int totalOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }

        // Step 2: Track zeros in left and ones in right dynamically
        int countLeftZeros = 0;
        int countLeftOnes = 0;
        int maxScore = 0;

        // Step 3: Loop to calculate the score for each split
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                countLeftZeros++;
            } else {
                countLeftOnes++;
            }

            // Calculate right ones dynamically
            int rightOnes = totalOnes - countLeftOnes;

            // Calculate score and update the maximum score
            int score = countLeftZeros + rightOnes;
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}
