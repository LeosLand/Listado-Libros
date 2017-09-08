package com.leosland.edgar.listado.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();
    private static final int COUNT = 25;
    static {
        addItem(new DummyItem("1",
                "Harry potter",
                "http://www.harrypotter.com",
                "http://3.bp.blogspot.com/-TF8bS9iO95Q/Tdhgtn3MXTI/AAAAAAAAAi4/66xBC_2W1QU/s1600/harry-potter-y-la-piedra-filosofal-poster.jpg"));
        addItem(new DummyItem("2",
                "Los Tres Mosqueteros",
                "https://es.wikisource.org/wiki/Los_tres_mosqueteros:_Cap%C3%ADtulo_I",
                "http://www.bne.es/es/Micrositios/Guias/novela_historica/resources/images/tresmosqueteros_grande.JPG"));
        addItem(new DummyItem("3",
                "Narnia Libro 1",
                "http://www.gandhi.com.mx/el-sobrino-del-mago-vol-01-cronicas-de-narnia",
                "https://images-cloud.fiuxy.com/VfysBSI.jpg"));
//    static {
//        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//        addItem(createDummyItem(i));
//        }
//    }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position),
                "Item " + position,
                makeDetails(position),
                String.valueOf(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String Book_name;
        public final String Buyable_link;
        public final String Book_imagen;

        public DummyItem(String id, String Book_name, String Buyable_link, String Book_imagen) {
            this.id = id;
            this.Book_name = Book_name;
            this.Buyable_link = Buyable_link;
            this.Book_imagen=Book_imagen;
        }

        @Override
        public String toString() {
            return Book_name;
        }
    }
}
