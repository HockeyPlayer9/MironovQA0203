package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void testfewsquares() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcService(200, 300);

        Assertions.assertEquals(expected,actual);

    }

}
