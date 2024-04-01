package org.adaschool.tdd.exception;

public class WeatherReportNotFoundException
    extends RuntimeException
{
    private void printException(){System.out.println("Wather report not found");}

}
