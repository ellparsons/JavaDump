package interpreterPattern;

public class InterpreterContext {

	public String getBinaryFormat(int binary){
		return Integer.toBinaryString(binary);
	}
	
	public String getHexadecimalFormat(int hexa){
		return Integer.toHexString(hexa);
	}
}
