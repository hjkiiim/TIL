package org.example.structuralPattern.proxy.downloader;

import org.example.structuralPattern.proxy.library.ThirdPartyLib;
import org.example.structuralPattern.proxy.library.Video;

import java.util.HashMap;

public class Downloader {
    private ThirdPartyLib api;
    public Downloader(ThirdPartyLib api){
        this.api = api;
    }
    public void renderVideoPage(String videoId){
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }
    public void renderPopularVideos(){
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()){
            System.out.println("ID : " + video.id + " | TITLE : " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
