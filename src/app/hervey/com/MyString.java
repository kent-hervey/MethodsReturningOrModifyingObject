package app.hervey.com;

public class MyString {
	
	public String someText;

	public MyString(String stringIn) {
		this.someText = stringIn;
	}

	public void makeLowerCase() {
		String localString = this.someText;
		String localString2 = localString.toLowerCase();
		this.someText = localString2;
		
	}

	public String returnlowerCase() {
		return this.someText.toLowerCase();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((someText == null) ? 0 : someText.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyString other = (MyString) obj;
		if (someText == null) {
			if (other.someText != null)
				return false;
		} else if (!someText.equals(other.someText))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return someText;
	}

	
	
	
	
	
}
