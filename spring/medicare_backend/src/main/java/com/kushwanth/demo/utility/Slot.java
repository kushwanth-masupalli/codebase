package com.kushwanth.demo.utility;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Slot {
    private LocalTime startTime;
    private LocalTime endTime;
}
