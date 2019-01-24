package testRockpaperscissors;


import static org.junit.Assert.*;
import org.junit.Test;
import rockpaperscissors.RockPaperScissors; 

public class TestRockPaperScissors { 
	@Test 
	public void TestRockScissors()  
	{
		assertEquals("Expected outcome is incorrect", "Win", RockPaperScissors.Game("Rock","Scissors"));
	}
	@Test  
	public void TestRockPaper()
	{
		assertEquals("Expected outcome is incorrect", "Lose", RockPaperScissors.Game("Rock","Paper"));
	}
	@Test 
	public void TestRockRock() 
	{
		assertEquals("Expected outcome is incorrect", "Draw", RockPaperScissors.Game("Rock","Rock"));
	}
	@Test
	public void TestPaperScissors()
	{ 
		assertEquals("Expected outcome is incorrect", "Lose", RockPaperScissors.Game("Paper","Scissors"));
	}
	@Test 
	public void TestPaperPaper()
	{
		assertEquals("Expected outcome is incorrect", "Draw", RockPaperScissors.Game("Paper","Paper"));
	}
	@Test
	public void TestPaperRock()
	{
		assertEquals("Expected outcome is incorrect", "Win", RockPaperScissors.Game("Paper","Rock"));
	}
	@Test
	public void TestScissorsScissors()
	{
		assertEquals("Expected outcome is incorrect", "Draw", RockPaperScissors.Game("Scissors","Scissors"));
	}
	@Test
	public void TestScissorsPaper()
	{
		assertEquals("Expected outcome is incorrect", "Win", RockPaperScissors.Game("Scissors","Paper"));
	}
	@Test
	public void TestScissorsRock()
	{
		assertEquals("Expected outcome is incorrect", "Lose", RockPaperScissors.Game("Scissors","Rock"));
	}
}
