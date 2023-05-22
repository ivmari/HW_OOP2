import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Radio;

class RadioTest {
    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(35);
        radio.decreaseVolume();

        int expected = 34;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseRadiostation() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(2);
        radio.increaseRadiostation();

        int expected = 3;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseRadiostation() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(8);
        radio.decreaseRadiostation();

        int expected = 7;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseMaxRadiostation() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(9);
        radio.increaseRadiostation();

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseMinRadiostation() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(0);
        radio.decreaseRadiostation();

        int expected = 9;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRadiostationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(20);

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRadiostationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(-10);

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }
}