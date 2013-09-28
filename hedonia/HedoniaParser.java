package tdd_exercises.hedonia;

public class HedoniaParser
{
	private String _entrada;
	public final String _mayusculas = "NCDEI";
	
	public HedoniaParser() {}
	
	public HedoniaParser(String entrada)
	{
		this._entrada = entrada;
	}

	public String getEntrada()
	{
		return this._entrada;
	}

// VERIFICO CARACTERES	
	public boolean isAdmittedCharacter(char caracter)
	{
		return isAdmittedLowerChar(caracter) || isAdmittedUpperChar(caracter);
	}
	
	public boolean isAdmittedLowerChar(char caracter)
	{
		int numericValue = (int) caracter;
		if ( numericValue >= 112 && numericValue <= 125)
			return true;
		return false;
	}
	
	public boolean isAdmittedUpperChar(char caracter)
	{
		if (this._mayusculas.indexOf(caracter) > -1)
			return true;
		return false;
	}

	public boolean isNewLineCharacter(char caracter)
	{
		int numericValue = (int) caracter;
		if (numericValue == 13 || numericValue == 10)
			return true;
		return false;
	}

	public boolean isNotAnN(char caracter)
	{
		return caracter != 'N';
	}

// VERIFICO SENTENCIAS
	public boolean incorrectCharactersFound(String sentence)
	{
		for (int i=0; i < sentence.length(); i++) {
			if (!isAdmittedCharacter(sentence.charAt(i)))
				return true;
		}
		return false;
	}

	public boolean oneCharSentence(String sentence)
	{
		return isAdmittedLowerChar(sentence.charAt(0));
	}	
	
	public boolean twoCharsSentence(String sentence)
	{
		char firstChar = sentence.charAt(0);
		char secondChar = sentence.charAt(1);
		
		// SI EL PRIMER CARACTER NO ES N SALGO
		if (isNotAnN(firstChar))
			return false;
		
		// SI EL SEGUNDO CARACTER NO ES UNA MINUSCULA ADMITIDA
		if (!isAdmittedLowerChar(secondChar))
			return false;
		
		return true;
	}

	public boolean threeCharsSentence(String sentence)
	{
		char firstChar = sentence.charAt(0);
		char secondChar = sentence.charAt(1);
		char thirdChar = sentence.charAt(2);
		
		if (isAdmittedUpperChar(firstChar) && isNotAnN(firstChar))
		{
			return isAdmittedLowerChar(secondChar) && isAdmittedLowerChar(thirdChar);
		}
		
		return false;
	}

	public boolean fourCharsSentence(String sentence)
	{
		char firstChar = sentence.charAt(0);
		String threeCharsSentence = sentence.substring(1);
		
		if (isNotAnN(firstChar))
			return false;
		
		return threeCharsSentence(threeCharsSentence);
	}	
	
	public boolean checkSentence(String sentence)
	{
		if (incorrectCharactersFound(sentence))
			return false;
		if (sentence.length() == 1)
			return oneCharSentence(sentence);
		if (sentence.length() == 2)
			return twoCharsSentence(sentence);
		if (sentence.length() == 3)
			return threeCharsSentence(sentence);
		if (sentence.length() == 4)
			return fourCharsSentence(sentence);
		
		return false;
	}
}
