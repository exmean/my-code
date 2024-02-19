package com.example.newtab;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ConsentTest {

    @Test
    void 개인정보동의_정책_시행일을_검증한다_성공케이스() {
        LocalDate date = LocalDate.of(2024, 3, 1);
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        Assertions.assertThat(month == 3 && day == 1).isEqualTo(true);
    }

    @Test
    void 개인정보동의_정책_시행일을_검증한다_실패케이스() {
        LocalDate date = LocalDate.of(2024, 3, 2);
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        Assertions.assertThat(month == 3 && day == 1).isEqualTo(false);
    }
}
