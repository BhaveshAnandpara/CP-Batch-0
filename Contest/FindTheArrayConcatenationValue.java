package Contest;
// https://leetcode.com/contest/weekly-contest-332/problems/find-the-array-concatenation-value/

public class FindTheArrayConcatenationValue {

    public static long findTheArrayConcVal(int[] nums) {
        
        long sum = 0;
        int len = 0;
        int numsLen = nums.length;

        int start = 0;
        
        while( start <= ( numsLen - start - 1 ) ){

            len =  (int)Math.floor( Math.log10( nums[ numsLen - start - 1 ] ) ) + 1 ;
            
            if( start != (numsLen - start - 1) )
            sum += ( nums[ start ] * Math.pow( 10, len ) ) + nums[ numsLen - start - 1 ] ;

            else
                sum += nums[start];

            start++;

        }
        

        
        return sum;
        
    }

    public static void main(String[] args) {

        int[] nums = {5,14,13,8,12};

        System.out.println( findTheArrayConcVal(nums) );
        
    }
    
}
