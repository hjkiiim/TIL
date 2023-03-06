package org.example.creationalPattern.singleton;
public final class Singleton{
    private static volatile Singleton instance;
    public String value;

    /*
    // 기본 싱글턴
    private static Singleton instance;

    private Singleton(String value){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }*/

    // 지연 로딩이 있는 스레드로부터 안전한 싱글턴
    private Singleton(String value){
        this.value = value;
    }
    public static Singleton getInstance(String value){
        Singleton result = instance;
        if(result != null){
            return result;
        }
        synchronized (Singleton.class){
            if(instance == null){
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}