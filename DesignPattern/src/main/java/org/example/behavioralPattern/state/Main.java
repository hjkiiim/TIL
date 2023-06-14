package org.example.behavioralPattern.state;

import org.example.behavioralPattern.state.ui.Player;
import org.example.behavioralPattern.state.ui.UI;

public class Main {
    public static void main(String[] args){
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
