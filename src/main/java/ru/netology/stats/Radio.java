package ru.netology.stats;

public class Radio {
    private int minRadiostationNumber = 0;
    private int defaultRadiostation = 10;
    private int maxRadiostationNumber = defaultRadiostation - 1;
    private int currentRadiostationNumber;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {

    }

    public Radio(int defaultRadiostation ) {

        this.maxRadiostationNumber= defaultRadiostation -1;

    }

    //GET
    public int getCurrentRadiostationNumber() {
        return currentRadiostationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // SET
    public void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        if (currentRadiostationNumber > maxRadiostationNumber) {
            return;
        }
        if (currentRadiostationNumber < minRadiostationNumber) {
            return;
        }
        this.currentRadiostationNumber = currentRadiostationNumber;
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

    public void increaseRadiostationNumber() {
        if (currentRadiostationNumber < maxRadiostationNumber) {
            currentRadiostationNumber++;
        } else {
            currentRadiostationNumber = minRadiostationNumber;
        }
    }

    public void decreaseRadiostationNumber() {
        if (currentRadiostationNumber > minRadiostationNumber) {
            currentRadiostationNumber--;
        } else {
            currentRadiostationNumber = maxRadiostationNumber;
        }
    }

}