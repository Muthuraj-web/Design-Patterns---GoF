package structuralpatterns.decorator;

import java.util.Arrays;

public class CloudDataSaveStream implements Stream{
    @Override
    public void write(byte[] data) {
        System.out.printf("Saving data %s \n", Arrays.toString(data));
        //Logic to Write Data into Cloud
    }
}
