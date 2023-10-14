package com.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class PoleTest {
    @Test
    public void testKwadrat() {
        Kwadrat k = new Kwadrat();
        Assert.assertEquals(25.0, k.pole(5.0), 0.001);
    }

    @Test
    public void testProstokat() {
        Prostokat k = new Prostokat();
        assertEquals(56.0, k.pole(8.0,7.0), 0.001);
    }

    @Test
    public void testKolo() {
        Kolo k = new Kolo();
        assertEquals(Math.PI * Math.pow(5.0, 2), k.pole(5.0), 0.001);
    }
}