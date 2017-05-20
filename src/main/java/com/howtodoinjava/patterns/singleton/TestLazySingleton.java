package com.howtodoinjava.patterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestLazySingleton {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new LazySingletonCreator());
        executorService.execute(new LazySingletonCreator());
        executorService.execute(new LazySingletonCreator());
        executorService.execute(new LazySingletonCreator());
        executorService.execute(new LazySingletonCreator());
        executorService.execute(new LazySingletonCreator());
        executorService.execute(new LazySingletonCreator());
        executorService.execute(new LazySingletonCreator());
        executorService.execute(new LazySingletonCreator());
        executorService.execute(new LazySingletonCreator());

        executorService.shutdown();
    }
}
