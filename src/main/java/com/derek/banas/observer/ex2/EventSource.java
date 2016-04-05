package com.derek.banas.observer.ex2;

import java.util.Observable;
import java.util.Scanner;

public class EventSource extends Observable implements Runnable {
    public void run() {
	while (true) {
	    String response = new Scanner(System.in).next();
	    setChanged();
	    notifyObservers(response);
	}
    }
}
