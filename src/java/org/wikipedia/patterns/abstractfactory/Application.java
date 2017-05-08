package org.wikipedia.patterns.abstractfactory;


abstract class GUIFactory {
    public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }

    private static int readFromConfigFile(String osType) {
        return (int) Math.random() * 2;
    }

    public abstract Button createButton();
}


class WinFactory extends GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}


class OSXFactory extends GUIFactory {
    public Button createButton() {
        return new OSXButton();
    }
}


abstract class Button {
    public abstract void paint();
}


class WinButton extends Button {
    public void paint() {
        System.out.println("Przycisk WinButton");
    }
}


class OSXButton extends Button {
    public void paint() {
        System.out.println("Przycisk OSXButton");
    }
}

public class Application {
    public static void main(String[] args) {
        GUIFactory factory = GUIFactory.getFactory();
        Button button = factory.createButton();
        button.paint();
    }
    // Wyświetlony zostanie tekst:
    //   "Przycisk WinButton"
    // lub:
    //   "Przycisk OSXButton"
}
