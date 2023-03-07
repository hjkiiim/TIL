package org.example.structuralPattern.bridge;

import org.example.structuralPattern.bridge.device.Device;
import org.example.structuralPattern.bridge.device.Radio;
import org.example.structuralPattern.bridge.device.Tv;
import org.example.structuralPattern.bridge.remote.AdvancedRemote;
import org.example.structuralPattern.bridge.remote.BasicRemote;

public class Main {
    public static void main(String args[]){
        testDevice(new Tv());
        testDevice(new Radio());
    }
//    리모컨 클래스와 조절 장치 사이의 분리를 볼 수 있음.
//    리모컨은 추상화, 장치들은 그에 따른 구현으로 작동.
//    공통 인터페이스 덕분에 같은 리모컨들은 다른 장치와 작동할 수 있고, 그 반대도 가능함.
    public static void testDevice(Device device){
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
