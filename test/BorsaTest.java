import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {

	Borsa borsa = new Borsa();
	Attrezzo torcia;
	Attrezzo mattone;
	
	@Before
	public void setUp() {
		torcia = new Attrezzo("torcia", 2);
		mattone = new Attrezzo("mattone", 16);
	}

	@Test
	public void testAddAttrezzoPesoMinoreDiDieci() {
		assertTrue(borsa.addAttrezzo(torcia));

	}
	
	@Test
	public void testAddAttrezzoPesoMaggioreMax() {
		assertFalse(borsa.addAttrezzo(mattone));

	}
	
	@Test
	public void testGetPeso() {
		borsa.addAttrezzo(torcia);
		assertEquals(torcia, borsa.getAttrezzo("torcia"));

	}
}
