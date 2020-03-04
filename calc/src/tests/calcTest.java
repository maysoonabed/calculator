package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import najah.edu.calc;

public class calcTest {

	@Test
	public void testAdd() {

int pp =calc.add(3,4);
assertTrue(pp == 7);
int pn =calc.add(-3,4);
assertTrue(pn == 1);
int nn =calc.add(-3,-4);
assertTrue(nn == -7);
	}

}
