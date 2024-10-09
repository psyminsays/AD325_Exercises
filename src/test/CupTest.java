import main.Cup;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    private Cup cup;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        cup = new Cup("Water", 75.0);
    }

    @org.junit.jupiter.api.Test
    void getLiquidType() {
        assertEquals("Water", cup.getLiquidType());
    }

    @org.junit.jupiter.api.Test
    void setLiquidType() {
        cup.setLiquidType("Juice");
        assertEquals("Juice", cup.getLiquidType());
    }

    @org.junit.jupiter.api.Test
    void getPercentFull() {
        assertEquals(75.0, cup.getPercentFull());
    }

    @org.junit.jupiter.api.Test
    void setPercentFull() {
        cup.setPercentFull(50.0);
        assertEquals(50.0, cup.getPercentFull());
    }

    // Optional: Additional tests for boundary cases
    @org.junit.jupiter.api.Test
    void setPercentFullBelowZero() {
        cup.setPercentFull(-10.0);
        assertEquals(-10.0, cup.getPercentFull());
    }

    @org.junit.jupiter.api.Test
    void setPercentFullAboveHundred() {
        cup.setPercentFull(110.0);
        assertEquals(110.0, cup.getPercentFull());
    }

    // New tests
    @org.junit.jupiter.api.Test
    void setLiquidTypeToEmptyString() {
        cup.setLiquidType("");
        assertEquals("", cup.getLiquidType());
    }

    @org.junit.jupiter.api.Test
    void setLiquidTypeToNull() {
        cup.setLiquidType(null);
        assertNull(cup.getLiquidType());
    }

    @org.junit.jupiter.api.Test
    void setPercentFullToZero() {
        cup.setPercentFull(0.0);
        assertEquals(0.0, cup.getPercentFull());
    }

    @org.junit.jupiter.api.Test
    void setPercentFullToHundred() {
        cup.setPercentFull(100.0);
        assertEquals(100.0, cup.getPercentFull());
    }
}
