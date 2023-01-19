public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
      int count=0;
            while(n!=0){
        int last_bit= n & 1; //Stores the value of the last bit of the number n i.e.(1 or 0)
                count+= last_bit; // adds 0 if last bit is 0 and adds 1 if last bit is 1 
                n = n>>>1;  //Dropping the last bit of the binary number n 
            }
            return count;
    }
}