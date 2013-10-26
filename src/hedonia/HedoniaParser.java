package hedonia;


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
	
	public boolean isAnN(char caracter)
	{
		return caracter == 'N';
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

	public boolean checkLine(String line)
	{
		// Si la línea está vacía
		if (line.length() == 0)
			return false;
		
		// Si se encuentra algún caracter no admitido
		if (incorrectCharactersFound(line))
			return false;
	
		// Si tiene un único caracter aunque sea una mayúsucula admitida es error
		if (line.length() == 1 && isAdmittedUpperChar(line.charAt(0)))
			return false;
		
		// Envío el analisis recursivo
		int expected = 1;
		if (recursiveCheck(line, expected) == 0)
			return true;
		
		return false;
	}
	
	public int recursiveCheck(String line, int expected)
	{
		char character = line.charAt(0);
		String restOfLine = "";
		
		// Valido que existan más caracteres
		if (line.length() > 1)
			restOfLine = line.substring(1);
		
		// Valido que se espere al menos una sentencia
		if (expected < 1)
			return -1;
		
		// Si es una N sigo necesitando 1 sentencia, vuelvo a invocar el método
		if (isAnN(character)) {
			return recursiveCheck(line.substring(1), expected);
		} else {
			// Si es una de las demás mayúsculas admitidas, agrego +1 sentencia esperada
			if (isAdmittedUpperChar(character)) {
				return recursiveCheck(restOfLine, expected+1);
			} else {
				// Si es una minúscula admitida, cambio -1 sentencia esperada
				// y si no es el final de la línea vuelvo a llamar al método
				// de lo contrario vuelvo en la recursión.
				if (isAdmittedLowerChar(character)) {
					if (restOfLine.length() > 0)
						return recursiveCheck(restOfLine, expected-1);
					else
						return expected-1;
				} 
			}
		}
		
		return expected;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
