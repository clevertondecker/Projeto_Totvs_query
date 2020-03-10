package br.com.totvs.sistemaescolar.query.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "sistemaescolar", ignoreUnknownFields = true, ignoreInvalidFields = true)
public class SistemaescolarProperties {

    private SwaggerProperties swagger;

    @Data
    public static class SwaggerProperties {

        private boolean enabled;
        private Oauth2Properties oauth2;

        @Data
        static class Oauth2Properties {

            private String clientId;
            private String clientSecret;
            private String authServer;
        }
    }
}
