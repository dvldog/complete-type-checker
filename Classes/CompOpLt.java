import java.util.HashMap;

/**
 * 
 */

/**
 * @author dilanderoger
 *
 */
public class CompOpLt extends CompOp{

	String lessT;
	
	CompOpLt(String lt)
	{
		lessT = lt;
	}
	/* (non-Javadoc)
	 * @see CompOp#printParseTree(java.lang.String)
	 */
	@Override
	void printParseTree(String indent) {
		// TODO Auto-generated method stub
		String newIndent = indent.substring(0, indent.length()-1);
		Lexical_Analyzer.display(newIndent + newIndent.length() + " " + lessT+ "\n");

	}
	/* (non-Javadoc)
	 * @see CompOp#getComp()
	 */
	@Override
	String getComp() {
		// TODO Auto-generated method stub
		return lessT;
	}
	/* (non-Javadoc)
	 * @see CompOp#TypeEval(java.util.HashMap, java.util.HashMap, java.util.HashMap)
	 */
	@Override
	String TypeEval(HashMap<String, String> funType,
			HashMap<String, String> parameterVar,
			HashMap<String, Integer> variablePos) {
		// TODO Auto-generated method stub
		
		return lessT;
	}

}
