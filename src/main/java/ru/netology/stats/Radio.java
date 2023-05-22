package ru.netology.stats;

public class Radio {
    private int minRadiostation = 0;
    private int maxRadiostation = 9;
    private int currentRadiostation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    //GET
    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // SET
    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation > maxRadiostation) {
            return;
        }
        if (currentRadiostation < minRadiostation) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void increaseRadiostation() {
        if (currentRadiostation < maxRadiostation) {
            currentRadiostation++;
        } else {
            currentRadiostation = minRadiostation;
        }
    }

    public void decreaseRadiostation() {
        if (currentRadiostation > minRadiostation) {
            currentRadiostation--;
        } else {
            currentRadiostation = maxRadiostation;
        }
    }
}
