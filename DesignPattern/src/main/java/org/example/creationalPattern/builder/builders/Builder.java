package org.example.creationalPattern.builder.builders;

import org.example.creationalPattern.builder.cars.CarType;
import org.example.creationalPattern.builder.component.Engine;
import org.example.creationalPattern.builder.component.GPSNavigator;
import org.example.creationalPattern.builder.component.Transmission;
import org.example.creationalPattern.builder.component.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
