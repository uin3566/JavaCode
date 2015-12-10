/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

import java.lang.Math; 
import java.util.Map;
import java.util.HashMap;
 
public class MaxPoints {
    /**
     * @param points an array of point
     * @return an integer
     */
    public int maxPoints(Point[] points) {
        // Write your code here
        int max = 0;
		double slopeVertical = Double.MAX_VALUE;

		if (points == null){
			return max;
		}

        for (int i = 0; i < points.length; i++){
        	Point start = points[i];
        	int same = 1;
        	Map<Double, Integer> slopeMap = new HashMap<>();
        	
        	for (int j = i + 1; j < points.length; j++){
        		Point end = points[j];
        		if (start.x == end.x && start.y == end.y){
        			same++;
        		} else {
        			double slope;
        			if (start.x - end.x == 0){
        				slope = slopeVertical;
        			} else {
						slope = (double)(end.y - start.y) / (double)(end.x - start.x);
					}
					if (slopeMap.containsKey(slope)){
						slopeMap.put(slope, slopeMap.get(slope) + 1);        			
        			} else {
        				slopeMap.put(slope, 1);
        			}
        		}
        	}
        	
 			int maxInMap = 0;
        	for (Integer value : slopeMap.values()){
        		if (maxInMap < value) {
        			maxInMap = value;
        		}
        	}
        	
        	max = Math.max(max, maxInMap + same);
        }
        
        return max;
    }
    
}