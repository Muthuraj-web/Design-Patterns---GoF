package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.monitor.Monitor;
import creationalpatterns.abstractfactory.mouse.Mouse;
import creationalpatterns.abstractfactory.pc.ApplePC;
import creationalpatterns.abstractfactory.pc.PC;

import java.util.Arrays;

public class HowToUse implements Cloneable {
    public static void main(String[] args) {
        /*
            I am going to Buy a ApplePC I don't know about their parts and brands and what implementations
            Apple is Using I Want to Play around with Them
         */

        /*
            Often We Can see Factory pattern arises at start level as product matures with features
            There comes a need to align them into Abstract Factories
         */

        PC applePC = PCFactory.getNewPCInstance("apple");
        Mouse mouseOfApplePC = applePC.getMouse();
        Monitor monitorOfApplePC = applePC.getMonitor();


        System.out.format("My Mouse is Wireless {0} , Dimension of My Apple Monitor is {1}",
                mouseOfApplePC.isWireless(), Arrays.toString(monitorOfApplePC.getDimension()));


    }
}
