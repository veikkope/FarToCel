package org.example;

public class FahrtToCel {
    public static float convertFahr(float f) {
        float c = (float)((f - 32) * 5.0 / 9.0);
        return (float)Math.round(c);
    }
}
