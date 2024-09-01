package io.warehouse.sensors.config.props;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "nats")
public record NatsPropertiesConfig(ServerPropertiesConfig server, List<ThresholdPropertiesConfig> thresholds) {
}
