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
        this.maxTemperature = 32;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int MinTemperature) {
        this.minTemperature = 5;
    }

    public void setIncreaseCurrentTemperature(int currentTemperature) {
        int increaseCurrent = currentTemperature + 1;
        {
            if (increaseCurrent < maxTemperature) {
                return;
            }
            if (increaseCurrent > minTemperature){
                return;
            }
            }
            this.currentTemperature = increaseCurrent;
        }

    public void decreaseCurrentTemperature(int currentTemperature) {
        int decreaseCurrent = currentTemperature - 1;
        {
            if (decreaseCurrent < maxTemperature) {
                return;
            }
            if (decreaseCurrent > minTemperature){
                return;
            }
        }
        this.currentTemperature = decreaseCurrent;
    }
}
