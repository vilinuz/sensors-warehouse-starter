package io.warehouse.sensors.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum SensorType {
    TEMPERATURE("temperature", "t1"),
    HUMIDITY("humidity", "h1");

    private final String subject;
    private final String id;
}
