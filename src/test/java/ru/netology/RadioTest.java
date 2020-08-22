package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

public class RadioTest {
    @Test
    public void firstTest() {
        Radio radio = new Radio();
        int firstStation = 0;
        radio.getFirstRadioStation(firstStation);

        int lastStation = 10;
        radio.getLastRadioStation(lastStation);




    }


}
