package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Conditioner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionerTest {

    @Test
    public void increaseTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0,conditioner.getMaxTemperature());
        conditioner.setMaxTemperature(32);
        assertEquals(0,conditioner.setMaxTemperature();
}
}