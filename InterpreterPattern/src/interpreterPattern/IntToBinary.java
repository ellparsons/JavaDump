package interpreterPattern;

public class IntToBinary implements Expression {
	///Attributes///
	private int binary;
	///Constructors///
	public IntToBinary(int vBinary){
		this.binary=vBinary;
	}
	///Methods///
	@Override
	public String interpret(InterpreterContext binary) {
		return binary.getBinaryFormat(this.binary);
	}

}
