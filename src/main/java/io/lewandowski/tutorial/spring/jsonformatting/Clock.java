package io.lewandowski.tutorial.spring.jsonformatting;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public final class Clock {

    @JsonFormat(pattern = "dd::MM::yyyy")
    private final LocalDate localDate;

    @JsonFormat(pattern = "KK:mm a")
    private final LocalTime localTime;

    private final LocalDateTime localDateTime;

    public Clock() {
        this.localDate = LocalDate.of(2016, 1, 1);
        this.localTime = LocalTime.of(10, 24);
        this.localDateTime = LocalDateTime.of(localDate, localTime);
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

}
