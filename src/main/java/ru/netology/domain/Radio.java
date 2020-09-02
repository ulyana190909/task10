package ru.netology.domain;

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

    public int numberCurrentStation() {
        if (currentRadioStation <= firstRadioStation) {
            return currentRadioStation +1;
        }
        if (currentRadioStation >= lastRadioStation) {
            return currentRadioStation = lastRadioStation;
        }
        this.currentRadioStation = currentRadioStation + 1;
        return currentRadioStation;
    }

    //нажатие кнопки вперед
    public int pressButtonNext() {
        if (currentRadioStation >= lastRadioStation) {
            return currentRadioStation = firstRadioStation;
        }
        if (currentRadioStation >= firstRadioStation) {
            return currentRadioStation +1;
        }
        this.currentRadioStation = currentRadioStation +1;
        return currentRadioStation;
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
    public int pressButton() {
        if (firstRadioStation <= pressButton) {
            return pressButton;
        }
        if (pressButton <= lastRadioStation) {
            return pressButton;
        }
        this.pressButton = pressButton;
        return pressButton;
    }

    public int soundVolume() {
        if (soundVolume < minimumVolume) {
            return minimumVolume;
        }
        if (soundVolume >= maximumVolume) {
            return maximumVolume;
        }
        this.soundVolume = soundVolume + 1;
        return soundVolume;
    }

    public int maximumSoundVolume() {
        if (soundVolume == maximumVolume) {
            return maximumVolume;
        }
        this.soundVolume = soundVolume + 1;
        return soundVolume;
    }

    public int minimumSoundVolume() {
        if (soundVolume == minimumVolume) {
            return minimumVolume;
        }
        this.soundVolume = soundVolume -1;
        return soundVolume;
    }
}


