package org.example.creationalPattern.singleton;

public class Main {
    public static void main(String[] args) {
        // 기본 싱글턴
        // 단일 스레드
        /*System.out.println("Result : \n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anoterSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anoterSingleton.value);*/

        // 멀티 스레드 & 지연 로딩이 있는 스레드로부터 안전한 싱글턴
        System.out.println("Result : \n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();


    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run(){
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton + " | " + singleton.value);
        }
    }
    static class ThreadBar implements Runnable{
        @Override
        public void run(){
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton + " | " + singleton.value);
        }
    }
}