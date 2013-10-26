package hedonia;

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
	
	@Test
	public void isAnNTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		Assert.assertTrue(hedonia.isAnN('N'));
		
		// FALSO
		Assert.assertFalse(hedonia.isAnN('a'));
		Assert.assertFalse(hedonia.isAnN('p'));
		Assert.assertFalse(hedonia.isAnN('t'));
		Assert.assertFalse(hedonia.isAnN('z'));
		Assert.assertFalse(hedonia.isAnN('Z'));
		Assert.assertFalse(hedonia.isAnN('T'));
		Assert.assertFalse(hedonia.isAnN('.'));
		Assert.assertFalse(hedonia.isAnN('6'));
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
	public void recursiveCheckTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		
		Assert.assertEquals(0, hedonia.recursiveCheck("s", 1));
		Assert.assertEquals(0, hedonia.recursiveCheck("Ns", 1));
		Assert.assertEquals(0, hedonia.recursiveCheck("NNNNNNNNs", 1));
		Assert.assertEquals(0, hedonia.recursiveCheck("Css", 1));
		Assert.assertEquals(0, hedonia.recursiveCheck("NCss", 1));
		Assert.assertEquals(0, hedonia.recursiveCheck("CNCsss", 1));
		Assert.assertEquals(0, hedonia.recursiveCheck("CCCCCssssss", 1));
		Assert.assertEquals(0, hedonia.recursiveCheck("CCNCssNCssCNCssNCss", 1));
		Assert.assertEquals(0, hedonia.recursiveCheck("CNIzzNEzx", 1));
		Assert.assertEquals(0, hedonia.recursiveCheck("ENCpqNCrs", 1));		
	}
	
	@Test
	public void oneCharSentenceTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		// TRUE
		Assert.assertTrue(hedonia.checkLine("p"));
		Assert.assertTrue(hedonia.checkLine("t"));
		Assert.assertTrue(hedonia.checkLine("z"));
		// FALSE
		Assert.assertFalse(hedonia.checkLine("1"));
		Assert.assertFalse(hedonia.checkLine("#"));
		Assert.assertFalse(hedonia.checkLine("a"));
	}
	
	@Test
	public void twoCharsSentenceTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		// TRUE
		Assert.assertTrue(hedonia.checkLine("Np"));
		Assert.assertTrue(hedonia.checkLine("Nt"));
		Assert.assertTrue(hedonia.checkLine("Nz"));
		// FALSE
		Assert.assertFalse(hedonia.checkLine("N6"));
		Assert.assertFalse(hedonia.checkLine("Na"));
		Assert.assertFalse(hedonia.checkLine("Cp"));
	}
	
	@Test
	public void threeCharsSentenceTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		
		// TRUE
		Assert.assertTrue(hedonia.checkLine("Isz"));
		Assert.assertTrue(hedonia.checkLine("Dpt"));
		Assert.assertTrue(hedonia.checkLine("Ezx"));
		Assert.assertTrue(hedonia.checkLine("Izz"));
		
		// FALSE
		Assert.assertFalse(hedonia.checkLine("ptz"));
		Assert.assertFalse(hedonia.checkLine("qpq"));
		Assert.assertFalse(hedonia.checkLine("NNa"));
		Assert.assertFalse(hedonia.checkLine("NaP"));
	}
	
	@Test
	public void fourCharsSentenceTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		
		// TRUE
		Assert.assertTrue(hedonia.checkLine("NIsz"));
		Assert.assertTrue(hedonia.checkLine("NDpt"));
		Assert.assertTrue(hedonia.checkLine("NEzx"));
		Assert.assertTrue(hedonia.checkLine("NIzz"));
		Assert.assertTrue(hedonia.checkLine("INpt"));		
		
		// FALSE
		Assert.assertFalse(hedonia.checkLine("Cptz"));
		Assert.assertFalse(hedonia.checkLine("vptz"));
		Assert.assertFalse(hedonia.checkLine("Nqpq"));
	}

	@Test
	public void checkLineTest()
	{
		HedoniaParser hedonia = new HedoniaParser();
		
		// TRUE

		Assert.assertTrue(hedonia.checkLine("y"));
		Assert.assertTrue(hedonia.checkLine("Np"));
		Assert.assertTrue(hedonia.checkLine("Nt"));
		Assert.assertTrue(hedonia.checkLine("Ezx"));
		Assert.assertTrue(hedonia.checkLine("Izz"));
		Assert.assertTrue(hedonia.checkLine("NEzx"));
		Assert.assertTrue(hedonia.checkLine("NIzz"));
		Assert.assertTrue(hedonia.checkLine("CNIzzNEzx"));
		Assert.assertTrue(hedonia.checkLine("ENCpqNCrs"));
		Assert.assertTrue(hedonia.checkLine("CDCssCsss"));
		Assert.assertTrue(hedonia.checkLine("NNNCCstCst"));
		Assert.assertTrue(hedonia.checkLine("CCNCrrNCrrCNCrrNCrr"));
		Assert.assertTrue(hedonia.checkLine("NNs"));
		Assert.assertTrue(hedonia.checkLine("CNpp"));
		Assert.assertTrue(hedonia.checkLine("CNNNNNNNpNNNNNNp"));
		Assert.assertTrue(hedonia.checkLine("NNNNNNNNNNNNNNNNNNs"));


		// FALSE
		Assert.assertFalse(hedonia.checkLine("*"));
		Assert.assertFalse(hedonia.checkLine("/"));
		Assert.assertFalse(hedonia.checkLine("C"));
		Assert.assertFalse(hedonia.checkLine("N"));
		Assert.assertFalse(hedonia.checkLine("D"));
		Assert.assertFalse(hedonia.checkLine("I"));
		Assert.assertFalse(hedonia.checkLine("N6"));
		Assert.assertFalse(hedonia.checkLine("Na"));
		Assert.assertFalse(hedonia.checkLine("CssN"));
		Assert.assertFalse(hedonia.checkLine("NNNCCstCstN"));
		Assert.assertFalse(hedonia.checkLine("sN"));
		Assert.assertFalse(hedonia.checkLine("NNsN"));
		Assert.assertFalse(hedonia.checkLine("ptz"));
		Assert.assertFalse(hedonia.checkLine("qpq"));
		Assert.assertFalse(hedonia.checkLine("Cptz"));
		Assert.assertFalse(hedonia.checkLine("vptz"));
		Assert.assertFalse(hedonia.checkLine("CNNNNNNNNNNNNNNp"));
		Assert.assertFalse(hedonia.checkLine("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNss"));
		Assert.assertFalse(hedonia.checkLine("CstN"));
		Assert.assertFalse(hedonia.checkLine("DCsCst"));
		Assert.assertFalse(hedonia.checkLine("CstCst"));
	}
}
