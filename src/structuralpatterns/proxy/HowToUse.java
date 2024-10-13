package structuralpatterns.proxy;

public class HowToUse {
    public static void main(String[] args) {
        Ebook cppIntroBook = new Ebook("Introduction to C++");
        Ebook cppIntroBook1 = new Ebook("Introduction to C++");
        Ebook ncert10thMathBook = new Ebook("NCERT 10th Math Book");
        Ebook ncert10thMathBook1 = new Ebook("NCERT 10th Math Book");

        cppIntroBook.getBookContents();
        cppIntroBook1.getBookContents();
        ncert10thMathBook.getBookContents();
        ncert10thMathBook1.getBookContents();

        System.out.println();

        Ebook cppIntroBookCache =  new EbookCacheProxy("Introduction to C++");
        Ebook cppIntroBook1Cache =  new EbookCacheProxy("Introduction to C++");
        Ebook ncert10thMathBookCache =  new EbookCacheProxy("NCERT 10th Math Book");
        Ebook ncert10thMathBook1Cache =  new EbookCacheProxy("NCERT 10th Math Book");

        cppIntroBookCache.getBookContents();
        cppIntroBook1Cache.getBookContents();
        ncert10thMathBookCache.getBookContents();
        ncert10thMathBook1Cache.getBookContents();
    }
}
