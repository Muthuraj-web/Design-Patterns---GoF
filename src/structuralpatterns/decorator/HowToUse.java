package structuralpatterns.decorator;

public class HowToUse {
    public static void main(String[] args) {

        byte[] data = "Sample Data".getBytes();

        //Just Saving data into cloud
        CloudDataSaveStream cloudDataSaveStream = new CloudDataSaveStream();
        cloudDataSaveStream.write(data);

        System.out.println();

        //Encrypting and saving data into cloud
        EncryptedCloudDataSaveDecorator encryptedDataSaveStreamDecorator = new EncryptedCloudDataSaveDecorator(cloudDataSaveStream);
        encryptedDataSaveStreamDecorator.write(data);

        System.out.println();

        //Logging and saving data into cloud
        LogCloudDataSaveStream logCloudDataSaveStreamDecorator = new LogCloudDataSaveStream(cloudDataSaveStream);
        logCloudDataSaveStreamDecorator.write(data);

        System.out.println();

        //Encrypting -> Logging -> saving data into cloud
        CloudDataSaveStream cloudDataSaveStream1 = new CloudDataSaveStream();
        LogCloudDataSaveStream logCloudDataSaveStreamDecorator1 = new LogCloudDataSaveStream(cloudDataSaveStream1);
        EncryptedCloudDataSaveDecorator encryptedCloudDataSaveDecorator1 = new EncryptedCloudDataSaveDecorator(logCloudDataSaveStreamDecorator1);
        encryptedCloudDataSaveDecorator1.write(data);

        System.out.println();

        //Logging -> Encrypting -> saving data into cloud
        CloudDataSaveStream cloudDataSaveStream2 = new CloudDataSaveStream();
        EncryptedCloudDataSaveDecorator encryptedCloudDataSaveDecorator2 = new EncryptedCloudDataSaveDecorator(cloudDataSaveStream2);
        LogCloudDataSaveStream logCloudDataSaveStreamDecorator2 = new LogCloudDataSaveStream(encryptedCloudDataSaveDecorator2);
        logCloudDataSaveStreamDecorator2.write(data);
    }
}
