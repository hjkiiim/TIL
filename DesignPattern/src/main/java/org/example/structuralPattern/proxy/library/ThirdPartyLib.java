package org.example.structuralPattern.proxy.library;

import java.util.HashMap;

public interface ThirdPartyLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
