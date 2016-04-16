package spooky;

import java.time.LocalDateTime;

/**
 * Created by luigi on 09/04/16.
 */
public class Item {
    private final String _id;
    private final String name;
    private final String bestBefore;
//    private final LocalDateTime bestBefore;

    public String get_id() {
        return _id;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public String getName() {
        return name;
    }

    public Item(String _id, String name, String bestBefore) {
        this._id = _id;
        this.name = name;
        this.bestBefore = bestBefore;
    }

}
