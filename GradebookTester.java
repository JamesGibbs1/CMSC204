package GradeBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	/**
	 * this is a gradebook test for the gradebook.java to see if all
	 * methods function properly
	 * @author james gibbs
	 *
	 */
class GradebookTester {
	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(55);
		g1.addScore(96);
		
		g2.addScore(40);
		g2.addScore(73);
		g2.addScore(67);
		g2.addScore(95);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("55.0 96.0"));
		assertTrue(g2.toString().equals("40.0 73.0 67.0 95.0"));
		
		assertEquals(2, g1.getScoreSize());
		assertEquals(4, g2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(151, g1.sum(), .0001);
		assertEquals(275, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(55, g1.minimum(), .001);
		assertEquals(40, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(96, g1.finalScore(), .001);
		assertEquals(235, g2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize());
		assertEquals(4, g2.getScoreSize());
	}


}
