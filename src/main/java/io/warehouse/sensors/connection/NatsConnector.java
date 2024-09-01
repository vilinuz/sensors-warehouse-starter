package io.warehouse.sensors.connection;

import io.nats.client.Connection;
import io.nats.client.Nats;
import io.nats.client.Options;
import io.warehouse.sensors.config.props.NatsPropertiesConfig;
import io.warehouse.sensors.exception.SensorHandlerFailedException;

import java.io.IOException;
import java.time.Duration;

public class NatsConnector {
    private final NatsPropertiesConfig config;

    public NatsConnector(NatsPropertiesConfig config) {
        this.config = config;
    }

    public Connection connect() {
        Options options = Options.builder()
                .server(config.server().uri())
                .connectionTimeout(Duration.ofSeconds(3))
                .pingInterval(Duration.ofSeconds(5))
                .reconnectWait(Duration.ofSeconds(1))
                .userInfo(config.server().user(), config.server().password())
                .build();

        try {
            return Nats.connect(options);
        } catch (IOException | InterruptedException e) {
            throw new SensorHandlerFailedException("Sensor Handler %s failed to start with cause: %s",  e);
        }
    }
}
