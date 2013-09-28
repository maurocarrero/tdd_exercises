package tdd_exercises;

import junit.framework.Assert;

import org.junit.Test;

public class HedoniaTest {

// TEST CONSTRUCTORES
	@Test
	public void EmptyConstructorTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertNotNull(hedonia);
	}
	
	@Test
	public void ConstructorTest()
	{
		Hedonia hedonia = new Hedonia("");
		Assert.assertEquals("", hedonia.getEntrada());
	}
	
//  TEST CARACTERES EN LowerCULAS
	@Test
	public void CheckLowerPCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('p'));
	}
	
	@Test
	public void CheckLowerQCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('q'));
	}
	
	@Test
	public void CheckLowerRCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('r'));
	}
	
	@Test
	public void CheckLowerSCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('s'));
	}
	
	@Test
	public void CheckLowerTCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('t'));
	}
	
	@Test
	public void CheckLowerUCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('u'));
	}

	@Test
	public void CheckLowerVCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('v'));
	}
	
	@Test
	public void CheckLowerWCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('w'));
	}

	@Test
	public void CheckLowerXCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('x'));
	}
	
	@Test
	public void CheckLowerYCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('y'));
	}
	
	@Test
	public void CheckLowerZCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkLowerCharacter('z'));
	}
	
	@Test
	public void CheckLowerIncorrectDownLimitCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertFalse(hedonia.checkLowerCharacter('o'));
	}
	
	@Test
	public void CheckLowerIncorrectUpLimitCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertFalse(hedonia.checkLowerCharacter('0'));
	}

//  TEST CARACTERES EN MAYUSCULAS
	@Test
	public void CheckUpperNCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkUpperCharacter('N'));
	}
	
	@Test
	public void CheckUpperCCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkUpperCharacter('C'));
	}
	
	@Test
	public void CheckUpperDCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkUpperCharacter('D'));
	}

	@Test
	public void CheckUpperECharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkUpperCharacter('E'));
	}
	
	@Test
	public void CheckUpperICharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkUpperCharacter('I'));
	}
	
	@Test
	public void CheckUpperIncorrectDownLimitCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertFalse(hedonia.checkUpperCharacter('n'));
	}
	
	@Test
	public void CheckUpperIncorrectUpLimitCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertFalse(hedonia.checkUpperCharacter('i'));
	}
	
	@Test
	public void CheckFirstRandomIncorrectCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertFalse(hedonia.checkCharacter('%'));
	}
	
	@Test
	public void CheckSecondRandomIncorrectCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertFalse(hedonia.checkCharacter('6'));
	}
	
	@Test
	public void CheckThirdRandomIncorrectCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertFalse(hedonia.checkCharacter('.'));
	}

// TEST TODOS LOS CARACTERES MINUSCULAS y MAYUSCULAS
	
	@Test
	public void CheckLowerCharactersTest()
	{
		Hedonia hedonia = new Hedonia("");
		Assert.assertTrue(hedonia.checkCharacter('p'));
		Assert.assertTrue(hedonia.checkCharacter('q'));
		Assert.assertTrue(hedonia.checkCharacter('r'));
		Assert.assertTrue(hedonia.checkCharacter('s'));
		Assert.assertTrue(hedonia.checkCharacter('t'));
		Assert.assertTrue(hedonia.checkCharacter('u'));
		Assert.assertTrue(hedonia.checkCharacter('v'));
		Assert.assertTrue(hedonia.checkCharacter('w'));
		Assert.assertTrue(hedonia.checkCharacter('x'));
		Assert.assertTrue(hedonia.checkCharacter('y'));
		Assert.assertTrue(hedonia.checkCharacter('z'));
	}
	
	@Test
	public void CheckUpperCharactersTest()
	{
		Hedonia hedonia = new Hedonia("");
		Assert.assertTrue(hedonia.checkCharacter('N'));
		Assert.assertTrue(hedonia.checkCharacter('C'));
		Assert.assertTrue(hedonia.checkCharacter('D'));
		Assert.assertTrue(hedonia.checkCharacter('E'));
		Assert.assertTrue(hedonia.checkCharacter('I'));
	}
	
	@Test
	public void CheckIncorrectCharactersTest()
	{
		Hedonia hedonia = new Hedonia("");
		Assert.assertFalse(hedonia.checkCharacter('%'));
		Assert.assertFalse(hedonia.checkCharacter('.'));
		Assert.assertFalse(hedonia.checkCharacter('a'));
		Assert.assertFalse(hedonia.checkCharacter('A'));
		Assert.assertFalse(hedonia.checkCharacter('"'));
	}

// TEST CARACTERES DE NUEVA LINEA
	
	@Test
	public void CheckNewLineCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkNewLineCharacter('\n'));
	}

	@Test
	public void CheckIncorrectNewLineCRCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.checkNewLineCharacter('\r'));
	}
	
	@Test
	public void CheckIncorrectNewLineTABCharacterTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertFalse(hedonia.checkNewLineCharacter('\t'));
	}

// TEST INCORRECT CHARS IN SENTENCES
	
	@Test
	public void CheckFalseIncorrectCharactersFoundTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertFalse(hedonia.incorrectCharactersFound(""));
		Assert.assertFalse(hedonia.incorrectCharactersFound("pqrstuvwxyz"));
		Assert.assertFalse(hedonia.incorrectCharactersFound("NCDEI"));
	}

	@Test
	public void CheckTrueIncorrectCharactersFoundTest()
	{
		Hedonia hedonia = new Hedonia();
		Assert.assertTrue(hedonia.incorrectCharactersFound("NCDEIa"));
		Assert.assertTrue(hedonia.incorrectCharactersFound("pqrstuMvwxyz"));
		Assert.assertTrue(hedonia.incorrectCharactersFound("9NCDEI"));
		Assert.assertTrue(hedonia.incorrectCharactersFound("9abcABC"));
	}

	
}
