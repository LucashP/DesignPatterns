package com.howtodoinjava.patterns.singleton;

final class LazySingleton {
    private static volatile LazySingleton instance = null;

    // private constructor
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                try {
                    Thread.sleep(new Double(Math.random() * 1000).intValue());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new LazySingleton();
            }
        }
        return instance;
    }
}

final class SlowLazySingleton {
    private static volatile SlowLazySingleton instance = null;

    // private constructor
    private SlowLazySingleton() {
    }

    public static SlowLazySingleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(new Double(Math.random() * 1000).intValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (SlowLazySingleton.class) {
                instance = new SlowLazySingleton();
            }
        }
        return instance;
    }
}

final class ThreadSafeLazySingleton {
    private static volatile ThreadSafeLazySingleton instance = null;

    // private constructor
    private ThreadSafeLazySingleton() {
    }

    public static ThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(new Double(Math.random() * 1000).intValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (ThreadSafeLazySingleton.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(new Double(Math.random() * 1000).intValue());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new ThreadSafeLazySingleton();
                }
            }
        }
        return instance;
    }
}

class LazySingletonCreator implements Runnable {

    @Override
    public void run() {
        SlowLazySingleton slowLazySingleton = SlowLazySingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ThreadSafeLazySingleton threadSafeLazySingleton = ThreadSafeLazySingleton.getInstance();
        System.out.println(slowLazySingleton + " " + lazySingleton + " " + threadSafeLazySingleton);

    }
}
