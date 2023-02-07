package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void sqrWithinBordersWithSomeMatches() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.sQRWithinBorders(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrWithinBordersLowerIntervalIncluded() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.sQRWithinBorders(0, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrWithinBordersLowerIntervalNoMatches() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sQRWithinBorders(0, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrWithinBordersUpperIntervalIncluded() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.sQRWithinBorders(9801, 1_000_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrWithinBordersUpperIntervalINoMatches() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sQRWithinBorders(9802, 1_000_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrWithinBordersWholeInterval() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.sQRWithinBorders(100, 9801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrWithinBordersInternalIntervalNoMatches() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sQRWithinBorders(101, 120);

        Assertions.assertEquals(expected, actual);
    }
}