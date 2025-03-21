package fact.it.projectthemepark;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import fact.it.projectthemepark.model.ThemePark;
import fact.it.projectthemepark.model.Attraction;
import fact.it.projectthemepark.model.Visitor;

@SpringBootTest
public class ThemeParkTests {

    /**
     * Test of constructor en getters
     */
    @Test
    public void testConstructorEnGetters() {
        ThemePark efteling = new ThemePark("Efteling");
        Assertions.assertEquals("Efteling", efteling.getName());
    }

    /**
     * Test of setName method, of class ThemePark.
     */
    @Test
    public void testSetName() {
        ThemePark efteling = new ThemePark("Efteling");
        efteling.setName("Efteling");
        Assertions.assertEquals("Efteling", efteling.getName());
    }

    /**
     * check constructor of themePark + adding of attraction check if you can
     * find an attraction by name
     */
    @Test
    public void checkAddAttractionAndGetNumber() {
        ThemePark park1 = new ThemePark("Bobbejaanland");
        Assertions.assertEquals(0, park1.getNumberOfAttractions());
        Attraction attraction = new Attraction("ElRio");
        park1.addAttraction(attraction);
        Assertions.assertEquals(1, park1.getNumberOfAttractions());
        Attraction attraction1 = new Attraction("Fury");
        park1.addAttraction(attraction1);
        Assertions.assertEquals(2, park1.getNumberOfAttractions());
        Attraction[] array = new Attraction[2];
        array[0] = attraction;
        array[1] = attraction1;
        Assertions.assertArrayEquals(array, park1.getAttractions().toArray());
    }



    /**
     * Test of search by Name
     */
    @Test
    public void testSearchAttractionbyName() {
        ThemePark park2 = new ThemePark("Bobbejaanland");
        Assertions.assertEquals(0, park2.getNumberOfAttractions());
        Attraction attraction = new Attraction("ElRio");
        park2.addAttraction(attraction);
        Assertions.assertEquals(1, park2.getNumberOfAttractions());
        Attraction attraction1 = new Attraction("Fury");
        park2.addAttraction(attraction1);
        Assertions.assertEquals(2, park2.getNumberOfAttractions());
        Assertions.assertNotNull(park2.searchAttractionByName("Fury"));
        Assertions.assertEquals(attraction1.getName(), park2.searchAttractionByName("Fury").getName());
        Assertions.assertNull(park2.searchAttractionByName("blabla"));
    }

    /**
     * before a Visitor can make his reservations, he has to register to the
     * ThemePark as result of this registration he will receive a theme park code
     */
    @Test
    public void testRegisterVisitor() {
        Visitor visitor1 = new Visitor("Donald", "Duck");
        ThemePark efteling = new ThemePark("Efteling");
        efteling.registerVisitor(visitor1);
        Assertions.assertEquals("Ef1", visitor1.getThemeParkCode());
        Visitor visitor2 = new Visitor("Mickey", "Mouse");
        efteling.registerVisitor(visitor2);
        Assertions.assertEquals("Ef2", visitor2.getThemeParkCode());
        Assertions.assertEquals(2, efteling.getNumberVisitors());
    }

}
