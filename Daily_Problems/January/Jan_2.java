class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int[] prefix= prefixArray(words);
        int result[]= new int[queries.length];

        for(int i=0;i<queries.length;i++){

            int start=queries[i][0];
            int end=queries[i][1];

            if(start==0){
                result[i]=prefix[end];
            }else{
                result[i]=prefix[end]-prefix[start-1];
            }
        }
        return result;
        }
    


         public boolean isValid(String word){
            return isVowel(word.charAt(0))&& isVowel(word.charAt(word.length()-1));
        }

         public boolean isVowel(char c){
            return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
        }

        //prefix array
        public int[] prefixArray(String[] words){
            int[] prefix= new int[words.length];
            int count=0;

            for(int i=0;i<words.length;i++)
            {
                if(isValid(words[i])){
                    count++;

                }
                prefix[i]=count;
            }

            return prefix;
        }
}
        
