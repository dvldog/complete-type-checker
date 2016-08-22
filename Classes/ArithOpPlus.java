import java.util.HashMap;

/**
 * 
 */

/**
 * @author dilanderoger
 *
 */
public class ArithOpPlus extends ArithOp{

	String plus;
	
	ArithOpPlus(String p)
	{
		plus = p;
	}
	/* (non-Javadoc)
	 * @see ArithOp#printParseTree(java.lang.String)
	 */
	@Override
	void printParseTree(String indent) {
		// TODO Auto-generated method stub
		
		Lexical_Analyzer.displayln(indent + indent.length() + " " + plus);
		
	}
	/* (non-Javadoc)
	 * @see ArithOp#TypeEval(java.util.HashMap, java.util.HashMap, java.util.HashMap)
	 */
	@Override
	String TypeEval(HashMap<String, String> funType,
			HashMap<String, String> parameterVar,
			HashMap<String, Integer> variablePos) {
		// TODO Auto-generated method stub
		
		return plus;
	}

}
