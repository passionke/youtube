package com.passionke.youtube.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by passionke on 16/1/3.
 * wanliang@wacai.com
 */
@Component
@ConfigurationProperties(prefix="command")
@Data
public class CommanderConfig {
    private String template;
}
