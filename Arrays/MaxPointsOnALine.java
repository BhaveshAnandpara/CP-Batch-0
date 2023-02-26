package Arrays;

import java.util.*;

public class MaxPointsOnALine{

    public static int maxPoints(int[][] points) {

        if( points.length <= 1 ) return points.length;

        List<Double> arr = new ArrayList<>();
        double slope = 0;
        int max = 0;

        for (int i = 0; i < points.length; i++) {

            arr.clear();

            for (int j = 0; j < points.length; j++) {
                
                if( i == j  ) continue;
                else{

                    slope = (points[j][1] - points[i][1]) / ( double ) (points[j][0] - points[i][0]);
                    arr.add( slope );

                }


            }

            int maxCount = maxCount( arr );
            if ( maxCount > max )  max = maxCount;
            
        }

        return max;

    }

    private static int maxCount(List<Double> arr) {

        int count = 0;
        int maxCount = 0;
        Collections.sort( arr );

        System.out.println( arr );

        double prev = arr.get(0);

        for (int i = 0; i < arr.size() ; i++) {
            
            if( arr.get(i) == prev ) count++;
            else {
                prev = arr.get(i);
                if( count > maxCount ) maxCount = count;
                count = 1;
            }

        }

        if( count == arr.size() ) maxCount = count;

        System.out.println( maxCount);
        return maxCount + 1;

    }


    public static int threePointApproach( int[][] points ){

        int max = 0;

        for (int i = 0; i < points.length; i++) {
            
            for (int j = i + 1; j < points.length; j++) {

                int count = 2; // without atleast 2 point a line cannot be form so

                for (int k = j+1; k < points.length; k++) {
                    
                    int slope = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);      // y2 - y1 * x3 - x1 = y3 - y1 * x2 - x1 
                    int newSlope = (points[k][1] - points[i][1]) *( points[j][0] - points[i][0] );

                    if( newSlope == slope  ) count++;

                }

                if( count > max ) max = count;

            }

        }

        return max;

    }

    public static void main(String[] args) {

        // int[][] points = { {1,1},{2,2},{3,3} } ;
        // int[][] points = { {1,1},{2,2} } ;
        // int[][] points = { {1,1} } ;
        // int[][] points = { { 1, 1 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 4 } };
        int[][] points = { {4,5},{4,-1},{4,0} };

        System.out.println(threePointApproach(points));

    }

}