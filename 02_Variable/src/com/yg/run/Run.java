package com.yg.run;

import com.yg.variable.A_Variable;
import com.yg.variable.B_KeyboardInput;
import com.yg.variable.C_Constant;
import com.yg.variable.D_Casting;
import com.yg.variable.E_Printf;

public class Run {

	public static void main(String[] args) {
		
		A_Variable a = new A_Variable();
		//a.printVariable();
		//a.declareVariable();
		//a.initVariable();
		
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputScanner1();
		b.inputScanner2();
		//b.inputScanner3();
		
		C_Constant c = new C_Constant();
		//c.finalConstant();
		
		D_Casting d = new D_Casting();
		//d.autoCasting();
		//d.forceCasting();
		
		E_Printf e = new E_Printf();
		//e.printfMethod();
		
	}
	

}
