import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume( 30 );
        radio.increaseVolume();

        int expected = 31;
        int actual = radio.getCurrentVolume();

        assertEquals( expected, actual );
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume( 51 );
        radio.decreaseVolume();

        int expected = 50;
        int actual = radio.getCurrentVolume();

        assertEquals( expected, actual );
    }

    @Test
    void shouldMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume( 100 );
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals( expected, actual );
    }

    @Test
    void shouldMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume( 0 );
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals( expected, actual );
    }

    @Test
    void shouldVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume( 200 );

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals( expected, actual );
    }

    @Test
    void shouldVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume( -10 );

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals( expected, actual );
    }

    @Test
    void shouldIncreaseRadiostationNum() {
        Radio radio = new Radio();

        radio.setCurrentRadiostationNumber( 2 );
        radio.increaseRadiostationNumber();

        int expected = 3;
        int actual = radio.getCurrentRadiostationNumber();

        assertEquals( expected, actual );
    }

    @Test
    void shouldDecreaseRadiostationNum() {
        Radio radio = new Radio();

        radio.setCurrentRadiostationNumber( 9 );
        radio.decreaseRadiostationNumber();

        int expected = 8;
        int actual = radio.getCurrentRadiostationNumber();

        assertEquals( expected, actual );
    }

    @Test
    void shouldMaxRadiostationNum() {
        Radio radio = new Radio();

        radio.setCurrentRadiostationNumber( 9 );
        radio.increaseRadiostationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadiostationNumber();

        assertEquals( expected, actual );
    }

    @Test
    void shouldMinRadiostationNum() {
        Radio radio = new Radio();

        radio.setCurrentRadiostationNumber( 0 );
        radio.decreaseRadiostationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadiostationNumber();

        assertEquals( expected, actual );
    }

    @Test
    void shouldRadiostationNumAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadiostationNumber( 20 );

        int expected = 0;
        int actual = radio.getCurrentRadiostationNumber();

        assertEquals( expected, actual );
    }

    @Test
    void shouldRadiostationNumBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadiostationNumber( -10 );

        int expected = 0;
        int actual = radio.getCurrentRadiostationNumber();

        assertEquals( expected, actual );
    }


    @Test

    void shouldDefaultRadiostationAboveMax() {
        Radio radio = new Radio(30);

        radio.setCurrentRadiostationNumber(30);
        int expected = 0;
        int actual = radio.getCurrentRadiostationNumber();

        assertEquals( expected, actual );

    }



}