package tdd_exercises;

public class Hedonia
{
	private String _entrada;
	public final String _mayusculas = "NCDEI";
	
	public Hedonia() {}
	
	public Hedonia(String entrada)
	{
		this._entrada = entrada;
	}

	public String getEntrada()
	{
		return this._entrada;
	}

	public boolean checkCharacter(char caracter)
	{
		return checkLowerCharacter(caracter) || checkUpperCharacter(caracter);
	}
	
	public boolean checkLowerCharacter(char caracter)
	{
		int numericValue = (int) caracter;
		if ( numericValue >= 112 && numericValue <= 125)
			return true;
		return false;
	}
	
	public boolean checkUpperCharacter(char caracter)
	{
		if (this._mayusculas.indexOf(caracter) > -1)
			return true;
		return false;
	}

	public boolean checkNewLineCharacter(char caracter)
	{
		int numericValue = (int) caracter;
		if (numericValue == 13 || numericValue == 10)
			return true;
		return false;
	}

	public boolean checkSentence(String sentence)
	{
		if (incorrectCharactersFound(sentence)) {
			return false;
		}
		
		// SENTENCIA SIMPLE
		if (checkLowerCharacter(sentence.charAt(0))) {
			char siguiente = sentence.charAt(1);
			if (!checkNewLineCharacter(siguiente))
				return false;
		}
		
		return true;
	}

	public boolean incorrectCharactersFound(String sentence)
	{
		for (int i=0; i < sentence.length(); i++) {
			if (!checkCharacter(sentence.charAt(i)))
				return true;
		}
		return false;
	}
}
