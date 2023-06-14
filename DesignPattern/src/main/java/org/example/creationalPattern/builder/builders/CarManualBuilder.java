package org.example.creationalPattern.builder.builders;

import org.example.creationalPattern.builder.cars.CarType;
import org.example.creationalPattern.builder.cars.Manual;
import org.example.creationalPattern.builder.component.Engine;
import org.example.creationalPattern.builder.component.GPSNavigator;
import org.example.creationalPattern.builder.component.Transmission;
import org.example.creationalPattern.builder.component.TripComputer;

public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    public void setCarType(CarType type){
        this.type = type;
    }
    @Override
    public void setSeats(int seats){
        this.seats = seats;
    }
    @Override
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    @Override
    public void setTransmission(Transmission transmission){
        this.transmission = transmission;
    }
    @Override
    public void setTripComputer(TripComputer tripComputer){
        this.tripComputer = tripComputer;
    }
    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator){
        this.gpsNavigator = gpsNavigator;
    }
    public Manual getResult(){
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
