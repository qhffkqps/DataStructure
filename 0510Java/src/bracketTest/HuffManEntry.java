package bracketTest;

public class HuffManEntry {
	private int frenquency;
	private String word;
	private HuffManEntry left;
	private HuffManEntry right;
	private String code;
	
	public HuffManEntry (int newFreq,String newValue, HuffManEntry l,HuffManEntry r, String s) {
		frenquency =  newFreq;
		word = new newValue;
		left = l;
		right = r;
		code = s;
	}

	public int getKey() {
		return frenquency;
	}
	public String getValue() {
		return word;
	}

	public String getcode() {
		return code;
	}

	public HuffManEntry getLeft() {
		return left;
	}

	public HuffManEntry getRight() {
		return right;
	}

	public void setCode(String newCode) {
		code = newCode;
	}
	
}
