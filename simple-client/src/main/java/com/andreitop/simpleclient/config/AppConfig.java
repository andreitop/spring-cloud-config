package com.andreitop.simpleclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class AppConfig {
    @Value("${info.app.name}")
    private String appName;
    @Value("${info.version.lastbuild}")
    private String lastBuild;
    @Value("${info.version.lastupdate}")
    private String lastUpdate;

    public String getFullInfo() {
        return "Full app info: app name=[" + appName + "], lastbuild=[" + lastBuild
                + "], lastupdate=[" + lastUpdate + "]";
    }
}
