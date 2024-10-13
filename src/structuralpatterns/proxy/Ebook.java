package structuralpatterns.proxy;

public class Ebook {


    private final String bookName;
    public Ebook(String bookName){
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }
    public byte[] getBookContents(){
        System.out.printf("This makes a network Call to the Ebook Server for File %s to fetch the respective book which may be huge \n",bookName);
        return new byte[]{};
    }
}
