 
import java.util.*;
import javax.script.*;
interface booleanExpression {
	 public boolean EvaluateExpression(String s);}


public class Boolean_calculator implements booleanExpression{
	public boolean EvaluateExpression (String s)
	{
try{
        ScriptEngineManager mgr = new ScriptEngineManager();
	ScriptEngine engine = mgr.getEngineByName("JavaScript");
	System.out.println(engine.eval(s));
	return true;}
catch (ScriptException e) {
                       System.out.println("Invalid Expression");
		            e.printStackTrace();}
return true;
	}
	public static void main(String[] args)
	{String s=new String();
	
		String s1=new String();
		Scanner sc =new Scanner(System.in);
		s=sc.nextLine();
		
		for(int i=0;i<s.length();i++)
		{if(s.charAt(i)=='(')
			s1=s1+'(';
		else if(s.charAt(i)=='T')
			s1=s1+"true";
		else if(s.charAt(i)=='F')
			s1+="false";
		else if(s.charAt(i)=='A')
			s1+="&&";
		else if(s.charAt(i)=='O')
			s1+="||";
		else if(s.charAt(i)==')')
			s1+=')';
		}
		
		booleanExpression e=new Boolean_calculator();
		e.EvaluateExpression(s1);
	}

}