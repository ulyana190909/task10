package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import javax.xml.stream.FactoryConfigurationError;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
   private Radio radio = new Radio();

    @Test  //Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void changingCurrentRadioStation1() {
        int currentStation = 4;
        radio.setCurrentRadioStation(currentStation);

        int expected = 5;
        radio.numberCurrentStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test //Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void changingCurrentRadioStation2() {
        int currentStation = 9;
        radio.setCurrentRadioStation(currentStation);

        int expected = 9;
        radio.numberCurrentStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test //Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void changingCurrentRadioStation3() {
        int currentStation = 0;
        radio.setCurrentRadioStation(currentStation);

        int expected = 1;
        radio.numberCurrentStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    //Если текущая радиостанция - 9 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
    public void nextCurrentStation1() {
        int currentStation = 9;
        radio.setCurrentRadioStation(currentStation);

        int expected = 0;
        radio.pressButtonNext();
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    //Если текущая радиостанция - 5 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 6-ая
    public void nextCurrentStation2() {
        int currentStation = 5;
        radio.setCurrentRadioStation(currentStation);

        int expected = 6;
        radio.pressButtonNext();
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    //Если текущая радиостанция - 0 и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать 9-ая
    public void prevCurrentStation1() {
        int currentStation = 0;
        radio.setCurrentRadioStation(currentStation);

        int expected = 9;
        radio.pressButtonPrev();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    //Если текущая радиостанция - 5 и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать 4-ая
    public void prevCurrentStation2() {
        int currentStation = 5;
        radio.setCurrentRadioStation(currentStation);

        int expected = 4;
        radio.pressButtonPrev();
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test //Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 9)
    public void pressButtonRadioStation1() {
        int pressButton = 5;
        radio.setPressButton(pressButton);

        int expected = 5;
        radio.pressButton();
        int actual = radio.getPressButton();
        assertEquals(expected, actual);
    }

    @Test //Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 9)
    public void pressButtonRadioStation2() {
        int pressButton = 9;
        radio.setPressButton(pressButton);

        int expected = 9;
        radio.pressButton();
        int actual = radio.getPressButton();

        assertEquals(expected, actual);
    }

    @Test //Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 9)
    public void pressButtonRadioStation3() {
        int pressButton = 0;
        radio.setPressButton(pressButton);

        int expected = 0;
        radio.pressButton();
        int actual = radio.getPressButton();

        assertEquals(expected, actual);
    }

    @Test //Клиент должен иметь возможность увеличивать уровень громкости звука (в пределах от 0 до 100)
    public void changingVolumePlus1() {
        int soundVolume = 55;
        radio.setSoundVolume(soundVolume);

        int expected = 56;
        radio.setSoundVolumePlus();
        int actual = radio.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //Клиент должен иметь возможность увеличивать уровень громкости звука (в пределах от 0 до 100)
    public void changingVolumePlus2() {
        int soundVolume = 100;
        radio.setSoundVolume(soundVolume);

        int expected = 100;
        radio.setSoundVolumePlus();
        int actual = radio.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //Клиент должен иметь возможность уменьшать уровень громкости звука (в пределах от 0 до 100)
    public void changingVolumeMinus1() {
        int soundVolume = 55;
        radio.setSoundVolume(soundVolume);

        int expected = 54;
        radio.setSoundVolumeMinus();
        int actual = radio.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //Клиент должен иметь возможность уменьшать уровень громкости звука (в пределах от 0 до 100)
    public void changingVolumeMinus2() {
        int soundVolume = 0;
        radio.setSoundVolume(soundVolume);

        int expected = 0;
        radio.setSoundVolumeMinus();
        int actual = radio.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    //Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
    public void maxVolume() {
        int soundVolume = 100;
        radio.setSoundVolume(soundVolume);

        int expected = 100;
        radio.maximumSoundVolume();
        int actual = radio.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    //Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
    public void maxVolume2() {
        int soundVolume = 7;
        radio.setSoundVolume(soundVolume);

        int expected = 8;
        radio.maximumSoundVolume();
        int actual = radio.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    //Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить
    public void minVolume1() {
        int soundVolume = 0;
        radio.setSoundVolume(soundVolume);

        int expected = 0;
        radio.minimumSoundVolume();
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    //Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить
    public void minVolume2() {
        int soundVolume = 5;
        radio.setSoundVolume(soundVolume);

        int expected = 4;
        radio.minimumSoundVolume();
        int actual = radio.getSoundVolume();
        assertEquals(expected, actual);
    }

}