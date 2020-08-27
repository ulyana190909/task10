package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test //Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void changingCurrentRadioStation() {
        Radio radio = new Radio();
        int firstStation = 0;
        radio.setFirstRadioStation(firstStation);

        int lastStation = 9;
        radio.setLastRadioStation(lastStation);

        int currentStation = 4;
        radio.setCurrentRadioStation(currentStation);

        int expected = 5;
        int actual = radio.numberCurrentStation();
        assertEquals(expected, actual);
    }

    @Test //Если текущая радиостанция - 9 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
    public void nextCurrentStation() {
        Radio radio = new Radio();
        int firstStation = 0;
        radio.setFirstRadioStation(firstStation);

        int lastStation = 9;
        radio.setLastRadioStation(lastStation);

        int currentStation = 9;
        radio.setCurrentRadioStation(currentStation);

        int expected = 0;
        int actual = radio.pressButtonNext();

        assertEquals(expected, actual);
    }

    @Test  //Если текущая радиостанция - 0 и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать 9-ая
    public void prevCurrentStation() {
        Radio radio = new Radio();
        int firstStation = 0;
        radio.setFirstRadioStation(firstStation);

        int lastStation = 9;
        radio.setLastRadioStation(lastStation);

        int currentStation = 0;
        radio.setCurrentRadioStation(currentStation);

        int expected = 9;
        int actual = radio.pressButtonPrev();

        assertEquals(expected, actual);
    }
    @Test //Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 9)
    public void pressButtonRadioStation () {
        Radio radio = new Radio();
        int firstStation = 0;
        radio.setFirstRadioStation(firstStation);

        int lastStation = 9;
        radio.setLastRadioStation(lastStation);

        int pressButton = 5;
        radio.setPressButton(pressButton);

        int expected = 5;
        int actual = radio.pressButton();

        assertEquals(expected, actual);
    }

    @Test //Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука (в пределах от 0 до 10)
    public void changingVolume() {
        Radio radio = new Radio();
        int minimumVolume = 0;
        radio.setMinimumVolume(minimumVolume);

        int maximumVolume = 10;
        radio.setMaximumVolume(maximumVolume);

        int soundVolume = 5;
        radio.setSoundVolume(soundVolume);

        int expected = 6;
        int actual = radio.soundVolume();

        assertEquals(expected, actual);
    }

    @Test //Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
    public void maxVolume() {
        Radio radio = new Radio();
        int minimumVolume = 0;
        radio.setMinimumVolume(minimumVolume);

        int maximumVolume = 10;
        radio.setMaximumVolume(maximumVolume);

        int soundVolume = 10;
        radio.setSoundVolume(soundVolume);

        int expected = 10;
        int actual = radio.maximumSoundVolume();

        assertEquals(expected, actual);
    }
    @Test //Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить
    public void minVolume() {
        Radio radio = new Radio();
        int minimumVolume = 0;
        radio.setMinimumVolume(minimumVolume);

        int maximumVolume = 10;
        radio.setMaximumVolume(maximumVolume);

        int soundVolume = 0;
        radio.setSoundVolume(soundVolume);

        int expected = 0;
        int actual = radio.minimumSoundVolume();

        assertEquals(expected, actual);
    }

}