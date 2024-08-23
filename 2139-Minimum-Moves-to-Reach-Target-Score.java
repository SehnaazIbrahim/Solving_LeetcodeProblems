class Solution {
    public int minMoves(int target, int maxDoubles) {
        return helper(target,maxDoubles,0);
    }
    public int helper(int target,int maxDoubles,int c){
        if(target==1){
            return c;
        }
        else{
            //if maxDouble is over, we have to add for the remaining number
            if(maxDoubles==0){
                return c+(target-1);
            }
            if(target%2==0){
                return helper(target/2,maxDoubles-1,c+1);
            }
            //if target is odd
                return helper(target-1,maxDoubles,c+1);

        }
    }
}