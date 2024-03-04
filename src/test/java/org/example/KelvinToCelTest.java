package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class KelvinToCelTest {

    @Test
    public void testConvertKelvinToCelsius() {
        assertEquals(0, KelvinToCel.convertKelvinToCelsius(273.15f), 0.01);
    }
}
