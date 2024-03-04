package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KelvinToFahrtTest {

    @Test
    public void testConvertKelvinToFahrt() {
        // Test case 1: 0 Kelvin should be -459.67 Fahrenheit
        assertEquals(-459.67f, KelvinToFahrt.convertKelvinToFahrt(0), 0.01f);
    }
}

