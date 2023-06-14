package org.example.structuralPattern.bridge.remote;

import org.example.structuralPattern.bridge.device.Device;

// 선택 사항
public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device){
        super.device = device;
    }
    public void mute(){
        System.out.println("Remote : mute");
        device.setVolume(0);
    }
}
