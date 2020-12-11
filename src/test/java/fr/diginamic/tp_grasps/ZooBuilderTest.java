package fr.diginamic.tp_grasps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Optional;

import org.junit.Test;

import fr.diginamic.builder.Animal;
import fr.diginamic.builder.Dauphin;
import fr.diginamic.builder.Lion;
import fr.diginamic.builder.Zone;
import fr.diginamic.builder.ZoneException;
import fr.diginamic.builder.Zoo;
import fr.diginamic.builder.ZooBuilder;

public class ZooBuilderTest {

	@Test
	public void testAppendZone() {
		ZooBuilder zb = new ZooBuilder("Parc nature");
		Zoo zoo = zb.appendZone("Savane", 2).get();
		
		assertEquals(1, zoo.getZones().size());
		assertEquals("Parc nature", zoo.getNom());
		assertEquals("Savane", zoo.getZones().get(0).getNom());
	}
	

	@Test
	public void testAppendAnimal() throws ZoneException {

		ZooBuilder zb = new ZooBuilder("Parc nature");
		String message = null;
		try {
			Zoo zoo = zb.appendZone("Savane", 2).appendZone("Aquarium", 1)
				.appendAnimal("Savane", new Lion("Leo")).appendAnimal("Aquarium", new Dauphin("Flipper"))
				.appendAnimal("Aquarium", new Dauphin("Flip")).get();	
		}catch(ZoneException e) {
			message = e.getMessage();
		}
		assertEquals("Complet", message);
			
	}
	
	@Test
	public void testAppendAnimal2(){
		ZooBuilder zb = new ZooBuilder("Parc nature");

		try {
			Zoo zoo = zb.appendZone("Savane", 2).appendZone("Aquarium", 1)
				.appendAnimal("Savane", new Lion("Leo")).appendAnimal("Aquarium", new Dauphin("Flipper")).get();
			
			assertEquals(2, zoo.getZones().size());
			assertEquals("Savane", zoo.getZones().get(0).getNom());
			assertEquals("Aquarium", zoo.getZones().get(1).getNom());
			assertEquals(1, zoo.getZones().get(0).getAnimaux().size());
			assertEquals(1, zoo.getZones().get(1).getAnimaux().size());
		} catch (ZoneException e) {
			fail();
		}

	}
	
}
