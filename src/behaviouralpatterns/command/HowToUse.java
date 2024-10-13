package behaviouralpatterns.command;

import behaviouralpatterns.command.commandframework.CompositeCommand;
import behaviouralpatterns.command.gui.Button;
import behaviouralpatterns.command.commandframework.CreateUserCommand;
import behaviouralpatterns.command.commandframework.KafkaProducerCommand;

import java.util.*;

public class HowToUse {
    public static void main(String[] args) {
        Button createUserButton = new Button(new CreateUserCommand());
        createUserButton.click();

        Button kafkaProducerButton = new Button(new KafkaProducerCommand());
        kafkaProducerButton.click();


        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(new CreateUserCommand());
        compositeCommand.addCommand(new KafkaProducerCommand());
        Button createUserAndKafkaProduceButton = new Button(compositeCommand);
        createUserAndKafkaProduceButton.click();
    }
}


class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Map<Integer,Integer> towerHeightMap = new HashMap<>();
        int currentMaxHeight = 0;
        for(int i :maximumHeight){
            if(!towerHeightMap.containsKey(i)){
                towerHeightMap.put(i,0);
            }
            towerHeightMap.put(i,towerHeightMap.get(i)+1);

            currentMaxHeight = Math.max(currentMaxHeight,i);
        }
        System.out.println(towerHeightMap + " " + currentMaxHeight);

        System.out.println();

        long totalMaxTowerHeightSum = 0;
        while (currentMaxHeight>0){
            if(towerHeightMap.containsKey(currentMaxHeight)){
                    totalMaxTowerHeightSum += currentMaxHeight;
                    towerHeightMap.put(
                            currentMaxHeight-1,
                            towerHeightMap.getOrDefault(currentMaxHeight-1,0)  + towerHeightMap.get(currentMaxHeight) - 1
                    );
                    towerHeightMap.remove(currentMaxHeight);
            }
            System.out.println(towerHeightMap + " " + currentMaxHeight);

            currentMaxHeight--;
        }

        towerHeightMap.remove(0);

        if(towerHeightMap.isEmpty()){
            return totalMaxTowerHeightSum;
        }
        else {
            return -1;
        }
    }
}