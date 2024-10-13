package structuralpatterns.decorator;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import java.util.Arrays;

public class EncryptedCloudDataSaveDecorator implements Stream{

    private final Stream wrappedStream;

    public EncryptedCloudDataSaveDecorator(Stream wrappedStream) {
        this.wrappedStream = wrappedStream;
    }

    @Override
    public void write(byte[] data) {
        System.out.printf("Encrypting data %s \n", Arrays.toString(data));
        if(wrappedStream!=null){
            wrappedStream.write(encryptData(data));
        }
    }


    private byte[] encryptData(byte[] data){
        //This encrypts data using some algorithm and returns the encrypted data to the callee
        return HexBin.encode(data).getBytes();
    }
}
