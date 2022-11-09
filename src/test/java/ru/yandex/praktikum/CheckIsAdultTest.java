package ru.yandex.praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][]{
                {17, false},
                {18, true},
                {21, true},
                {22, true},
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        CheckIsAdult checkIsAdult = new CheckIsAdult();
        boolean adultAge = true;
        boolean isAdult = checkIsAdult.isAdult(18);

        assertEquals("Если совершеннолетие в 18 -true при 18 и выше , если совершеннолетие в 21 -true в 21 и выше", adultAge, isAdult);
    }
}