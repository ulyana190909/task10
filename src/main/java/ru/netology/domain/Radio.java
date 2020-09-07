package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.DocFlavor;
import java.util.concurrent.Callable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;  //текущая радиостанция
    private int firstRadioStation = 0; //первая радиостанция
    private int lastRadioStation = 9; // последняя радиостанция
    private int pressButton; //выбор радиостанции
    private int soundVolume;  //громкость звука
    private int minimumVolume = 0; //минимальный звук
    private int maximumVolume = 100; //максимальный звук


    //изменение текущей станции в пределах первой - последней радиостанции
    public void numberCurrentStation() {
        if (currentRadioStation >= lastRadioStation) {
            currentRadioStation = lastRadioStation;
            return;
        }
        currentRadioStation = currentRadioStation + 1;
    }

    //нажатие кнопки вперед
    public void pressButtonNext() {
        if (currentRadioStation >= lastRadioStation) {
            currentRadioStation = firstRadioStation;
            return;
        }
        currentRadioStation = currentRadioStation + 1;
    }

    //нажатие кнопки назад
    public void pressButtonPrev() {
        if (currentRadioStation <= firstRadioStation) {
            currentRadioStation = lastRadioStation;
            return;
        }
        currentRadioStation = currentRadioStation - 1;
    }

    //выбор на пульте
    public void pressButton() {
        if (pressButton <= firstRadioStation) {
            pressButton = firstRadioStation;
            return;
        }
        if (pressButton >= lastRadioStation) {
            pressButton = lastRadioStation;
            return;
        }
        pressButton = pressButton + 0;

    }

    //увеличение уровня звука
    public void setSoundVolumePlus() {
        if (soundVolume >= maximumVolume) {
            soundVolume = maximumVolume;
            return;
        }
        soundVolume = soundVolume + 1;
    }

    //уменьшение уровня звука
    public void setSoundVolumeMinus() {
        if (soundVolume <= minimumVolume) {
            soundVolume = minimumVolume;
            return;
        }
        soundVolume = soundVolume - 1;
    }

    //максимальный уровень громкости
    public void maximumSoundVolume() {
        if (soundVolume >= maximumVolume) {
            soundVolume = maximumVolume;
            return;
        }
        soundVolume = soundVolume + 1;
    }

    //минимальный уровень громкости
    public void minimumSoundVolume() {
        if (soundVolume <= minimumVolume) {
            soundVolume = minimumVolume;
            return;
        }
        soundVolume = soundVolume - 1;
    }
}


