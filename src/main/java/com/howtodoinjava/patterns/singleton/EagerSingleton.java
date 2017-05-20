package com.howtodoinjava.patterns.singleton;

class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

class SlowEagerSingleton {
    private static SlowEagerSingleton instance = new SlowEagerSingleton();

    // private constructor
    private SlowEagerSingleton() {
    }

    public static SlowEagerSingleton getInstance() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}

class EagerSingletonCreator implements Runnable {

    @Override
    public void run() {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        SlowEagerSingleton slowEagerSingleton = SlowEagerSingleton.getInstance();
        System.out.println(eagerSingleton + " " + slowEagerSingleton);
    }
}
