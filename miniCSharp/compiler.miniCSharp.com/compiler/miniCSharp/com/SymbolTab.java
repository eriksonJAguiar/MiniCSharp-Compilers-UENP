package compiler.miniCSharp.com;

import java.util.HashMap;

public class SymbolTab {
	
	private static SymbolTab instance = null;
	public HashMap<String, Integer> table;
	
	private SymbolTab(){}
	
	public SymbolTab getInstance(){
		if(instance == null)
			return new SymbolTab();
		
		return instance;
	}
}
