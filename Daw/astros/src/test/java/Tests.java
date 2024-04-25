import org.example.Planetas;
import org.example.Satelite;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testPlanetasConstructorAndGetters() {
        Planetas planeta = new Planetas(10.0, 24.0, 5.0, 300.0, 9.8, 100.0, 200.0, true);
        assertEquals(100.0, planeta.getDistanciaAlSol(), 0.01);
        assertEquals(200.0, planeta.getOrbita(), 0.01);
        assertTrue(planeta.getTieneSatelites());
    }

    @Test
    public void testPlanetasSetters() {
        Planetas planeta = new Planetas(10.0, 24.0, 5.0, 300.0, 9.8, 100.0, 200.0, true);
        planeta.setDistanciaAlSol(150.0);
        planeta.setOrbita(250.0);
        planeta.setTieneSatelites(false);
        assertEquals(150.0, planeta.getDistanciaAlSol(), 0.01);
        assertEquals(250.0, planeta.getOrbita(), 0.01);
        assertFalse(planeta.getTieneSatelites());
    }

    @Test
    public void testPlanetasToString() {
        Planetas planeta = new Planetas(10.0, 24.0, 5.0, 300.0, 9.8, 100.0, 200.0, true);
        assertEquals("Planetas{distanciaAlSol=100.0, orbita=200.0, satelites=[], radio=10.0, rotacion=24.0, masa=5.0, temperatura=300.0, gravedad=9.8}", planeta.toString());
    }

    @Test
    public void testSateliteConstructorAndGetters() {
        Planetas planeta = new Planetas(10.0, 24.0, 5.0, 300.0, 9.8, 100.0, 200.0, true);
        Satelite satelite = new Satelite(5.0, 12.0, 2.0, 100.0, 5.0, 50.0, 100.0, planeta);
        assertEquals(50.0, satelite.getDistanciaAlPlaneta(), 0.01);
        assertEquals(100.0, satelite.getOrbita(), 0.01);
        assertEquals(planeta, satelite.getPlaneta());
    }

    @Test
    public void testSateliteSetters() {
        Planetas planeta1 = new Planetas(10.0, 24.0, 5.0, 300.0, 9.8, 100.0, 200.0, true);
        Planetas planeta2 = new Planetas(15.0, 30.0, 8.0, 400.0, 7.0, 150.0, 300.0, false);
        Satelite satelite = new Satelite(5.0, 12.0, 2.0, 100.0, 5.0, 50.0, 100.0, planeta1);
        satelite.setDistanciaAlPlaneta(75.0);
        satelite.setOrbita(150.0);
        satelite.setPlaneta(planeta2);
        assertEquals(75.0, satelite.getDistanciaAlPlaneta(), 0.01);
        assertEquals(150.0, satelite.getOrbita(), 0.01);
        assertEquals(planeta2, satelite.getPlaneta());
    }

    @Test
    public void testSateliteToString() {
        Planetas planeta = new Planetas(10.0, 24.0, 5.0, 300.0, 9.8, 100.0, 200.0, true);
        Satelite satelite = new Satelite(5.0, 12.0, 2.0, 100.0, 5.0, 50.0, 100.0, planeta);
        assertEquals("Satelites{distanciaAlPlaneta=50.0, orbita=100.0, planeta=Planetas{distanciaAlSol=100.0, orbita=200.0, satelites=[], radio=10.0, rotacion=24.0, masa=5.0, temperatura=300.0, gravedad=9.8}, radio=5.0, rotacion=12.0, masa=2.0, temperatura=100.0, gravedad=5.0}", satelite.toString());
    }
}