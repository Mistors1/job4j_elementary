package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TrgAreaTest {

    @Test
    void area() {
        double a = 5;
        double b = 8;
        double c = 6;
        double expected = 14.981;
        double result = TrgArea.area(a, b, c);
        assertThat(result).isCloseTo(expected, offset(0.01));
        }
    }
