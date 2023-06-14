package org.example.structuralPattern.proxy.proxy;

import org.example.structuralPattern.proxy.library.ThirdPartyClass;
import org.example.structuralPattern.proxy.library.ThirdPartyLib;
import org.example.structuralPattern.proxy.library.Video;

import java.util.HashMap;

public class CacheProxy implements ThirdPartyLib {
    private ThirdPartyLib service;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public CacheProxy(){
        this.service = new ThirdPartyClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if(cachePopular.isEmpty()){
            cachePopular = service.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if(video == null){
            video = service.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }
    public void reset(){
        cachePopular.clear();
        cacheAll.clear();
    }
}
