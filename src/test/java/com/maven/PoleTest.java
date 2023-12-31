package com.maven;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PoleTest {
    @Test
    public void testKwadrat() {
        Kwadrat kwadrat = new Kwadrat();
        assertEquals(25.0, kwadrat.pole(5.0), 0.001);
    }

    @Test
    public void testProstokat() {
        Prostokat prostokat = new Prostokat();
        assertEquals(56.0, prostokat.pole(8.0,7.0), 0.001);
    }

    @Test
    public void testKolo() {
        Kolo kolo = new Kolo();
        assertEquals(Math.PI * Math.pow(5.0, 2), kolo.pole(5.0), 0.001);
    }
}