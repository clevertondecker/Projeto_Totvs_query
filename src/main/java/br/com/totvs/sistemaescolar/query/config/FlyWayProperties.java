package br.com.totvs.sistemaescolar.query.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "spring.flyway", ignoreUnknownFields = true, ignoreInvalidFields = true)
public class FlyWayProperties {
    private boolean enabled;
    private boolean migrate;
    private String locations;
    private String schemas;
    private boolean baselineOnMigrate;
}
