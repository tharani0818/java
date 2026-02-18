class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder a = new StringBuilder(num).reverse();
        StringBuilder c = new StringBuilder();
        boolean zeroPhase = true; 

        for(char b:a.toString().toCharArray()) 
        {
            if (b=='0' && zeroPhase) {
                continue;
            } 
            else
             {
                zeroPhase = false;
                c.append(b);
            }
        }

        return c.reverse().toString();
    }
}
