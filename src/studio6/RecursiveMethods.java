package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
			if (n == 0) {
				return 0;
			} else {
				return Math.pow(0.5, n) + geometricSum(n-1);
			}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] reversedArray = new int [array.length];
		return reversed(array,reversedArray, (array.length)/2);
		
	}
	public static int[] reversed(int[] array, int[] reversedArray, int index) {
		if (index == 0) {
			reversedArray[0]=array[0];
			return reversedArray;
		} else {
			return reversed(array, reversedArray, index-1);
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		StdDraw.circle(xCenter, yCenter, radius);
		radius = radius / 3;
		if(radius > radiusMinimumDrawingThreshold) {
			circlesUponCircles( xCenter + 3 * radius,  yCenter,  radius, radiusMinimumDrawingThreshold);
			circlesUponCircles( xCenter,  yCenter + 3 * radius,  radius, radiusMinimumDrawingThreshold);
			circlesUponCircles( xCenter - 3 * radius,  yCenter,  radius, radiusMinimumDrawingThreshold);
			circlesUponCircles( xCenter,  yCenter - 3 * radius,  radius, radiusMinimumDrawingThreshold);
		}
	}

}
