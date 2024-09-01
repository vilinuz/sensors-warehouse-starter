package io.warehouse.sensors.config;

import io.warehouse.sensors.config.props.NatsPropertiesConfig;
import io.warehouse.sensors.connection.NatsConnector;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class NatsConfig {
    @Bean
    public NatsConnector natsConnector(final NatsPropertiesConfig natsPropertiesConfig) {
        return new NatsConnector(natsPropertiesConfig);
    }
}
