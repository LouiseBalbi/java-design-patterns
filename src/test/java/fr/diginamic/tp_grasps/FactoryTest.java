package fr.diginamic.tp_grasps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.factory.EnceinteConnectee;
import fr.diginamic.factory.ObjetFactory;
import fr.diginamic.factory.Tablette;
import fr.diginamic.factory.TelephonePortable;
import fr.diginamic.factory.TypeObjet;

public class FactoryTest {
	
	@Test
	public void testGetInstanceTelephonePortable() {
		TelephonePortable telephone = new TelephonePortable(4);
		assertEquals(telephone, ObjetFactory.getObjet(TypeObjet.TELEPHONE, 4));
		
	}	
	
	@Test
	public void testGetInstanceEnceinteConnectee() {	
		EnceinteConnectee enceinte = new EnceinteConnectee(4);
		assertEquals(enceinte, ObjetFactory.getObjet(TypeObjet.ENCEINTE, 4));
		
	}
	
	@Test
	public void testGetInstanceTablette() {	
		Tablette tablette = new Tablette(4);
		assertEquals(tablette, ObjetFactory.getObjet(TypeObjet.TABLETTE, 4));	
	}
	
//	@Test
//	public void testGetInstanceTabletteFalse() {	
//		EnceinteConnectee tablette = new EnceinteConnectee(4);
//		assertEquals(tablette, ObjetFactory.getObjet(TypeObjet.TABLETTE, 4));	
//	}
	


}
