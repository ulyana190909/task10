package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Conditioner;

import javax.xml.stream.FactoryConfigurationError;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @BeforeEach
    public void setUpConditioner() {
        int maxTemperature = 35;
        conditioner.setMaxTemperature(maxTemperature);

        int minTemperature = 5;
        conditioner.setMinTemperature(minTemperature);
    }

    @Test
    public void increaseTest1Temperature() {
        int current = 5;
        conditioner.setCurrentTemperature(current);

        int expected = 6;
        int actual = conditioner.setIncreaseCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseTest2Temperature() {
        int current = 35;
        conditioner.setCurrentTemperature(current);

        int expected = 35;
        int actual = conditioner.setIncreaseCurrentTemperature();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseTest3Temperature() {
        int current = 20;
        conditioner.setCurrentTemperature(current);

        int expected = 21;
        int actual = conditioner.setIncreaseCurrentTemperature();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseTest1Temperature() {
        int current = 20;
        conditioner.setCurrentTemperature(current);

        int expected = 19;
        int actual = conditioner.decreaseCurrentTemperature();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseTest2Temperature() {
        int current = 5;
        conditioner.setCurrentTemperature(current);

        int expected = 5;
        int actual = conditioner.decreaseCurrentTemperature();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseTest3Temperature() {
        int current = 35;
        conditioner.setCurrentTemperature(current);

        int expected = 34;
        int actual = conditioner.decreaseCurrentTemperature();

        assertEquals(expected, actual);
    }
}

