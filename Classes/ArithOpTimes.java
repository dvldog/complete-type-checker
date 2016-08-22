import java.util.HashMap;

/**
 * 
 */

/**
 * @author dilanderoger
 *
 */
public class ArithOpTimes extends ArithOp{

	String times;
	
	ArithOpTimes(String t)
	{
		times = t;
	}
	/* (non-Javadoc)
	 * @see ArithOp#printParseTree(java.lang.String)
	 */
	@Override
	void printParseTree(String indent) {
		// TODO Auto-generated method stub
		Lexical_Analyzer.displayln(indent + indent.length() + " " +times);
	}
	/* (non-Javadoc)
	 * @see ArithOp#TypeEval(java.util.HashMap, java.util.HashMap, java.util.HashMap)
	 */
	@Override
	String TypeEval(HashMap<String, String> funType,
			HashMap<String, String> parameterVar,
			HashMap<String, Integer> variablePos) {
		// TODO Auto-generated method stub
		
		return times;
	}

}
