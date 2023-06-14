package org.example.structuralPattern.proxy;

import org.example.structuralPattern.proxy.downloader.Downloader;
import org.example.structuralPattern.proxy.library.ThirdPartyClass;
import org.example.structuralPattern.proxy.proxy.CacheProxy;

public class Main {
    public static void main(String[] args){
        Downloader naiveDownloader = new Downloader(new ThirdPartyClass());
        Downloader smartDownloader = new Downloader(new CacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy : " + (naive - smart) + "ms");
    }
    private static long test(Downloader downloader){
        long startTime = System.currentTimeMillis();
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");

        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed : " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
