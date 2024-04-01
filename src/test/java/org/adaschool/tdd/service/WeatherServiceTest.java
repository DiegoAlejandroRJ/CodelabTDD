package org.adaschool.tdd.service;

import org.adaschool.tdd.controller.weather.dto.WeatherReportDto;
import org.adaschool.tdd.repository.document.GeoLocation;
import org.adaschool.tdd.repository.document.WeatherReport;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTest {

    WeatherService weatherService;

    @Test
    void report() {
        WeatherReport weatherReport;

    }

    @Test
    void findById() {
        double lat = 4.7110;
        double lng = 74.0721;
        GeoLocation location = new GeoLocation(lat, lng);
        WeatherReport weatherReport = new WeatherReport(location, 35f, 22f, "tester", new Date());

        assertEquals(weatherReport, weatherReport);

    }
        @Test
    void findNearLocation() {
    }

    @Test
    void findWeatherReportsByName() {
    }
}