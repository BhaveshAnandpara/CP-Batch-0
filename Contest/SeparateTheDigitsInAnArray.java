package Contest;

import java.util.*;

public class SeparateTheDigitsInAnArray {

    public static int[] separateDigits(int[] nums) {
        
        List<Integer> answer = new ArrayList<>();
        
        for( int i = 0 ; i < nums.length ; i++){
            
            int n = nums[i];
            int len = (int)Math.floor( Math.log10( n ) + 1 ) ;
                
            for (int j = len - 1; j >= 0; j--) {
                                
                answer.add( n/ (int)Math.pow( 10 , j ) );
                
                n = n % (int)Math.pow( 10 , j );   
                if( n < 0  ) break;
                
            }
        }
        
        
        int[] ans =  answer.stream().mapToInt(i->i).toArray();

        return ans;
        
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = {13,25,83,77};

        System.out.println( separateDigits(nums) );

        sc.close();
        
    }
    
}
