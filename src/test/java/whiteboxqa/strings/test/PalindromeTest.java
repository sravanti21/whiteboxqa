package whiteboxqa.strings.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import whiteboxqa.strings.Palindrome;



	public class PalindromeTest {
		@BeforeClass
		public void beforeAllTests(){
			System.out.println("I will be printing before all tests ");
		}
		
		@Test
		public void basicTest(){
			boolean result = Palindrome.isPalindrome("malayalam");
			Assert.assertEquals(true, result);
		}
		@Test
		public void negativeTest(){
			boolean result = Palindrome.isPalindrome("cosmic");
			Assert.assertEquals(false, result);			
		}
		@Test
		public void capitaltest(){
		boolean result = Palindrome.isPalindrome("Malayalam");
		Assert.assertEquals(false, result);
		}
	
	}
