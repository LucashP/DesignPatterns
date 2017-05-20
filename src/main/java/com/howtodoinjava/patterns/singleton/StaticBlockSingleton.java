package com.howtodoinjava.patterns.singleton;

class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    static {
        try {
            try {
                Thread.sleep(new Double(Math.random() * 1000).intValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Uffff, i was not expecting this!", e);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

    private StaticBlockSingleton() {
        // ...
    }
}

class StaticBlockSingletonCreator implements Runnable {

    @Override
    public void run() {
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        System.out.println(staticBlockSingleton);
    }
}
