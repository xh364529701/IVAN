
package test;

import org.junit.Test;

public class Sddffgg {
    
    public int maxSum(int[] a) {

        int maxsum = a[0], b = 0;

        for (int i = 0; i < a.length; i++) {
            int x = a[i];

            if (b >= 0) {
                b += x;
            } else {
                b = x;
            }

            if (b > maxsum) {
                maxsum = b;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
    	Sddffgg maxSumOfSubArray = new Sddffgg();
        int maxSum = maxSumOfSubArray.maxSum(new int[]{3, -2, 4, 10, -6, 8, -5, -7});
        System.out.println(maxSum);
    }
    
  
}