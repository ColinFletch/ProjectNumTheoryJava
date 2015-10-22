/**
 * 
 */
package com.colinOrg.numberTheory;

/**
 * @author cfletch
 *
 */
public class squareDiffSum {

		/**
		 * @Author: Colin Fletcher
		 * Sum square difference
			The sum of the squares of the first ten natural numbers is,
			12 + 22 + ... + 102 = 385
			
			The square of the sum of the first ten natural numbers is,
			(1 + 2 + ... + 10)2 = 552 = 3025
			
			Hence the difference between the sum of the squares of the 
			first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
			Find the difference between the sum of the squares of 
			the first one hundred natural numbers and the square of the sum.
				 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int sumToBeSquared = 0;
			int squareToBeSummed = 0;
			for (int i=0; i<=100; i++) {
				sumToBeSquared += i;
				squareToBeSummed += (i*i);
			}
			System.out.println((sumToBeSquared * sumToBeSquared));
			System.out.println(squareToBeSummed);
			System.out.println((sumToBeSquared*sumToBeSquared)-squareToBeSummed);
		}

	}
