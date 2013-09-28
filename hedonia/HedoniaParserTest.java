package tdd_exercises.hedonia;

import junit.framework.Assert;

import org.junit.Test;

public class HedoniaParserTest {

// TEST CONSTRUCTORES
	
	@Test
	public void EmptyConstructorTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertNotNull(hedonia);
	}
	
	@Test
	public void ConstructorTest()
	{
		HedoniaParser hedonia = new HedoniaParser("");
		Assert.assertEquals("", hedonia.getEntrada());
	}
	
//  TEST CARACTERES EN MINUSCULAS
	
	@Test
	public void CheckLowerPCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('p'));
	}
	
	@Test
	public void CheckLowerQCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('q'));
	}
	
	@Test
	public void CheckLowerRCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('r'));
	}
	
	@Test
	public void CheckLowerSCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('s'));
	}
	
	@Test
	public void CheckLowerTCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('t'));
	}
	
	@Test
	public void CheckLowerUCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('u'));
	}

	@Test
	public void CheckLowerVCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('v'));
	}
	
	@Test
	public void CheckLowerWCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('w'));
	}

	@Test
	public void CheckLowerXCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('x'));
	}
	
	@Test
	public void CheckLowerYCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('y'));
	}
	
	@Test
	public void CheckLowerZCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedLowerChar('z'));
	}
	
	@Test
	public void CheckLowerIncorrectDownLimitCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.isAdmittedLowerChar('o'));
	}
	
	@Test
	public void CheckLowerIncorrectUpLimitCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.isAdmittedLowerChar('0'));
	}

//  TEST CARACTERES EN MAYUSCULAS
	
	@Test
	public void CheckUpperNCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedUpperChar('N'));
	}
	
	@Test
	public void CheckUpperCCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedUpperChar('C'));
	}
	
	@Test
	public void CheckUpperDCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedUpperChar('D'));
	}

	@Test
	public void CheckUpperECharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedUpperChar('E'));
	}
	
	@Test
	public void CheckUpperICharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAdmittedUpperChar('I'));
	}
	
	@Test
	public void CheckUpperIncorrectDownLimitCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.isAdmittedUpperChar('n'));
	}
	
	@Test
	public void CheckUpperIncorrectUpLimitCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.isAdmittedUpperChar('i'));
	}
	
	@Test
	public void CheckFirstRandomIncorrectCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.isAdmittedCharacter('%'));
	}
	
	@Test
	public void CheckSecondRandomIncorrectCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.isAdmittedCharacter('6'));
	}
	
	@Test
	public void CheckThirdRandomIncorrectCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.isAdmittedCharacter('.'));
	}

// TEST TODOS LOS CARACTERES MINUSCULAS y MAYUSCULAS
	
	@Test
	public void CheckLowerCharactersTest()
	{
		HedoniaParser hedonia = new HedoniaParser("");
		Assert.assertTrue(hedonia.isAdmittedCharacter('p'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('q'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('r'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('s'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('t'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('u'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('v'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('w'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('x'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('y'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('z'));
	}
	
	@Test
	public void CheckUpperCharactersTest()
	{
		HedoniaParser hedonia = new HedoniaParser("");
		Assert.assertTrue(hedonia.isAdmittedCharacter('N'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('C'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('D'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('E'));
		Assert.assertTrue(hedonia.isAdmittedCharacter('I'));
	}
	
	@Test
	public void CheckIncorrectCharactersTest()
	{
		HedoniaParser hedonia = new HedoniaParser("");
		Assert.assertFalse(hedonia.isAdmittedCharacter('%'));
		Assert.assertFalse(hedonia.isAdmittedCharacter('.'));
		Assert.assertFalse(hedonia.isAdmittedCharacter('a'));
		Assert.assertFalse(hedonia.isAdmittedCharacter('A'));
		Assert.assertFalse(hedonia.isAdmittedCharacter('"'));
	}

// TEST CARACTERES DE NUEVA LINEA
	
	@Test
	public void CheckNewLineCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isNewLineCharacter('\n'));
	}

	@Test
	public void CheckIncorrectNewLineCRCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isNewLineCharacter('\r'));
	}
	
	@Test
	public void CheckIncorrectNewLineTABCharacterTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.isNewLineCharacter('\t'));
	}

// TEST CARACTER ES N
	
	@Test
	public void isNotAnNTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.isNotAnN('N'));
		
		// FALSO
		Assert.assertTrue(hedonia.isNotAnN('a'));
		Assert.assertTrue(hedonia.isNotAnN('p'));
		Assert.assertTrue(hedonia.isNotAnN('t'));
		Assert.assertTrue(hedonia.isNotAnN('z'));
		Assert.assertTrue(hedonia.isNotAnN('Z'));
		Assert.assertTrue(hedonia.isNotAnN('T'));
		Assert.assertTrue(hedonia.isNotAnN('.'));
		Assert.assertTrue(hedonia.isNotAnN('6'));
	}
	
// TEST CARACTERES INCORRECTOS EN UNA SENTENCIA
	
	@Test
	public void CheckFalseIncorrectCharactersFoundTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertFalse(hedonia.incorrectCharactersFound(""));
		Assert.assertFalse(hedonia.incorrectCharactersFound("pqrstuvwxyz"));
		Assert.assertFalse(hedonia.incorrectCharactersFound("NCDEI"));
	}

	@Test
	public void CheckTrueIncorrectCharactersFoundTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.incorrectCharactersFound("NCDEIa"));
		Assert.assertTrue(hedonia.incorrectCharactersFound("pqrstuMvwxyz"));
		Assert.assertTrue(hedonia.incorrectCharactersFound("9NCDEI"));
		Assert.assertTrue(hedonia.incorrectCharactersFound("9abcABC"));
	}

// TEST SENTENCIAS
	
	@Test
	public void oneCharSentenceTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		// TRUE
		Assert.assertTrue(hedonia.oneCharSentence("p"));
		Assert.assertTrue(hedonia.oneCharSentence("t"));
		Assert.assertTrue(hedonia.oneCharSentence("z"));
		// FALSE
		Assert.assertFalse(hedonia.oneCharSentence("1"));
		Assert.assertFalse(hedonia.oneCharSentence("#"));
		Assert.assertFalse(hedonia.oneCharSentence("a"));
	}
	
	@Test
	public void twoCharsSentenceTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		// TRUE
		Assert.assertTrue(hedonia.twoCharsSentence("Np"));
		Assert.assertTrue(hedonia.twoCharsSentence("Nt"));
		Assert.assertTrue(hedonia.twoCharsSentence("Nz"));
		// FALSE
		Assert.assertFalse(hedonia.twoCharsSentence("N6"));
		Assert.assertFalse(hedonia.twoCharsSentence("Na"));
		Assert.assertFalse(hedonia.twoCharsSentence("Cp"));
	}
	
	@Test
	public void threeCharsSentenceTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		
		// TRUE
		Assert.assertTrue(hedonia.checkSentence("Isz"));
		Assert.assertTrue(hedonia.checkSentence("Dpt"));
		Assert.assertTrue(hedonia.checkSentence("Ezx"));
		Assert.assertTrue(hedonia.checkSentence("Izz"));
		
		// FALSE
		Assert.assertFalse(hedonia.checkSentence("ptz"));
		Assert.assertFalse(hedonia.checkSentence("qpq"));
		Assert.assertFalse(hedonia.checkSentence("NNa"));
		Assert.assertFalse(hedonia.checkSentence("NaP"));
	}
	
	@Test
	public void fourCharsSentenceTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		
		// TRUE
		Assert.assertTrue(hedonia.checkSentence("NIsz"));
		Assert.assertTrue(hedonia.checkSentence("NDpt"));
		Assert.assertTrue(hedonia.checkSentence("NEzx"));
		Assert.assertTrue(hedonia.checkSentence("NIzz"));
		
		// FALSE
		Assert.assertFalse(hedonia.checkSentence("Cptz"));
		Assert.assertFalse(hedonia.checkSentence("vptz"));
		Assert.assertFalse(hedonia.checkSentence("Nqpq"));
		Assert.assertFalse(hedonia.checkSentence("INpt"));
	}

	@Test
	public void checkSentence()
	{
		HedoniaParser hedonia = new HedoniaParser();
		
		// TRUE
		Assert.assertTrue(hedonia.checkSentence("y"));
		Assert.assertTrue(hedonia.checkSentence("Np"));
		Assert.assertTrue(hedonia.checkSentence("Nt"));
		Assert.assertTrue(hedonia.checkSentence("Ezx"));
		Assert.assertTrue(hedonia.checkSentence("Izz"));
		Assert.assertTrue(hedonia.checkSentence("NEzx"));
		Assert.assertTrue(hedonia.checkSentence("NIzz"));		

		// FALSE
		Assert.assertFalse(hedonia.checkSentence("*"));
		Assert.assertFalse(hedonia.checkSentence("N6"));
		Assert.assertFalse(hedonia.checkSentence("Na"));
		Assert.assertFalse(hedonia.checkSentence("ptz"));
		Assert.assertFalse(hedonia.checkSentence("qpq"));
		Assert.assertFalse(hedonia.checkSentence("Cptz"));
		Assert.assertFalse(hedonia.checkSentence("vptz"));
	}
}
