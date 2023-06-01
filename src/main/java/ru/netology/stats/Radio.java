package ru.netology.stats;

public class Radio {
    public int setCurrentChannel;
    private int currentChannel;
    private int currentVolume;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    // увеличение звука на 1. если пытаемся увеличить больше 10, возвращаем 9.
    public int NextVolume() {
        currentVolume++;
        if (currentVolume > maxVolume) {
            return currentVolume--;
        }
        return currentVolume;
    }


    // уменьшение звука на 1. если звк пытаемся уменьшить меньше 1, возвращаем 1
    public int PrevVolume() {
        currentVolume--;
        if (currentVolume < minVolume) {
            return currentVolume++;
        }
        return currentVolume;
    }

    // увеличение канала на 1. если канал уже 9, возвращаем 9
    public int NextChannel() {
        currentChannel++;
        if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;;
        }
        return currentChannel;
    }

    // уменьшение канала на 1. если канал уже 1, возвращается 1
    public int PrevChannel() {
        currentChannel--;
        if (currentChannel < minChannel) {
            currentChannel = maxChannel;
        }
        return currentChannel;
    }


    // метод get для канала
    public int getCurrentChannel() {
        return currentChannel;
    }

    // метод для set канала. взависимости от значения относительно min-max
    public void setCurrentChannel(int currentChannel) {

        if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    // метод get для звука
    public int getCurrentVolume() {
        return currentVolume;
    }

    // метод set  для звука взависимости ль min-max
    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentChannel = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
}
