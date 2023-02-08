package com.wrtecnologia.jobs.dsnjobs.utils;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Component
public class AppHealth implements HealthIndicator {

    protected static final Map<String, Object> map = new HashMap<>();

    @Override
    public Health health() {
        return Health.up().withDetails(map).build();
    }

    @PostConstruct
    public void init() {
        map.put("dataHoraSubidaApp", dataHora());
    }

    private String dataHora() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss");
        return date.format(formatters);
    }

}