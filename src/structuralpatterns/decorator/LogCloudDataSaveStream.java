package structuralpatterns.decorator;

import java.util.Arrays;

public class LogCloudDataSaveStream implements Stream{

    private final Stream wrappedStream;

    public LogCloudDataSaveStream(Stream wrappedStream) {
        this.wrappedStream = wrappedStream;
    }

    @Override
    public void write(byte[] data) {
        System.out.printf("logging data %s \n", Arrays.toString(data));
        if(wrappedStream!=null){
            wrappedStream.write(data);
        }
    }
}
