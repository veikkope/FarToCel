package org.example;


import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class FahrtToCelTest {

    @Test
    public void testConvertFahr() {
        assertEquals(0, FahrtToCel.convertFahr(32), 0.01);
    }
}
