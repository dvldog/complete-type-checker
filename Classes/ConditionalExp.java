import java.util.HashMap;

/**
 * 
 */

/**
 * @author dilanderoger
 *
 */
public class ConditionalExp extends Exp{

	Exp exp1;
	Exp exp2;
	Exp exp3;
	
	ConditionalExp(Exp e1, Exp e2, Exp e3)
	{
		exp1 = e1;
		exp2 = e2;
		exp3 = e3;
	}
	/* (non-Javadoc)
	 * @see Exp#printParseTree(java.lang.String)
	 */
	@Override
	void printParseTree(String indent) {
		// TODO Auto-generated method stub
		
		String indent1 = indent + " ";
		Lexical_Analyzer.displayln(indent + indent.length() + " <exp>");
		Lexical_Analyzer.displayln(indent1 + indent1.length() + " if");
		exp1.printParseTree(indent1+" ");
		Lexical_Analyzer.displayln(indent1 + indent1.length() + " then");
		exp2.printParseTree(indent1+" ");
		Lexical_Analyzer.displayln(indent1 + indent1.length() + " else");
		exp3.printParseTree(indent1+" ");
	}
	/* (non-Javadoc)
	 * @see Exp#TypeEval(java.util.HashMap, java.util.HashMap, java.util.HashMap)
	 */
	@Override
	String TypeEval(HashMap<String, String> funType,
			HashMap<String, String> parameterVar,
			HashMap<String, Integer> variablePos) {
		// TODO Auto-generated method stub
		
		String bool = exp1.TypeEval(funType, parameterVar, variablePos);
		String error = "Type Error: incompatible types found in conditional expression";
				
		if(bool.equals("boolean"))
		{
			
			// Evaluate both types of the variables. If they don't match, return an error value
			String tempTypeExp2 = exp2.TypeEval(funType, parameterVar, variablePos);
			
			String tempTypeExp3 = exp3.TypeEval(funType, parameterVar, variablePos);
			
			if(tempTypeExp2.equals(tempTypeExp3))
				return tempTypeExp2;
			else
				return error;
		}
		
		
		return error;
	}
	/* (non-Javadoc)
	 * @see ExpList#getString()
	 */
	@Override
	String getString() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
