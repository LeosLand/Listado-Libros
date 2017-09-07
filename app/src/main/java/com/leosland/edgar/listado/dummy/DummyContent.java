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

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
        //addItem(createDummyItem(i));
        }
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
        static{
            addItem(new DummyItem("1",
                    "HarryPotter 1",
                    "https://www.7novels.com/harry-potter-and-the-philosophers-stone/chapter-1-the-boy-who-lived-67685.html",
                    "https://www.google.com.mx/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&ved=0ahUKEwiWk5rln4_WAhVCxVQKHS17Ds0QjRwIBw&url=http%3A%2F%2Felfinal-delahistoria.blogspot.com%2F2011%2F05%2Fresena-pelicula-harry-potter-y-la_27.html&psig=AFQjCNHJoCrtDbwikWGbHJYOa--dTcBxcA&ust=1504742234124483"));
            addItem(new DummyItem("2",
                    "Narnia 1","http://2novels.net/the-lion-the-witch-and-the-wardrobe/chapter-one-136273.html",
                    "https://www.google.com.mx/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwior5KGoI_WAhVnh1QKHfT-AdwQjRwIBw&url=http%3A%2F%2Frippygqharrison.blogspot.com%2F2010%2F06%2Fnarnia-1.html&psig=AFQjCNEcBnjE4_vDVQjXMlzKzfrUMQK50A&ust=1504742303882719"));
            addItem(new DummyItem("3",
                    "DonQuijote 1 y 2","http://www.donquijote.org/spanishlanguage/literature/library/quijote/",
                    "https://www.google.com.mx/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwivldORoI_WAhUhrFQKHeRMAi4QjRwIBw&url=https%3A%2F%2Fwww.umanitoba.ca%2Foutreach%2Fcm%2Fvol13%2Fno7%2Ftalesofdon.html&psig=AFQjCNHtn-E0ZQ7udSSPBbkrjua7WM3M8Q&ust=1504742325666050"));
        }
    }
}
