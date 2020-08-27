package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return maxTemperature;
        }
        if (currentTemperature < minTemperature) {
            return minTemperature;
        }
        this.currentTemperature = currentTemperature;
        return currentTemperature;
    }

    public int setIncreaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return maxTemperature;
        }
        this.currentTemperature = currentTemperature + 1;
        return currentTemperature;
    }

    public int decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return minTemperature;
        }
        this.currentTemperature = currentTemperature - 1;
        return currentTemperature;
    }
}


