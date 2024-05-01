import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {
	
	Giocatore p = new Giocatore();
	
	@Test
	public void testGetCfuDefault() {
		assertEquals(20, p.getCfu());
	}
	
	@Test
	public void testSetCfu() {
		p.setCfu(10);
		assertEquals(10, p.getCfu());
	}

	@Test
	public void testGetBorsaDefault() {
		assertNotNull(p.getBorsa());
	}
}
