package interpreterPattern;

public class IntToHex implements Expression {
	///Attributes///
	private int hexa;
	///Constructors///
	public IntToHex(int vHexa){
		this.hexa=vHexa;
	}
	///Methods///
	@Override
	public String interpret(InterpreterContext hexa) {
		return hexa.getHexadecimalFormat(this.hexa);
	}

}
