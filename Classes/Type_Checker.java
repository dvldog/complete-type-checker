import java.util.HashMap;


/**
 * 
 */

/**
 * @author dilanderoger
 *
 */
public class Type_Checker extends Parser{
	
	public static void main(String args[])
	{
		
		String inFile = "/Input_1.txt";
		String outFile = "/Out_Put.txt";
		
		Lexical_Analyzer.setInStream(inFile,outFile);
		
		// Read contents of the file
		while(Lexical_Analyzer.returnI() != -1)
		{
			Lexical_Analyzer.getNextChar();
		}
		
		// Create a parse tree
		FunDefList fundeflist = fundeflist();
		fundeflist.printParseTree("");
		fundeflist.TypeEval(funType, parameterVarType, variablePos);
		Parser.printTypeCheckResults();
		
		Lexical_Analyzer.closeOutputFile();
		Lexical_Analyzer.closeInputFile();
		
	
	}// end main
	
}
