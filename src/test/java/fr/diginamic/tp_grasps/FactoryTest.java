package fr.diginamic.tp_grasps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import fr.diginamic.factory.EnceinteConnectee;
import fr.diginamic.factory.IObjetFactory;
import fr.diginamic.factory.ObjetConnecte;
import fr.diginamic.factory.ObjetFactory;
import fr.diginamic.factory.Tablette;
import fr.diginamic.factory.TelephonePortable;
import fr.diginamic.factory.TypeObjet;

public class FactoryTest {
	
	private IObjetFactory objetFactory = new ObjetFactory();
	
	@Test
	public void testGetObjet() {
		ObjetConnecte ob = objetFactory.getObjet(TypeObjet.TELEPHONE, 10);
		assertEquals(TelephonePortable.class, ob.getClass());
		assertEquals(10, ob.getLimiteVolts());		
	}
	
	@Test
	public void testGetObjet2() {
		ObjetConnecte ob = objetFactory.getObjet(TypeObjet.TABLETTE, 10);
		assertEquals(Tablette.class, ob.getClass());
		assertEquals(10, ob.getLimiteVolts());		
	}
	
	@Test
	public void testGetObjet3() {
		ObjetConnecte ob = objetFactory.getObjet(null, 10);
		assertNull(ob);
	}
	
	
	
//	@Test
//	public void testGetInstanceTelephonePortable() {
//		TelephonePortable telephone = new TelephonePortable(4);
//		assertEquals(telephone, objetFactory.getObjet(TypeObjet.TELEPHONE, 4));
//		
//	}	
//	
//	@Test
//	public void testGetInstanceEnceinteConnectee() {	
//		EnceinteConnectee enceinte = new EnceinteConnectee(4);
//		assertEquals(enceinte, objetFactory.getObjet(TypeObjet.ENCEINTE, 4));
//		
//	}
//	
//	@Test
//	public void testGetInstanceTablette() {	
//		Tablette tablette = new Tablette(4);
//		assertEquals(tablette, objetFactory.getObjet(TypeObjet.TABLETTE, 4));	
//	}
	
//	@Test
//	public void testGetInstanceTabletteFalse() {	
//		EnceinteConnectee tablette = new EnceinteConnectee(4);
//		assertEquals(tablette, ObjetFactory.getObjet(TypeObjet.TABLETTE, 4));	
//	}
	
	


}
