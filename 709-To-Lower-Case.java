class Solution {
    public String toLowerCase(String s) {
        StringBuilder builder= new StringBuilder();
        for(int i =0;i<s.length();i++)
        {
            if((int)s.charAt(i)>=65 &&(int) s.charAt(i)<=90){
                builder.append((char)((int)s.charAt(i)+32));
            }
            else{
                builder.append(s.charAt(i));
            }

        }
        return builder.toString();
    }
}