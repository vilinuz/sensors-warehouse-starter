package io.warehouse.sensors.exception;


import io.warehouse.sensors.model.SensorDetails;

public class SensorHandlerFailedException extends RuntimeException {
    public SensorHandlerFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public SensorHandlerFailedException(String message, SensorDetails sensor, Throwable cause) {
        super(String.format(message, sensor, cause.getMessage()));
    }
}
