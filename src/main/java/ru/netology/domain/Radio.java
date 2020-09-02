package ru.netology.domain;

import javax.print.DocFlavor;
import java.util.concurrent.Callable;

public class Radio {
    private int currentRadioStation;  //текущая радиостанция
    private int firstRadioStation; //первая радиостанция
    private int lastRadioStation; // последняя радиостанция
    private int pressButton; //выбор радиостанции
    private int soundVolume;  //громкость звука
    private int minimumVolume; //минимальный звук
    private int maximumVolume; //максимальный звук

    public int getPressButton() {
        return pressButton;
    }

    public void setPressButton(int pressButton) {
        this.pressButton = pressButton;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public int getFirstRadioStation(int firstStation) {
        return firstRadioStation;
    }

    public void setFirstRadioStation(int firstRadioStation) {
        this.firstRadioStation = firstRadioStation;
    }

    public int getLastRadioStation(int lastStation) {
        return lastRadioStation;
    }

    public void setLastRadioStation(int lastRadioStation) {
        this.lastRadioStation = lastRadioStation;
    }

    public int getMinimumVolume() {
        return minimumVolume;
    }

    public void setMinimumVolume(int minimumVolume) {
        this.minimumVolume = minimumVolume;
    }

    public int getMaximumVolume() {
        return maximumVolume;
    }

    public void setMaximumVolume(int maximumVolume) {
        this.maximumVolume = maximumVolume;
    }


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


