class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();


        for(int i = 0; i< expected.length-1;i++){
            for(int j=0;j<expected.length-i-1;j++){
                //swap
                if(expected[j]>expected[j+1]){
                    int temp=expected[j];
                    expected[j]=expected[j+1];
                    expected[j+1]=temp;

                }
               

            }               
            
        }
        int notmatched=0;
        for(int index=0;index<heights.length;index++){
            if(heights[index] != expected[index]){
                notmatched++;
            }
        }
        return notmatched;

    

    }
}
