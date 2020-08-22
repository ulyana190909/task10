package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;
    private int firstRadioStation;
    private int lastRadioStation;
    private int next;
    private int prev;
    private int numberPressStation;

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

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public int getNumberPressStation() {
        return numberPressStation;
    }

    public void setNumberPressStation(int numberPressStation) {
        this.numberPressStation = numberPressStation;
    }

    //изменение текущей станции в пределах первой - последней станции
    public int numberCurrentStation () {
        if (currentRadioStation >= firstRadioStation) {
            return currentRadioStation;
        }
        if (currentRadioStation <= lastRadioStation) {
            return currentRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
        return currentRadioStation;
    }

    //нажатие кнопки вперед
    public int pressButtonNext () {
        if (lastRadioStation < currentRadioStation) {
            return firstRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
        return currentRadioStation;
    }

    //нажатие кнопки назад
    public int pressButtonPrev () {
        if(firstRadioStation > currentRadioStation) {
            return lastRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
        return currentRadioStation;
    }

    //выбор на пульте (пока в работе)
}

