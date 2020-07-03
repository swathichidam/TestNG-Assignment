package Calculator_App;


public class GetandSet extends calculator_functions {
		
     	calculator_functions objSum = new calculator_functions();    				
        calculator_functions objDiff=new calculator_functions();				
		calculator_functions objMul=new calculator_functions();									
		calculator_functions objDiv=new calculator_functions();										
		
		
		public calculator_functions GetObjSum() {
			return objSum;
		}
		public void setObjSum(calculator_functions objSum) {
			this.objSum = objSum;
		}
		
		public calculator_functions GetObjDiff() {
			return objDiff;
		}
		public void setObjDiff(calculator_functions objDiff) {
			this.objDiff = objDiff;
		}
		public calculator_functions GetObjMul() {
			return objMul;
		}
		public void setObjMul(calculator_functions objMul) {
			this.objMul = objMul;
		}
		public calculator_functions GetObjDiv() {
			return objDiv;
		}
		public void setObjDiv(calculator_functions objDiv) {
			this.objDiv = objDiv;
		}
	}


