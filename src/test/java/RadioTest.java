import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldRunRadio() {
        Radio variable = new Radio();
        assertEquals( 0, variable.getMinChannel() );
        assertEquals( 9, variable.getMaxChannel() );
        assertEquals( 0, variable.getMinVolume() );
        assertEquals( 10, variable.getMaxVolume() );
    }

    @Test // взять следующий канал
    public void shouldGetNextChannel() {
        Radio specimen = new Radio();
        specimen.setCurrentChannel(8); // установить текущий канал
        specimen.NextChannel(); // вызвать метод получения следующего канала, добавляющий +1
        int expected = 9; // предсказать какой будет канал
        int actual = specimen.getCurrentChannel();
        assertEquals( expected, actual ); // сравнить ожидаемое и новое состояние канала
    }

    @Test
    public void shouldGetNextChannelMax() {
        Radio specimen = new Radio();
        specimen.setCurrentChannel(9);
        specimen.NextChannel();
        int expected = 0;
        int actual = specimen.getCurrentChannel();
        assertEquals( expected, actual );

    }

    @Test
    public void shouldGetPrevChannel() {
        Radio specimen = new Radio();
        specimen.setCurrentChannel(5);
        specimen.PrevChannel();
        int expected = 4;
        int actual = specimen.getCurrentChannel();
        assertEquals( expected, actual );
    }

    @Test
    public void shouldGetPrevChannelLessUnit() {
        Radio specimen = new Radio();
        specimen.setCurrentChannel(0);
        specimen.PrevChannel();
        int expected = 9;
        int actual = specimen.getCurrentChannel();
        assertEquals( expected, actual );
    }

    @Test
    public void shouldGetCurrentVolume() {
        Radio specimen = new Radio();
        specimen.setCurrentVolume(5);
        specimen.NextVolume();
        int expected = 6;
        int actual = specimen.getCurrentVolume();
        assertEquals( expected, actual );
    }

    @Test
    public void shouldGetNextVolumeMax() {
        Radio specimen = new Radio();
        specimen.setCurrentVolume(10);
        specimen.NextVolume();
        int expected = 10;
        int actual = specimen.getCurrentVolume();
        assertEquals( expected, actual );
    }

    @Test
    public void shouldGetPrevCVolume() {
        Radio specimen = new Radio();
        specimen.setCurrentVolume(5);
        specimen.PrevVolume();
        int expected = 4;
        int actual = specimen.getCurrentVolume();
        assertEquals( expected, actual );
    }

    @Test
    public void shouldGetPrevVolumeLessUnit() {
        Radio specimen = new Radio();
        specimen.setCurrentVolume(0);
        specimen.PrevVolume();
        int expected = 0;
        int actual = specimen.getCurrentVolume();
        assertEquals( expected, actual );
    }

    //100% покрытие
    @Test //текущий канал
    public void shouldSetCurrentChannel() {
        Radio specimen = new Radio();
        specimen.setCurrentChannel(7);
        int expected = 7;
        int actual = specimen.getCurrentChannel();
        assertEquals( expected, actual );
    }

    @Test // меньше минимума + проверка на отриц. значение
    public void shouldSetCurrentChannelLessUnite() {
        Radio specimen = new Radio();
        specimen.setCurrentChannel(-1);
        int expected = 9;
        int actual = specimen.getCurrentChannel();
        assertEquals( expected, actual );
    }

    @Test // максимальный канал
    public void shouldSetMaxChannel() {
        Radio specimen = new Radio();
        specimen.setMaxChannel(9);
        int expected = 9;
        int actual = specimen.getMaxChannel();
        assertEquals( expected, actual );

    }

    @Test //миннимальный канал
    public void shouldSetMinChannel() {
        Radio specimen = new Radio();
        specimen.setMinChannel(0);
        int expected = 0;
        int actual = specimen.getMinChannel();
        assertEquals( expected, actual );
    }

    @Test // текущий звук
    public void shouldSetCurrentVolume() {
        Radio specimen = new Radio();
        specimen.setCurrentVolume(2);
        int expected = 2;
        int actual = specimen.getCurrentVolume();
        assertEquals( expected, actual );
    }

    @Test // звук больше 10
    public void shouldSetCurrentVolumeExtra() {
        Radio specimen = new Radio();
        specimen.setCurrentVolume(11);
        int expected = 10;
        int actual = specimen.getCurrentVolume();
        assertEquals( expected, actual );
    }

    @Test // звук меньше 0 + отриц значения
    public void shouldSetCurrentVolumeExtraLow() {
        Radio specimen = new Radio();
        specimen.setCurrentVolume(-1);
        int expected = 0;
        int actual = specimen.getCurrentVolume();
        assertEquals( expected, actual );
    }

    @Test // минимальный звук, 0
    public void shouldSetMinVolume() {
        Radio specimen = new Radio();
        specimen.setMinVolume( 0 );
        int expected = 0;
        int actual = specimen.getMinVolume();
        assertEquals( expected, actual );
    }

    @Test //максимальный звук, 10
    public void shouldSetMaxVolume() {
        Radio specimen = new Radio();
        specimen.setMaxVolume( 10 );
        int expected = 10;
        int actual = specimen.getMaxVolume();
        assertEquals( expected, actual );
    }

    @Test // звук больше 10
    public void shouldSetCurrentChannelExtra() {
        Radio specimen = new Radio();
        specimen.setCurrentChannel( 10 );
        int expected = 0;
        int actual = specimen.getCurrentChannel();
        assertEquals( expected, actual );
    }
}
