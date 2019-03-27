package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SddffggTest {

	@Test
	public void test1() {
		Sddffgg maxSumOfSubArray = new Sddffgg();
	    int maxSum = maxSumOfSubArray.maxSum(new int[]{8,2,4,1,6,7});
	    System.out.println(maxSum);
	}

	@Test
	public void test2() {
		Sddffgg maxSumOfSubArray = new Sddffgg();
	    int maxSum = maxSumOfSubArray.maxSum(new int[]{-8,2,4,1,7,9});
	    System.out.println(maxSum);
	}
	@Test
	public void test3() {
		Sddffgg maxSumOfSubArray = new Sddffgg();
	    int maxSum = maxSumOfSubArray.maxSum(new int[]{2,-8,4,1,5,6});
	    System.out.println(maxSum);
	}
	@Test
	public void test4() {
		Sddffgg maxSumOfSubArray = new Sddffgg();
	    int maxSum = maxSumOfSubArray.maxSum(new int[]{-2,-8,4,1,7,8});
	    System.out.println(maxSum);
	}
}

