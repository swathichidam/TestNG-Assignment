package Calculator_Assertion;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import Calculator_App.*;



public class assertion_function extends GetandSet 
{
	@BeforeClass(alwaysRun=true)
	public void openApp() {
	
		Reporter.log("Calculator app has been intiated successfully \n", true); }
	@Test
	public void TestAssert() {

		// ---------------- Calc operations ------------------//

		int IntSum = GetObjSum().sum(10,55);
		Float FloatSum = (float) GetObjSum().sum(22.50,55.25);
		double IntSub = GetObjDiff().sub(99.99,10.10);
		int IntMul = GetObjMul().mul(25,2);
		double FloatDiv = GetObjDiv().div(100.00,10.00);
		int intDiv = GetObjDiv().div(90,9);
		Assert.assertEquals(IntSum, 65);
		System.out.println("1. Assertion equal condition has been used for sum operation");
		Assert.assertTrue(FloatSum != 100);
		System.out.println("2. Assertion true condition has been used for float sum operation");
		Assert.assertFalse(FloatDiv == 2, "False condition");
		System.out.println("3. Assertion true condition has been used for Float Div operation");
		Assert.assertNotSame(IntMul, 2, "The Values are not same");
		System.out.println("4. Assertion Not Same has been used for Int Mul operation");
		Assert.assertNotNull(FloatDiv);
		System.out.println("5. Assert Not Null has been used for Float Div operation");
		Assert.assertSame(intDiv , 10, "The Values are same");
		System.out.println("6. Assertion Same has been used for Int Div operation");
		
}
	@AfterClass
	public void closeApp() {
		Reporter.log("\n Assertion has been completed for calculator app ", true);
	}}