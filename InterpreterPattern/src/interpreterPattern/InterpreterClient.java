
package interpreterPattern;

public class InterpreterClient {

	public InterpreterContext binaryhexa;
	
	public InterpreterClient(InterpreterContext result){
		this.binaryhexa=result;
	}
	
	public String interpret(String str){
		Expression exp = null;
		if(str.contains("Hexadecimal")){
			exp=new IntToHex(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else if(str.contains("Binary")){
			exp=new IntToBinary(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else return str;
		
		return exp.interpret(binaryhexa);
	}
	
	public static void main(String args[]){
		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";
		
		InterpreterClient ec = new InterpreterClient(new InterpreterContext());
		System.out.println(str1+"= "+ec.interpret(str1));
		System.out.println(str2+"= "+ec.interpret(str2));

	}
}
