package structuralpatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class EbookCacheProxy extends Ebook {

    private static final Map<String,byte[]> ebookContentsCacheMap = new HashMap<>();
    public EbookCacheProxy(String bookName) {
        super(bookName);
    }

    @Override
    public byte[] getBookContents() {
        if(!ebookContentsCacheMap.containsKey(getBookName())){
            ebookContentsCacheMap.put(getBookName(),super.getBookContents());
        }
        return ebookContentsCacheMap.get(getBookName());
    }
}
