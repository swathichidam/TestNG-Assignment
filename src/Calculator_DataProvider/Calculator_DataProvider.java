package Calculator_DataProvider;

import org.testng.annotations.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Calculator_App.GetandSet;
	

	public class Calculator_DataProvider extends GetandSet {

		@DataProvider(name="int values")
		public Object[][] IntData() {
			return new Object[][] {
				{10,5},
				{50.2,20.8},
				{30,3},
				{20,2}
				};
		}
		@DataProvider(name="float values")
		public Object[][] FloatData() {
			return new Object[][] {
				{1.00,5.60},
				{33.50,11.50},
				{25.02,49.01},
			};
		}
		@BeforeClass
		public void openApp() {
			Reporter.log("Calculator data provider operation is being carried out \n", true);
		}
		
			@Test(dataProvider="int inputs")
			public void inputdataProvider01(int input1, int input2) {

				System.out.println("Input 1: " + input1);
				System.out.println("Input 2: " + input2);
				GetObjSum().sum(input1, input2);
				GetObjDiff().sub(input1, input2);
				GetObjMul().mul(input1, input2);
				GetObjDiv().div(input1, input2);
				Reporter.log("inputdataProvider01 task is over", true);
			}
			@Test(dataProvider="float inputs")
			public void inputdataProvider01(float input1, float input2) {

				System.out.println("Input 1: " + input1);
				System.out.println("Input 2: " + input2);
				GetObjSum().sum(input1, input2);
				GetObjDiff().sub(input1, input2);
				GetObjDiv().div(input1, input2);
				Reporter.log("inputdataProvider02 task is over", true);
		}
		
			@AfterClass
			public void closeApp() {
				Reporter.log("\n Data provider section has been completed", true);
			}


}
