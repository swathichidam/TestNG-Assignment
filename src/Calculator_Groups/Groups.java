package Calculator_Groups;
import org.testng.Reporter;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Calculator_App.GetandSet;
import Calculator_App.calculator_functions;

public class Groups extends GetandSet {
	int IntResult;
	float FloatResult;
	
	@Test(groups = {"Addition","Integer Value"})
	@Parameters({"IntVal1", "IntVal2"})
	public void GroupAddInt(int Val1, int Val2) {
		GetObjSum();
		IntResult= calculator_functions.sum(Val1, Val2);
		Reporter.log("Groups has been completed for Addition Operation \n", true);
		}
	
	@Test(groups = {"Addition", "Float"})
	@Parameters({"FloatVal1", "FloatVal2"})
	public void GroupAddFloat(float Val1, float Val2) {
		GetObjSum();
		FloatResult=calculator_functions.sum(Val1, Val2);
		Reporter.log("Groups has been completed for Float Addition Operation \n", true);
	}

	@Test(groups = {"Subtraction","Integer"})
	@Parameters({"IntVal1", "IntVal2"})
	public void GroupSubInt(int Val1, int Val2) {
		GetObjDiff();
		IntResult= calculator_functions.sub(Val1, Val2);
		Reporter.log("Groups has been completed for Integer Subtraction Operation \n", true);
	}
	@Test(groups = {"Subtraction", "Float"})
	@Parameters({"FloatVal1", "FloatVal2"})
	public void GroupSubFloat(float Val1, float Val2) {
		GetObjDiff();
		FloatResult=calculator_functions.sub(Val1, Val2);
		Reporter.log("Groups has been completed for Float Subtraction Operation \n", true);
	}	
	
	@BeforeGroups(groups = {"Addition"})
	public void BeforAdd() {
		System.out.println("1. Addittion operation to be carried out ");
	}
	@BeforeGroups(groups = {"Subtraction"})
	public void BeforSub() {
		System.out.println("2. Subtraction opration to be carried out");
	}
	
	@BeforeGroups(groups = {"Multiplication"})
	public void BeforMul() {
		System.out.println("3. Multiplication operaiton to be caaried out ");
		
		
		@AfterGroups(groups = {"Addition"})
		public void AdditionResults() {
			System.out.println("1. Addiiton operation has been completed succeessfully");
		
} 
		
		@AfterGroups(groups = {"Subtraction"})
		public void SubtractionResults() {
			System.out.println("2. Subraction operation has been completed succeessfully");
		
		@AfterGroups(groups = {"Multiplication"})
		public void MultiplicationResults() {
			System.out.println("3. Multiplication operation has been completed succeessfully");
			
		}	
}

